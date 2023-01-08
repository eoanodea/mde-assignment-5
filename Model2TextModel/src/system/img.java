/**
 */
package system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>img</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.img#getUrl <em>Url</em>}</li>
 *   <li>{@link system.img#getAlttext <em>Alttext</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getimg()
 * @model
 * @generated
 */
public interface img extends Content {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see system.SystemPackage#getimg_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link system.img#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Alttext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alttext</em>' attribute.
	 * @see #setAlttext(String)
	 * @see system.SystemPackage#getimg_Alttext()
	 * @model
	 * @generated
	 */
	String getAlttext();

	/**
	 * Sets the value of the '{@link system.img#getAlttext <em>Alttext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alttext</em>' attribute.
	 * @see #getAlttext()
	 * @generated
	 */
	void setAlttext(String value);

} // img
