/**
 */
package system;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIndex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.D_Index#getIndividual <em>Individual</em>}</li>
 *   <li>{@link system.D_Index#getIndex_identifier <em>Index identifier</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getD_Index()
 * @model
 * @generated
 */
public interface D_Index extends D_Content {
	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference list.
	 * The list contents are of type {@link system.D_Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference list.
	 * @see system.SystemPackage#getD_Index_Individual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<D_Individual> getIndividual();

	/**
	 * Returns the value of the '<em><b>Index identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index identifier</em>' attribute.
	 * @see #setIndex_identifier(BigInteger)
	 * @see system.SystemPackage#getD_Index_Index_identifier()
	 * @model
	 * @generated
	 */
	BigInteger getIndex_identifier();

	/**
	 * Sets the value of the '{@link system.D_Index#getIndex_identifier <em>Index identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index identifier</em>' attribute.
	 * @see #getIndex_identifier()
	 * @generated
	 */
	void setIndex_identifier(BigInteger value);

} // D_Index
