/**
 */
package A3;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link A3.Named#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see A3.A3Package#getNamed()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Name_Size'"
 * @generated
 */
public interface Named extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see A3.A3Package#getNamed_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link A3.Named#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'first letter must be capital a\',\n\tstatus : Boolean = \n\t\tself.name.matches(\'[a-z][0-9A-Za-z]*\')\n}.status'"
	 * @generated
	 */
	boolean Name_Format(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'at least three letters for name\',\n\tstatus : Boolean = \n\t\tself.name.size()&gt;2\n}.status'"
	 * @generated
	 */
	boolean Name_Size(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Named
