/**
 */
package A3;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link A3.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see A3.A3Package#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containsPK'"
 * @generated
 */
public interface Entity extends Named {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link A3.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see A3.A3Package#getEntity_Features()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='features-&gt;select(isPrimaryKey=true)-&gt;size()&gt;0'"
	 * @generated
	 */
	boolean containsPK(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
