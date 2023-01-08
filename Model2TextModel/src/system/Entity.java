/**
 */
package system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Named {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link system.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see system.SystemPackage#getEntity_Features()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Entity
