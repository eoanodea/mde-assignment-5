/**
 *
 * $Id$
 */
package A3.validation;

import A3.S_Individual;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link A3.S_Index}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface S_IndexValidator {
	boolean validate();

	boolean validateS_individual(EList<S_Individual> value);
	boolean validateS_Index_identifier(String value);
}