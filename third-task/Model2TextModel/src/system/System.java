/**
 */
package system;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.System#getVersion <em>Version</em>}</li>
 *   <li>{@link system.System#getSubversion <em>Subversion</em>}</li>
 *   <li>{@link system.System#getEntities <em>Entities</em>}</li>
 *   <li>{@link system.System#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Named {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(BigInteger)
	 * @see system.SystemPackage#getSystem_Version()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link system.System#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Subversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subversion</em>' attribute.
	 * @see #setSubversion(BigInteger)
	 * @see system.SystemPackage#getSystem_Subversion()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getSubversion();

	/**
	 * Sets the value of the '{@link system.System#getSubversion <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subversion</em>' attribute.
	 * @see #getSubversion()
	 * @generated
	 */
	void setSubversion(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link system.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see system.SystemPackage#getSystem_Entities()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link system.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see system.SystemPackage#getSystem_Pages()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Page> getPages();

} // System
