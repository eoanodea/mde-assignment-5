/**
 *
 * $Id$
 */
package A3.validation;

import A3.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link A3.D_Content}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface D_ContentValidator {
	boolean validate();

	boolean validateEntity(EList<Entity> value);
}
