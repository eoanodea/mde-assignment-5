/**
 *
 * $Id$
 */
package system.validation;

import system.Attribute;

/**
 * A sample validator interface for {@link system.Element}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementValidator {
	boolean validate();

	boolean validateLabel(String value);
	boolean validateTooltip(String value);
	boolean validateAttr(Attribute value);
}
