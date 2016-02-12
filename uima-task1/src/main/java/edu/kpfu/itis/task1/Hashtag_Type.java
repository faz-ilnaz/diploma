
/* First created by JCasGen Fri Feb 12 20:55:50 MSK 2016 */
package edu.kpfu.itis.task1;

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
 * Updated by JCasGen Fri Feb 12 20:55:50 MSK 2016
 * @generated */
public class Hashtag_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Hashtag_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Hashtag_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Hashtag(addr, Hashtag_Type.this);
  			   Hashtag_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Hashtag(addr, Hashtag_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Hashtag.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.kpfu.itis.task1.Hashtag");
 
  /** @generated */
  final Feature casFeat_hashtag;
  /** @generated */
  final int     casFeatCode_hashtag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHashtag(int addr) {
        if (featOkTst && casFeat_hashtag == null)
      jcas.throwFeatMissing("hashtag", "edu.kpfu.itis.task1.Hashtag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_hashtag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHashtag(int addr, String v) {
        if (featOkTst && casFeat_hashtag == null)
      jcas.throwFeatMissing("hashtag", "edu.kpfu.itis.task1.Hashtag");
    ll_cas.ll_setStringValue(addr, casFeatCode_hashtag, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Hashtag_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_hashtag = jcas.getRequiredFeatureDE(casType, "hashtag", "uima.cas.String", featOkTst);
    casFeatCode_hashtag  = (null == casFeat_hashtag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hashtag).getCode();

  }
}



    