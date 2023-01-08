/**
 */
package system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.DynamicContent#getEntity <em>Entity</em>}</li>
 *   <li>{@link system.DynamicContent#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getDynamicContent()
 * @model
 * @generated
 */
public interface DynamicContent extends Content {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see system.SystemPackage#getDynamicContent_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link system.DynamicContent#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' reference.
	 * @see #setAttr(Attribute)
	 * @see system.SystemPackage#getDynamicContent_Attr()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttr();

	/**
	 * Sets the value of the '{@link system.DynamicContent#getAttr <em>Attr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr</em>' reference.
	 * @see #getAttr()
	 * @generated
	 */
	void setAttr(Attribute value);

} // DynamicContent
