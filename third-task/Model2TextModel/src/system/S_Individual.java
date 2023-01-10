/**
 */
package system;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIndividual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.S_Individual#getIndividual_identifier <em>Individual identifier</em>}</li>
 * </ul>
 *
 * @see system.SystemPackage#getS_Individual()
 * @model
 * @generated
 */
public interface S_Individual extends Static_Content {
	/**
	 * Returns the value of the '<em><b>Individual identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual identifier</em>' attribute.
	 * @see #setIndividual_identifier(BigInteger)
	 * @see system.SystemPackage#getS_Individual_Individual_identifier()
	 * @model
	 * @generated
	 */
	BigInteger getIndividual_identifier();

	/**
	 * Sets the value of the '{@link system.S_Individual#getIndividual_identifier <em>Individual identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual identifier</em>' attribute.
	 * @see #getIndividual_identifier()
	 * @generated
	 */
	void setIndividual_identifier(BigInteger value);

} // S_Individual
