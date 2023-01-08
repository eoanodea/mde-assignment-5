/**
 */
package A3;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIndividual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link A3.D_Individual#getIndividual_identifier <em>Individual identifier</em>}</li>
 * </ul>
 *
 * @see A3.A3Package#getD_Individual()
 * @model
 * @generated
 */
public interface D_Individual extends D_Content {
	/**
	 * Returns the value of the '<em><b>Individual identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual identifier</em>' attribute.
	 * @see #setIndividual_identifier(BigInteger)
	 * @see A3.A3Package#getD_Individual_Individual_identifier()
	 * @model
	 * @generated
	 */
	BigInteger getIndividual_identifier();

	/**
	 * Sets the value of the '{@link A3.D_Individual#getIndividual_identifier <em>Individual identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual identifier</em>' attribute.
	 * @see #getIndividual_identifier()
	 * @generated
	 */
	void setIndividual_identifier(BigInteger value);

} // D_Individual
