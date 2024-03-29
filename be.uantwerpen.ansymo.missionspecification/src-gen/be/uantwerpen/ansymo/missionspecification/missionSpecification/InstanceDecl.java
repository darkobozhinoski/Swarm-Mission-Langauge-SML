/**
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.missionSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.InstanceDecl#getType <em>Type</em>}</li>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.InstanceDecl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getInstanceDecl()
 * @model
 * @generated
 */
public interface InstanceDecl extends Instance
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getInstanceDecl_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.InstanceDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage#getInstanceDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.InstanceDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // InstanceDecl
