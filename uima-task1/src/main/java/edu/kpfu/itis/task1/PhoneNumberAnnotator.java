package edu.kpfu.itis.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

public class PhoneNumberAnnotator extends JCasAnnotator_ImplBase {
	
	private Pattern phoneNumberPattern = Pattern.compile("((8)|(\\+7))*[\\d]{10}");

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// get document text
	    String docText = aJCas.getDocumentText();
	    // search for phone numbers
	    Matcher matcher = phoneNumberPattern.matcher(docText);
	    while (matcher.find()) {
	      // found one - create annotation
	      PhoneNumber annotation = new PhoneNumber(aJCas);
	      annotation.setBegin(matcher.start());
	      annotation.setEnd(matcher.end());
	      annotation.setPhoneNumber(docText.substring(annotation.getBegin(), annotation.getEnd()));
	      annotation.addToIndexes();
	    }

	}

}
