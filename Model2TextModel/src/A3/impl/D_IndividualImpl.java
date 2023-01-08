/**
 */
package A3.impl;

import A3.A3Package;
import A3.D_Individual;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DIndividual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link A3.impl.D_IndividualImpl#getIndividual_identifier <em>Individual identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class D_IndividualImpl extends D_ContentImpl implements D_Individual {
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
	protected D_IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3Package.Literals.DINDIVIDUAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, A3Package.DINDIVIDUAL__INDIVIDUAL_IDENTIFIER, oldIndividual_identifier, individual_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A3Package.DINDIVIDUAL__INDIVIDUAL_IDENTIFIER:
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
			case A3Package.DINDIVIDUAL__INDIVIDUAL_IDENTIFIER:
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
			case A3Package.DINDIVIDUAL__INDIVIDUAL_IDENTIFIER:
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
			case A3Package.DINDIVIDUAL__INDIVIDUAL_IDENTIFIER:
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

} //D_IndividualImpl
