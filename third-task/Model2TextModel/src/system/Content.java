/**
 */
package system;

import java.math.BigInteger;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.Content#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends EObject {

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(BigInteger)
	 * @see system.SystemPackage#getContent_Identifier()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getIdentifier();

	/**
	 * Sets the value of the '{@link system.Content#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(BigInteger value);
} // Content
