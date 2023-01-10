/**
 */
package system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DContent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.D_Content#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getD_Content()
 * @model
 * @generated
 */
public interface D_Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference list.
	 * The list contents are of type {@link system.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference list.
	 * @see system.SystemPackage#getD_Content_Entity()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Entity> getEntity();

} // D_Content
