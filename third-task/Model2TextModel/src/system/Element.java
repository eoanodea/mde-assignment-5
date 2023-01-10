/**
 */
package system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.Element#getLabel <em>Label</em>}</li>
 *   <li>{@link system.Element#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends Named {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see system.SystemPackage#getElement_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link system.Element#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' reference.
	 * @see #setAttr(Attribute)
	 * @see system.SystemPackage#getElement_Attr()
	 * @model
	 * @generated
	 */
	Attribute getAttr();

	/**
	 * Sets the value of the '{@link system.Element#getAttr <em>Attr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr</em>' reference.
	 * @see #getAttr()
	 * @generated
	 */
	void setAttr(Attribute value);

} // Element
