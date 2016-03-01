
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
public class PhoneNumber_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PhoneNumber_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PhoneNumber_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PhoneNumber(addr, PhoneNumber_Type.this);
  			   PhoneNumber_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PhoneNumber(addr, PhoneNumber_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PhoneNumber.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.kpfu.itis.task1.models.PhoneNumber");
 
  /** @generated */
  final Feature casFeat_phoneNumber;
  /** @generated */
  final int     casFeatCode_phoneNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPhoneNumber(int addr) {
        if (featOkTst && casFeat_phoneNumber == null)
      jcas.throwFeatMissing("phoneNumber", "edu.kpfu.itis.task1.models.PhoneNumber");
    return ll_cas.ll_getStringValue(addr, casFeatCode_phoneNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPhoneNumber(int addr, String v) {
        if (featOkTst && casFeat_phoneNumber == null)
      jcas.throwFeatMissing("phoneNumber", "edu.kpfu.itis.task1.models.PhoneNumber");
    ll_cas.ll_setStringValue(addr, casFeatCode_phoneNumber, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PhoneNumber_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_phoneNumber = jcas.getRequiredFeatureDE(casType, "phoneNumber", "uima.cas.String", featOkTst);
    casFeatCode_phoneNumber  = (null == casFeat_phoneNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phoneNumber).getCode();

  }
}



    