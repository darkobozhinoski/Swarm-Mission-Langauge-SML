/**
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.missionSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AfterScope#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getAfterScope()
 * @model
 * @generated
 */
public interface AfterScope extends Scope
{
  /**
   * Returns the value of the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Q</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Q</em>' containment reference.
   * @see #setQ(Proposition)
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getAfterScope_Q()
   * @model containment="true"
   * @generated
   */
  Proposition getQ();

  /**
   * Sets the value of the '{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.AfterScope#getQ <em>Q</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Q</em>' containment reference.
   * @see #getQ()
   * @generated
   */
  void setQ(Proposition value);

} // AfterScope