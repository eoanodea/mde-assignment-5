/**
 */
package system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.paragraph#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getparagraph()
 * @model
 * @generated
 */
public interface paragraph extends Content {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see system.SystemPackage#getparagraph_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link system.paragraph#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // paragraph
