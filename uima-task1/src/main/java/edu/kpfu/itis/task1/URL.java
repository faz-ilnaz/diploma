

/* First created by JCasGen Fri Feb 12 21:43:38 MSK 2016 */
package edu.kpfu.itis.task1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Feb 12 21:43:38 MSK 2016
 * XML source: C:/Users/ilnaz/workspace/uima-task1/src/main/resources/Task1TypeSystem.xml
 * @generated */
public class URL extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(URL.class);
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
  protected URL() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public URL(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public URL(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public URL(JCas jcas, int begin, int end) {
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
  //* Feature: url

  /** getter for url - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUrl() {
    if (URL_Type.featOkTst && ((URL_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "edu.kpfu.itis.task1.URL");
    return jcasType.ll_cas.ll_getStringValue(addr, ((URL_Type)jcasType).casFeatCode_url);}
    
  /** setter for url - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    if (URL_Type.featOkTst && ((URL_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "edu.kpfu.itis.task1.URL");
    jcasType.ll_cas.ll_setStringValue(addr, ((URL_Type)jcasType).casFeatCode_url, v);}    
  }

    