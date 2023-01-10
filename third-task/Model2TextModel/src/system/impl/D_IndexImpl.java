/**
 */
package system.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import system.D_Index;
import system.D_Individual;
import system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DIndex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.D_IndexImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link system.impl.D_IndexImpl#getIndex_identifier <em>Index identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class D_IndexImpl extends D_ContentImpl implements D_Index {
	/**
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<D_Individual> individual;

	/**
	 * The default value of the '{@link #getIndex_identifier() <em>Index identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INDEX_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex_identifier() <em>Index identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex_identifier()
	 * @generated
	 * @ordered
	 */
	protected BigInteger index_identifier = INDEX_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected D_IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.DINDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<D_Individual> getIndividual() {
		if (individual == null) {
			individual = new EObjectContainmentEList<D_Individual>(D_Individual.class, this, SystemPackage.DINDEX__INDIVIDUAL);
		}
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIndex_identifier() {
		return index_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex_identifier(BigInteger newIndex_identifier) {
		BigInteger oldIndex_identifier = index_identifier;
		index_identifier = newIndex_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.DINDEX__INDEX_IDENTIFIER, oldIndex_identifier, index_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.DINDEX__INDIVIDUAL:
				return ((InternalEList<?>)getIndividual()).basicRemove(otherEnd, msgs);
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
			case SystemPackage.DINDEX__INDIVIDUAL:
				return getIndividual();
			case SystemPackage.DINDEX__INDEX_IDENTIFIER:
				return getIndex_identifier();
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
			case SystemPackage.DINDEX__INDIVIDUAL:
				getIndividual().clear();
				getIndividual().addAll((Collection<? extends D_Individual>)newValue);
				return;
			case SystemPackage.DINDEX__INDEX_IDENTIFIER:
				setIndex_identifier((BigInteger)newValue);
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
			case SystemPackage.DINDEX__INDIVIDUAL:
				getIndividual().clear();
				return;
			case SystemPackage.DINDEX__INDEX_IDENTIFIER:
				setIndex_identifier(INDEX_IDENTIFIER_EDEFAULT);
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
			case SystemPackage.DINDEX__INDIVIDUAL:
				return individual != null && !individual.isEmpty();
			case SystemPackage.DINDEX__INDEX_IDENTIFIER:
				return INDEX_IDENTIFIER_EDEFAULT == null ? index_identifier != null : !INDEX_IDENTIFIER_EDEFAULT.equals(index_identifier);
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
		result.append(" (Index_identifier: ");
		result.append(index_identifier);
		result.append(')');
		return result.toString();
	}

} //D_IndexImpl
