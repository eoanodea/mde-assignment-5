/**
 *
 * $Id$
 */
package system.validation;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import system.Content;
import system.D_Content;
import system.Page;
import system.Static_Content;

/**
 * A sample validator interface for {@link system.Page}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PageValidator {
	boolean validate();

	boolean validateIdentifier(BigInteger value);
	boolean validateUrl(String value);
	boolean validateIsHomePage(boolean value);

	boolean validateContent(EList<Content> value);

	boolean validateTitle(String value);
	boolean validateD_content(D_Content value);
	boolean validateS_content(Static_Content value);
	boolean validatePages(Page value);
	boolean validateCountry(String value);
}