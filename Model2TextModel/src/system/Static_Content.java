/**
 */
package system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.Static_Content#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getStatic_Content()
 * @model
 * @generated
 */
public interface Static_Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link system.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see system.DataType
	 * @see #setType(DataType)
	 * @see system.SystemPackage#getStatic_Content_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link system.Static_Content#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see system.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Static_Content
