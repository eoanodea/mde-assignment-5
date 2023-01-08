/**
 */
package system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import system.S_Index;
import system.S_Individual;
import system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIndex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.S_IndexImpl#getS_individual <em>Sindividual</em>}</li>
 *   <li>{@link system.impl.S_IndexImpl#getS_Index_identifier <em>SIndex identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class S_IndexImpl extends Static_ContentImpl implements S_Index {
	/**
	 * The cached value of the '{@link #getS_individual() <em>Sindividual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS_individual()
	 * @generated
	 * @ordered
	 */
	protected EList<S_Individual> s_individual;

	/**
	 * The default value of the '{@link #getS_Index_identifier() <em>SIndex identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS_Index_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SINDEX_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS_Index_identifier() <em>SIndex identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS_Index_identifier()
	 * @generated
	 * @ordered
	 */
	protected String s_Index_identifier = SINDEX_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected S_IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.SINDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<S_Individual> getS_individual() {
		if (s_individual == null) {
			s_individual = new EObjectContainmentEList<S_Individual>(S_Individual.class, this, SystemPackage.SINDEX__SINDIVIDUAL);
		}
		return s_individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_Index_identifier() {
		return s_Index_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_Index_identifier(String newS_Index_identifier) {
		String oldS_Index_identifier = s_Index_identifier;
		s_Index_identifier = newS_Index_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.SINDEX__SINDEX_IDENTIFIER, oldS_Index_identifier, s_Index_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.SINDEX__SINDIVIDUAL:
				return ((InternalEList<?>)getS_individual()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.SINDEX__SINDIVIDUAL:
				return getS_individual();
			case SystemPackage.SINDEX__SINDEX_IDENTIFIER:
				return getS_Index_identifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.SINDEX__SINDIVIDUAL:
				getS_individual().clear();
				getS_individual().addAll((Collection<? extends S_Individual>)newValue);
				return;
			case SystemPackage.SINDEX__SINDEX_IDENTIFIER:
				setS_Index_identifier((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SystemPackage.SINDEX__SINDIVIDUAL:
				getS_individual().clear();
				return;
			case SystemPackage.SINDEX__SINDEX_IDENTIFIER:
				setS_Index_identifier(SINDEX_IDENTIFIER_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SystemPackage.SINDEX__SINDIVIDUAL:
				return s_individual != null && !s_individual.isEmpty();
			case SystemPackage.SINDEX__SINDEX_IDENTIFIER:
				return SINDEX_IDENTIFIER_EDEFAULT == null ? s_Index_identifier != null : !SINDEX_IDENTIFIER_EDEFAULT.equals(s_Index_identifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (S_Index_identifier: ");
		result.append(s_Index_identifier);
		result.append(')');
		return result.toString();
	}

} //S_IndexImpl
