/**
 */
package A3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIndex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link A3.S_Index#getS_individual <em>Sindividual</em>}</li>
 *   <li>{@link A3.S_Index#getS_Index_identifier <em>SIndex identifier</em>}</li>
 * </ul>
 *
 * @see A3.A3Package#getS_Index()
 * @model
 * @generated
 */
public interface S_Index extends Static_Content {
	/**
	 * Returns the value of the '<em><b>Sindividual</b></em>' containment reference list.
	 * The list contents are of type {@link A3.S_Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sindividual</em>' containment reference list.
	 * @see A3.A3Package#getS_Index_S_individual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<S_Individual> getS_individual();

	/**
	 * Returns the value of the '<em><b>SIndex identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SIndex identifier</em>' attribute.
	 * @see #setS_Index_identifier(String)
	 * @see A3.A3Package#getS_Index_S_Index_identifier()
	 * @model
	 * @generated
	 */
	String getS_Index_identifier();

	/**
	 * Sets the value of the '{@link A3.S_Index#getS_Index_identifier <em>SIndex identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIndex identifier</em>' attribute.
	 * @see #getS_Index_identifier()
	 * @generated
	 */
	void setS_Index_identifier(String value);

} // S_Index
