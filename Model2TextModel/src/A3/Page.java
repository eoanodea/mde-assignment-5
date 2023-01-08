/**
 */
package A3;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link A3.Page#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link A3.Page#getUrl <em>Url</em>}</li>
 *   <li>{@link A3.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link A3.Page#getD_content <em>Dcontent</em>}</li>
 *   <li>{@link A3.Page#getS_content <em>Scontent</em>}</li>
 *   <li>{@link A3.Page#getPages <em>Pages</em>}</li>
 *   <li>{@link A3.Page#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see A3.A3Package#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UrlContains'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(BigInteger)
	 * @see A3.A3Package#getPage_Identifier()
	 * @model
	 * @generated
	 */
	BigInteger getIdentifier();

	/**
	 * Sets the value of the '{@link A3.Page#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see A3.A3Package#getPage_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link A3.Page#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see A3.A3Package#getPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link A3.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Dcontent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcontent</em>' containment reference.
	 * @see #setD_content(D_Content)
	 * @see A3.A3Package#getPage_D_content()
	 * @model containment="true"
	 * @generated
	 */
	D_Content getD_content();

	/**
	 * Sets the value of the '{@link A3.Page#getD_content <em>Dcontent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcontent</em>' containment reference.
	 * @see #getD_content()
	 * @generated
	 */
	void setD_content(D_Content value);

	/**
	 * Returns the value of the '<em><b>Scontent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scontent</em>' containment reference.
	 * @see #setS_content(Static_Content)
	 * @see A3.A3Package#getPage_S_content()
	 * @model containment="true"
	 * @generated
	 */
	Static_Content getS_content();

	/**
	 * Sets the value of the '{@link A3.Page#getS_content <em>Scontent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scontent</em>' containment reference.
	 * @see #getS_content()
	 * @generated
	 */
	void setS_content(Static_Content value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' reference.
	 * @see #setPages(Page)
	 * @see A3.A3Package#getPage_Pages()
	 * @model
	 * @generated
	 */
	Page getPages();

	/**
	 * Sets the value of the '{@link A3.Page#getPages <em>Pages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' reference.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(Page value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see A3.A3Package#getPage_Country()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link A3.Page#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'expected word.something format\',\n\tstatus : Boolean = \n\t\tself.url.matches(\'[0-9A-Za-z]+[.][a-z]\')\n}.status'"
	 * @generated
	 */
	boolean UrlContains(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Page
