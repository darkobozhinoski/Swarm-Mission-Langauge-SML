/**
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.missionSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.Condition#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends BooleanExpression
{
  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(Attribute)
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getCondition_Attr()
   * @model containment="true"
   * @generated
   */
  Attribute getAttr();

  /**
   * Sets the value of the '{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.Condition#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(Attribute value);

} // Condition