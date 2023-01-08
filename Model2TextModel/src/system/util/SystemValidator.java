/**
 */
package system.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import system.Attribute;
import system.Content;
import system.DataType;
import system.DynamicContent;
import system.Element;
import system.Entity;
import system.Feature;
import system.Form;
import system.MethodType;
import system.Named;
import system.Page;
import system.Reference;
import system.SystemPackage;
import system.header;
import system.img;
import system.paragraph;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see system.SystemPackage
 * @generated
 */
public class SystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SystemValidator INSTANCE = new SystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "system";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Url Is Valid' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__URL_IS_VALID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Page URL' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__VALID_PAGE_URL = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SystemPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SystemPackage.NAMED:
				return validateNamed((Named)value, diagnostics, context);
			case SystemPackage.SYSTEM:
				return validateSystem((system.System)value, diagnostics, context);
			case SystemPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case SystemPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case SystemPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case SystemPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case SystemPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case SystemPackage.CONTENT:
				return validateContent((Content)value, diagnostics, context);
			case SystemPackage.DYNAMIC_CONTENT:
				return validateDynamicContent((DynamicContent)value, diagnostics, context);
			case SystemPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case SystemPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case SystemPackage.IMG:
				return validateimg((img)value, diagnostics, context);
			case SystemPackage.HEADER:
				return validateheader((header)value, diagnostics, context);
			case SystemPackage.PARAGRAPH:
				return validateparagraph((paragraph)value, diagnostics, context);
			case SystemPackage.METHOD_TYPE:
				return validateMethodType((MethodType)value, diagnostics, context);
			case SystemPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(named, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(system.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_ValidPageURL(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_UrlIsValid(page, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidPageURL constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_ValidPageURL(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.ValidPageURL(diagnostics, context);
	}

	/**
	 * Validates the UrlIsValid constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_UrlIsValid(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.UrlIsValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContent(Content content, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(content, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicContent(DynamicContent dynamicContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(form, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateimg(img img, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(img, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateheader(header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(header, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateparagraph(paragraph paragraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paragraph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodType(MethodType methodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SystemValidator
