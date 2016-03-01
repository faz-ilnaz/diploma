package edu.kpfu.itis.task1;

import org.apache.uima.UIMAFramework;
import org.apache.uima.cas.*;
import org.apache.uima.collection.CollectionProcessingEngine;
import org.apache.uima.collection.EntityProcessStatus;
import org.apache.uima.collection.StatusCallbackListener;
import org.apache.uima.collection.impl.metadata.cpe.CpeDescriptorFactory;
import org.apache.uima.collection.metadata.*;
import org.apache.uima.tools.components.FileSystemCollectionReader;
import org.apache.uima.tools.components.XmiWriterCasConsumer;
import org.apache.uima.util.AnalysisEnginePerformanceReports;

import java.io.File;
import java.net.URL;

public class RunAE implements StatusCallbackListener {

    // Values read from cmd line args
    private File inputDir = null;

    private File outputDir = null;

    int docsProcessed;

    private CollectionProcessingEngine mCPE;

    /**
     * Constructor. Sets up and runs an Analysis Engine.
     */
    public RunAE(String[] args) {
        try {
            // Read and validate command line arguments
            if (!processCmdLineArgs(args)) {
                printUsageMessage();
                return;
            }

            String outputDirPath = inputDir.getAbsolutePath() + "/processed";

            outputDir = new File(outputDirPath);

            if (!outputDir.isDirectory()) {
                boolean success = outputDir.mkdirs();
                if (success) {
                    System.out.println("Created output folder: " + outputDir.getPath());
                } else {
                    System.out.println("Could not create output folder: " + outputDir.getPath());
                }
            } else {
                System.out.println("Output folder exists: " + outputDir.getPath());
            }

            // build a Collection Processing Engine descriptor that will drive processing
            CpeDescription cpeDesc = CpeDescriptorFactory.produceDescriptor();

            // add collection reader that will read input docs
            cpeDesc.addCollectionReader(FileSystemCollectionReader.getDescriptorURL().toString());
            // specify configuration parameters for collection reader
            CasProcessorConfigurationParameterSettings crSettings = CpeDescriptorFactory
                    .produceCasProcessorConfigurationParameterSettings();
            CpeCollectionReader cpeCollRdr = cpeDesc.getAllCollectionCollectionReaders()[0];
            cpeCollRdr.setConfigurationParameterSettings(crSettings);
            crSettings.setParameterValue(FileSystemCollectionReader.PARAM_INPUTDIR, inputDir
                    .getAbsolutePath());
            crSettings.setParameterValue(FileSystemCollectionReader.PARAM_ENCODING, "UTF-8");
            crSettings.setParameterValue(FileSystemCollectionReader.PARAM_LANGUAGE, "en");

            // add user's AE to CPE
            CpeCasProcessor casProc = CpeDescriptorFactory.produceCasProcessor("UserAE");
            URL ae = getClass().getClassLoader().getResource("AggregateAE.xml");
            File aeFile = null;
            if (ae != null) {
                aeFile = new File(ae.toURI());
            } else {
                System.err.println("AE does not exist");
                System.exit(1);
            }
            CpeComponentDescriptor cpeComponentDescriptor =
                    CpeDescriptorFactory.produceComponentDescriptor(aeFile.getAbsolutePath());
            casProc.setCpeComponentDescriptor(cpeComponentDescriptor);
            casProc.setMaxErrorCount(0);
            cpeDesc.addCasProcessor(casProc);

            // add CAS Consumer that will write the output
            // create and configure CAS consumer that will write the output
            CpeCasProcessor casCon = null;
            if (outputDir != null) {
                casCon = CpeDescriptorFactory.produceCasProcessor("CasConsumer");
                cpeComponentDescriptor =
                        CpeDescriptorFactory.produceComponentDescriptor(XmiWriterCasConsumer.getDescriptorURL().toString());
                casCon.setCpeComponentDescriptor(cpeComponentDescriptor);
                CasProcessorConfigurationParameterSettings consumerSettings = CpeDescriptorFactory
                        .produceCasProcessorConfigurationParameterSettings();
                casCon.setConfigurationParameterSettings(consumerSettings);
                consumerSettings.setParameterValue(XmiWriterCasConsumer.PARAM_OUTPUTDIR, outputDir
                        .getAbsolutePath());
                casCon.setMaxErrorCount(0);
                cpeDesc.addCasProcessor(casCon);
            }

            // instantiate CPE
            mCPE = UIMAFramework.produceCollectionProcessingEngine(cpeDesc);
            // register callback listener
            mCPE.addStatusCallbackListener(this);

            // execute
            docsProcessed = 0;
            mCPE.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void initializationComplete() {
    }

    @Override
    public void entityProcessComplete(CAS aCas, EntityProcessStatus aStatus) {
        if (aStatus.isException()) {
            for (Object o : aStatus.getExceptions()) {
                ((Throwable) o).printStackTrace();
            }
        }

        // retrieve the filename of the input file from the CAS
        // (it was put there by the FileSystemCollectionReader)
        Type fileLocType = aCas.getTypeSystem().getType(
                "org.apache.uima.examples.SourceDocumentInformation");
        Feature fileNameFeat = fileLocType.getFeatureByBaseName("uri");
        FSIterator it = aCas.getAnnotationIndex(fileLocType).iterator();
        FeatureStructure fileLoc = it.get();
        File inFile = new File(fileLoc.getStringValue(fileNameFeat));
        System.out.println("Processed Document " + inFile.getName());
    }

    @Override
    public void aborted() {
        System.out.println("Processing Aborted");

    }

    @Override
    public void batchProcessComplete() {
    }

    @Override
    public void collectionProcessComplete() {
        // output performance stats
        AnalysisEnginePerformanceReports performanceReports = new AnalysisEnginePerformanceReports(
                mCPE.getPerformanceReport());
        System.out.println("\n\nPERFORMANCE STATS\n-----------------\n\n");
        System.out.println(performanceReports.getFullReport());
        System.out.println();
        System.out.println(performanceReports);
    }

    @Override
    public void paused() {
    }

    @Override
    public void resumed() {
    }

    /**
     * Prints usage message.
     */
    private void printUsageMessage() {
        System.err.println("\nUsage: java " + this.getClass().getName() + " <input dir> ");

    }

    /**
     * Reads command line arguments and sets static class variables appropriately.
     *
     * @return true if command line args were valid, false if not
     */
    private boolean processCmdLineArgs(String[] args) {
        String arg = args[0];
        if (inputDir == null) {
            inputDir = new File(arg);
            if (!inputDir.exists() || !inputDir.isDirectory()) {
                System.err.println(arg + " does not exist or is not a directory");
                System.exit(1);
            }
        }
        // make sure required values were specified
        return inputDir != null;
    }

    public static void main(String[] args) {
        new RunAE(args);
    }
}
