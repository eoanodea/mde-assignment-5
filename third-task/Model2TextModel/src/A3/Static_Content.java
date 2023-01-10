/**
 */
package A3;

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
 *   <li>{@link A3.Static_Content#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see A3.A3Package#getStatic_Content()
 * @model
 * @generated
 */
public interface Static_Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link A3.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see A3.DataType
	 * @see #setType(DataType)
	 * @see A3.A3Package#getStatic_Content_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link A3.Static_Content#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see A3.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Static_Content
