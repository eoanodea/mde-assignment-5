/**
 *
 * $Id$
 */
package A3.validation;

import java.math.BigInteger;

/**
 * A sample validator interface for {@link A3.D_Individual}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface D_IndividualValidator {
	boolean validate();

	boolean validateIndividual_identifier(BigInteger value);
}
