/**
 */
package A3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link A3.Feature#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 * </ul>
 *
 * @see A3.A3Package#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends Named {
	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(boolean)
	 * @see A3.A3Package#getFeature_IsPrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPrimaryKey();

	/**
	 * Sets the value of the '{@link A3.Feature#isIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #isIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(boolean value);

} // Feature
