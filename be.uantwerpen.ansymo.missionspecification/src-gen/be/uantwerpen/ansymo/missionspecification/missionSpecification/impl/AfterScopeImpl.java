/**
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.missionSpecification.impl;

import be.uantwerpen.ansymo.missionspecification.missionSpecification.AfterScope;
import be.uantwerpen.ansymo.missionspecification.missionSpecification.MissionSpecificationPackage;
import be.uantwerpen.ansymo.missionspecification.missionSpecification.Proposition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>After Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.uantwerpen.ansymo.missionspecification.missionSpecification.impl.AfterScopeImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AfterScopeImpl extends ScopeImpl implements AfterScope
{
  /**
   * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQ()
   * @generated
   * @ordered
   */
  protected Proposition q;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AfterScopeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MissionSpecificationPackage.Literals.AFTER_SCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Proposition getQ()
  {
    return q;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQ(Proposition newQ, NotificationChain msgs)
  {
    Proposition oldQ = q;
    q = newQ;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MissionSpecificationPackage.AFTER_SCOPE__Q, oldQ, newQ);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQ(Proposition newQ)
  {
    if (newQ != q)
    {
      NotificationChain msgs = null;
      if (q != null)
        msgs = ((InternalEObject)q).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MissionSpecificationPackage.AFTER_SCOPE__Q, null, msgs);
      if (newQ != null)
        msgs = ((InternalEObject)newQ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MissionSpecificationPackage.AFTER_SCOPE__Q, null, msgs);
      msgs = basicSetQ(newQ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MissionSpecificationPackage.AFTER_SCOPE__Q, newQ, newQ));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MissionSpecificationPackage.AFTER_SCOPE__Q:
        return basicSetQ(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MissionSpecificationPackage.AFTER_SCOPE__Q:
        return getQ();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MissionSpecificationPackage.AFTER_SCOPE__Q:
        setQ((Proposition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MissionSpecificationPackage.AFTER_SCOPE__Q:
        setQ((Proposition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MissionSpecificationPackage.AFTER_SCOPE__Q:
        return q != null;
    }
    return super.eIsSet(featureID);
  }

} //AfterScopeImpl