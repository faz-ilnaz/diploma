

/* First created by JCasGen Tue Feb 09 19:38:23 MSK 2016 */
package edu.kpfu.itis.task1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Feb 09 19:38:23 MSK 2016
 * XML source: C:/Users/ilnaz/workspace/uima-task1/src/main/resources/Task1TypeSystem.xml
 * @generated */
public class Email extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Email.class);
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
  protected Email() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Email(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Email(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Email(JCas jcas, int begin, int end) {
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
  //* Feature: emailAddress

  /** getter for emailAddress - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEmailAddress() {
    if (Email_Type.featOkTst && ((Email_Type)jcasType).casFeat_emailAddress == null)
      jcasType.jcas.throwFeatMissing("emailAddress", "edu.kpfu.itis.task1.Email");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Email_Type)jcasType).casFeatCode_emailAddress);}
    
  /** setter for emailAddress - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmailAddress(String v) {
    if (Email_Type.featOkTst && ((Email_Type)jcasType).casFeat_emailAddress == null)
      jcasType.jcas.throwFeatMissing("emailAddress", "edu.kpfu.itis.task1.Email");
    jcasType.ll_cas.ll_setStringValue(addr, ((Email_Type)jcasType).casFeatCode_emailAddress, v);}    
  }

    