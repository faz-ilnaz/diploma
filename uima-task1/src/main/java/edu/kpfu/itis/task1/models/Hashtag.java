

/* First created by JCasGen Fri Feb 12 20:55:50 MSK 2016 */
package edu.kpfu.itis.task1.models;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Feb 12 20:55:50 MSK 2016
 * XML source: C:/Users/ilnaz/workspace/uima-task1/src/main/resources/Task1TypeSystem.xml
 * @generated */
public class Hashtag extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Hashtag.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Hashtag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Hashtag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Hashtag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Hashtag(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: hashtag

  /** getter for hashtag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHashtag() {
    if (Hashtag_Type.featOkTst && ((Hashtag_Type)jcasType).casFeat_hashtag == null)
      jcasType.jcas.throwFeatMissing("hashtag", "edu.kpfu.itis.task1.models.Hashtag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Hashtag_Type)jcasType).casFeatCode_hashtag);}
    
  /** setter for hashtag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHashtag(String v) {
    if (Hashtag_Type.featOkTst && ((Hashtag_Type)jcasType).casFeat_hashtag == null)
      jcasType.jcas.throwFeatMissing("hashtag", "edu.kpfu.itis.task1.models.Hashtag");
    jcasType.ll_cas.ll_setStringValue(addr, ((Hashtag_Type)jcasType).casFeatCode_hashtag, v);}    
  }

    