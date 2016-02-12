package edu.kpfu.itis.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.AnalysisComponent;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;

public class URLAnnotator extends JCasAnnotator_ImplBase {
	
	private Pattern[] mPatterns;
	
	/**
	   * @see AnalysisComponent#initialize(UimaContext)
	   */
	  public void initialize(UimaContext aContext) throws ResourceInitializationException {
	    super.initialize(aContext);
	    // Get config. parameter values
	    String[] patternStrings = (String[]) aContext.getConfigParameterValue("Patterns");
	    
	    // compile regular expressions
	    mPatterns = new Pattern[patternStrings.length];
	    for (int i = 0; i < patternStrings.length; i++) {
	      mPatterns[i] = Pattern.compile(patternStrings[i]);
	    }
	  }

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// get document text
	    String docText = aJCas.getDocumentText();
	    
	    // loop over patterns
	    for (int i = 0; i < mPatterns.length; i++) {
	      Matcher matcher = mPatterns[i].matcher(docText);
	      while (matcher.find()) {
	        // found one - create annotation
	    	URL annotation = new URL(aJCas);
	        annotation.setBegin(matcher.start());
	        annotation.setEnd(matcher.end());
	        annotation.addToIndexes();
	        annotation.setUrl(docText.substring(annotation.getBegin(), annotation.getEnd()));
	        getContext().getLogger().log(Level.FINEST, "Found: " + annotation);
	      }
	    }
	}

}
