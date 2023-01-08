/**
 */
package system.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import system.S_Individual;
import system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIndividual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.S_IndividualImpl#getIndividual_identifier <em>Individual identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class S_IndividualImpl extends Static_ContentImpl implements S_Individual {
	/**
	 * The default value of the '{@link #getIndividual_identifier() <em>Individual identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INDIVIDUAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndividual_identifier() <em>Individual identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual_identifier()
	 * @generated
	 * @ordered
	 */
	protected BigInteger individual_identifier = INDIVIDUAL_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected S_IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.SINDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIndividual_identifier() {
		return individual_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividual_identifier(BigInteger newIndividual_identifier) {
		BigInteger oldIndividual_identifier = individual_identifier;
		individual_identifier = newIndividual_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.SINDIVIDUAL__INDIVIDUAL_IDENTIFIER, oldIndividual_identifier, individual_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.SINDIVIDUAL__INDIVIDUAL_IDENTIFIER:
				return getIndividual_identifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.SINDIVIDUAL__INDIVIDUAL_IDENTIFIER:
				setIndividual_identifier((BigInteger)newValue);
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
			case SystemPackage.SINDIVIDUAL__INDIVIDUAL_IDENTIFIER:
				setIndividual_identifier(INDIVIDUAL_IDENTIFIER_EDEFAULT);
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
			case SystemPackage.SINDIVIDUAL__INDIVIDUAL_IDENTIFIER:
				return INDIVIDUAL_IDENTIFIER_EDEFAULT == null ? individual_identifier != null : !INDIVIDUAL_IDENTIFIER_EDEFAULT.equals(individual_identifier);
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
		result.append(" (Individual_identifier: ");
		result.append(individual_identifier);
		result.append(')');
		return result.toString();
	}

} //S_IndividualImpl
