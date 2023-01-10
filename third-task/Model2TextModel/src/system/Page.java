/**
 */
package system;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.Page#getUrl <em>Url</em>}</li>
 *   <li>{@link system.Page#isIsHomePage <em>Is Home Page</em>}</li>
 *   <li>{@link system.Page#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidPageURL'"
 * @generated
 */
public interface Page extends Named {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see system.SystemPackage#getPage_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link system.Page#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Is Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Home Page</em>' attribute.
	 * @see #setIsHomePage(boolean)
	 * @see system.SystemPackage#getPage_IsHomePage()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsHomePage();

	/**
	 * Sets the value of the '{@link system.Page#isIsHomePage <em>Is Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Home Page</em>' attribute.
	 * @see #isIsHomePage()
	 * @generated
	 */
	void setIsHomePage(boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link system.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see system.SystemPackage#getPage_Content()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Content> getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'URL must contain an ending e.g. .com\',\n\tstatus : Boolean = \n\t\t\tself.url.matches(\'([^\\\\s]+)(\\\\.)([^\\\\s]+)\')\n}.status'"
	 * @generated
	 */
	boolean UrlIsValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'URL cannot have a / if it is the homepage\',\n\tstatus : Boolean = \n\t\t\tif self.isHomePage = true then not Sequence{1..self.url.size()}-&gt;exists(i | self.url.substring(i, i) = \'/\')\n\t\t\telse (Sequence{1..self.url.size()}-&gt;exists(i | self.url.substring(i, i) = \'/\'))\n\t\t\tendif\n}.status'"
	 * @generated
	 */
	boolean ValidPageURL(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Page
