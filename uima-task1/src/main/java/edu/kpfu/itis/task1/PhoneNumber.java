

/* First created by JCasGen Sat Feb 06 22:43:09 MSK 2016 */
package edu.kpfu.itis.task1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Feb 06 22:43:09 MSK 2016
 * XML source: C:/Users/ilnaz/workspace/uima-task1/src/main/resources/Task1TypeSystem.xml
 * @generated */
public class PhoneNumber extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PhoneNumber.class);
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
  protected PhoneNumber() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PhoneNumber(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PhoneNumber(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public PhoneNumber(JCas jcas, int begin, int end) {
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
  //* Feature: phoneNumber

  /** getter for phoneNumber - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPhoneNumber() {
    if (PhoneNumber_Type.featOkTst && ((PhoneNumber_Type)jcasType).casFeat_phoneNumber == null)
      jcasType.jcas.throwFeatMissing("phoneNumber", "edu.kpfu.itis.task1.PhoneNumber");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PhoneNumber_Type)jcasType).casFeatCode_phoneNumber);}
    
  /** setter for phoneNumber - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhoneNumber(String v) {
    if (PhoneNumber_Type.featOkTst && ((PhoneNumber_Type)jcasType).casFeat_phoneNumber == null)
      jcasType.jcas.throwFeatMissing("phoneNumber", "edu.kpfu.itis.task1.PhoneNumber");
    jcasType.ll_cas.ll_setStringValue(addr, ((PhoneNumber_Type)jcasType).casFeatCode_phoneNumber, v);}    
  }

    