
/* First created by JCasGen Tue Feb 09 19:38:23 MSK 2016 */
package edu.kpfu.itis.task1.models;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Feb 09 19:38:23 MSK 2016
 * @generated */
public class Email_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Email_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Email_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Email(addr, Email_Type.this);
  			   Email_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Email(addr, Email_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Email.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.kpfu.itis.task1.models.Email");
 
  /** @generated */
  final Feature casFeat_emailAddress;
  /** @generated */
  final int     casFeatCode_emailAddress;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEmailAddress(int addr) {
        if (featOkTst && casFeat_emailAddress == null)
      jcas.throwFeatMissing("emailAddress", "edu.kpfu.itis.task1.models.Email");
    return ll_cas.ll_getStringValue(addr, casFeatCode_emailAddress);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEmailAddress(int addr, String v) {
        if (featOkTst && casFeat_emailAddress == null)
      jcas.throwFeatMissing("emailAddress", "edu.kpfu.itis.task1.models.Email");
    ll_cas.ll_setStringValue(addr, casFeatCode_emailAddress, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Email_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_emailAddress = jcas.getRequiredFeatureDE(casType, "emailAddress", "uima.cas.String", featOkTst);
    casFeatCode_emailAddress  = (null == casFeat_emailAddress) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_emailAddress).getCode();

  }
}



    