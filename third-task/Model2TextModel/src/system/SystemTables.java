/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Model2TextModel/model/System.ecore
 * using:
 *   /Model2TextModel/model/System.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package system;

import java.lang.String;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import system.SystemPackage;
// import system.SystemTables;

/**
 * SystemTables provides the dispatch tables for the system for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SystemTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SystemPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s = IdManager.getNsURIPackageId("platform:/resource/Model2TextModel/model/System.ecore/", null, SystemPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Content = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("Content", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DynamicContent = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("DynamicContent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Feature = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Form = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("Form", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Reference = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("Reference", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getClassId("System", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataType = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getEnumerationId("DataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MethodType = SystemTables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_System_ecore_s.getEnumerationId("MethodType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_Integer = TypeId.SEQUENCE.getSpecializedId(TypeId.INTEGER, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ String STR_URL_32_cannot_32_have_32_a_32_s_32_if_32_it_32_is_32_the_32_homepage = "URL cannot have a / if it is the homepage";
	public static final /*@NonInvalid*/ String STR_URL_32_must_32_contain_32_an_32_ending_32_e_g_32__com = "URL must contain an ending e.g. .com";
	public static final /*@NonInvalid*/ String STR__o_91_94_92_s_93_p_e_o_92__e_o_91_94_92_s_93_p_e = "([^\\s]+)(\\.)([^\\s]+)";
	public static final /*@NonInvalid*/ String STR_quot = "/";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DynamicContent = TypeId.BAG.getSpecializedId(SystemTables.CLSSid_DynamicContent, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Element = TypeId.BAG.getSpecializedId(SystemTables.CLSSid_Element, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Form = TypeId.BAG.getSpecializedId(SystemTables.CLSSid_Form, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Reference = TypeId.BAG.getSpecializedId(SystemTables.CLSSid_Reference, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Content = TypeId.ORDERED_SET.getSpecializedId(SystemTables.CLSSid_Content, false, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element = TypeId.ORDERED_SET.getSpecializedId(SystemTables.CLSSid_Element, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entity = TypeId.ORDERED_SET.getSpecializedId(SystemTables.CLSSid_Entity, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Feature = TypeId.ORDERED_SET.getSpecializedId(SystemTables.CLSSid_Feature, false, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Page = TypeId.ORDERED_SET.getSpecializedId(SystemTables.CLSSid_Page, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", SystemTables.PARTid_, SystemTables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SystemTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(SystemPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _Content = new EcoreExecutorType(SystemPackage.Literals.CONTENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DataType = new EcoreExecutorEnumeration(SystemPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _DynamicContent = new EcoreExecutorType(SystemPackage.Literals.DYNAMIC_CONTENT, PACKAGE, 0);
		public static final EcoreExecutorType _Element = new EcoreExecutorType(SystemPackage.Literals.ELEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(SystemPackage.Literals.ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _Feature = new EcoreExecutorType(SystemPackage.Literals.FEATURE, PACKAGE, 0);
		public static final EcoreExecutorType _Form = new EcoreExecutorType(SystemPackage.Literals.FORM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MethodType = new EcoreExecutorEnumeration(SystemPackage.Literals.METHOD_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Named = new EcoreExecutorType(SystemPackage.Literals.NAMED, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(SystemPackage.Literals.PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _Reference = new EcoreExecutorType(SystemPackage.Literals.REFERENCE, PACKAGE, 0);
		public static final EcoreExecutorType _StaticContent = new EcoreExecutorType(SystemPackage.Literals.STATIC_CONTENT, PACKAGE, 0);
		public static final EcoreExecutorType _System = new EcoreExecutorType(SystemPackage.Literals.SYSTEM, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Attribute,
			_Content,
			_DataType,
			_DynamicContent,
			_Element,
			_Entity,
			_Feature,
			_Form,
			_MethodType,
			_Named,
			_Page,
			_Reference,
			_StaticContent,
			_System
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, SystemTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__Feature = new ExecutorFragment(Types._Attribute, SystemTables.Types._Feature);
		private static final ExecutorFragment _Attribute__Named = new ExecutorFragment(Types._Attribute, SystemTables.Types._Named);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Content__Content = new ExecutorFragment(Types._Content, SystemTables.Types._Content);
		private static final ExecutorFragment _Content__OclAny = new ExecutorFragment(Types._Content, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Content__OclElement = new ExecutorFragment(Types._Content, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, SystemTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__OclEnumeration = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _DynamicContent__Content = new ExecutorFragment(Types._DynamicContent, SystemTables.Types._Content);
		private static final ExecutorFragment _DynamicContent__DynamicContent = new ExecutorFragment(Types._DynamicContent, SystemTables.Types._DynamicContent);
		private static final ExecutorFragment _DynamicContent__OclAny = new ExecutorFragment(Types._DynamicContent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DynamicContent__OclElement = new ExecutorFragment(Types._DynamicContent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, SystemTables.Types._Element);
		private static final ExecutorFragment _Element__Named = new ExecutorFragment(Types._Element, SystemTables.Types._Named);
		private static final ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, SystemTables.Types._Entity);
		private static final ExecutorFragment _Entity__Named = new ExecutorFragment(Types._Entity, SystemTables.Types._Named);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Feature__Feature = new ExecutorFragment(Types._Feature, SystemTables.Types._Feature);
		private static final ExecutorFragment _Feature__Named = new ExecutorFragment(Types._Feature, SystemTables.Types._Named);
		private static final ExecutorFragment _Feature__OclAny = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Feature__OclElement = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Form__Content = new ExecutorFragment(Types._Form, SystemTables.Types._Content);
		private static final ExecutorFragment _Form__Form = new ExecutorFragment(Types._Form, SystemTables.Types._Form);
		private static final ExecutorFragment _Form__OclAny = new ExecutorFragment(Types._Form, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Form__OclElement = new ExecutorFragment(Types._Form, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MethodType__MethodType = new ExecutorFragment(Types._MethodType, SystemTables.Types._MethodType);
		private static final ExecutorFragment _MethodType__OclAny = new ExecutorFragment(Types._MethodType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MethodType__OclElement = new ExecutorFragment(Types._MethodType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MethodType__OclEnumeration = new ExecutorFragment(Types._MethodType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MethodType__OclType = new ExecutorFragment(Types._MethodType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Named__Named = new ExecutorFragment(Types._Named, SystemTables.Types._Named);
		private static final ExecutorFragment _Named__OclAny = new ExecutorFragment(Types._Named, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Named__OclElement = new ExecutorFragment(Types._Named, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__Named = new ExecutorFragment(Types._Page, SystemTables.Types._Named);
		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, SystemTables.Types._Page);

		private static final ExecutorFragment _Reference__Feature = new ExecutorFragment(Types._Reference, SystemTables.Types._Feature);
		private static final ExecutorFragment _Reference__Named = new ExecutorFragment(Types._Reference, SystemTables.Types._Named);
		private static final ExecutorFragment _Reference__OclAny = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Reference__OclElement = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Reference__Reference = new ExecutorFragment(Types._Reference, SystemTables.Types._Reference);

		private static final ExecutorFragment _StaticContent__Content = new ExecutorFragment(Types._StaticContent, SystemTables.Types._Content);
		private static final ExecutorFragment _StaticContent__OclAny = new ExecutorFragment(Types._StaticContent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StaticContent__OclElement = new ExecutorFragment(Types._StaticContent, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StaticContent__StaticContent = new ExecutorFragment(Types._StaticContent, SystemTables.Types._StaticContent);

		private static final ExecutorFragment _System__Named = new ExecutorFragment(Types._System, SystemTables.Types._Named);
		private static final ExecutorFragment _System__OclAny = new ExecutorFragment(Types._System, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _System__OclElement = new ExecutorFragment(Types._System, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _System__System = new ExecutorFragment(Types._System, SystemTables.Types._System);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Attribute__IsPrimaryKey = new EcoreExecutorProperty(SystemPackage.Literals.ATTRIBUTE__IS_PRIMARY_KEY, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(SystemPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__DynamicContent__attr = new ExecutorPropertyWithImplementation("DynamicContent", Types._Attribute, 2, new EcoreLibraryOppositeProperty(SystemPackage.Literals.DYNAMIC_CONTENT__ATTR));
		public static final ExecutorProperty _Attribute__Element__attr = new ExecutorPropertyWithImplementation("Element", Types._Attribute, 3, new EcoreLibraryOppositeProperty(SystemPackage.Literals.ELEMENT__ATTR));

		public static final ExecutorProperty _Content__identifier = new EcoreExecutorProperty(SystemPackage.Literals.CONTENT__IDENTIFIER, Types._Content, 0);
		public static final ExecutorProperty _Content__Page__content = new ExecutorPropertyWithImplementation("Page", Types._Content, 1, new EcoreLibraryOppositeProperty(SystemPackage.Literals.PAGE__CONTENT));

		public static final ExecutorProperty _DynamicContent__attr = new EcoreExecutorProperty(SystemPackage.Literals.DYNAMIC_CONTENT__ATTR, Types._DynamicContent, 0);
		public static final ExecutorProperty _DynamicContent__entity = new EcoreExecutorProperty(SystemPackage.Literals.DYNAMIC_CONTENT__ENTITY, Types._DynamicContent, 1);

		public static final ExecutorProperty _Element__attr = new EcoreExecutorProperty(SystemPackage.Literals.ELEMENT__ATTR, Types._Element, 0);
		public static final ExecutorProperty _Element__label = new EcoreExecutorProperty(SystemPackage.Literals.ELEMENT__LABEL, Types._Element, 1);
		public static final ExecutorProperty _Element__Form__elements = new ExecutorPropertyWithImplementation("Form", Types._Element, 2, new EcoreLibraryOppositeProperty(SystemPackage.Literals.FORM__ELEMENTS));

		public static final ExecutorProperty _Entity__features = new EcoreExecutorProperty(SystemPackage.Literals.ENTITY__FEATURES, Types._Entity, 0);
		public static final ExecutorProperty _Entity__DynamicContent__entity = new ExecutorPropertyWithImplementation("DynamicContent", Types._Entity, 1, new EcoreLibraryOppositeProperty(SystemPackage.Literals.DYNAMIC_CONTENT__ENTITY));
		public static final ExecutorProperty _Entity__Form__entity = new ExecutorPropertyWithImplementation("Form", Types._Entity, 2, new EcoreLibraryOppositeProperty(SystemPackage.Literals.FORM__ENTITY));
		public static final ExecutorProperty _Entity__Reference__foreignKey = new ExecutorPropertyWithImplementation("Reference", Types._Entity, 3, new EcoreLibraryOppositeProperty(SystemPackage.Literals.REFERENCE__FOREIGN_KEY));
		public static final ExecutorProperty _Entity__System__entities = new ExecutorPropertyWithImplementation("System", Types._Entity, 4, new EcoreLibraryOppositeProperty(SystemPackage.Literals.SYSTEM__ENTITIES));

		public static final ExecutorProperty _Feature__Entity__features = new ExecutorPropertyWithImplementation("Entity", Types._Feature, 0, new EcoreLibraryOppositeProperty(SystemPackage.Literals.ENTITY__FEATURES));

		public static final ExecutorProperty _Form__elements = new EcoreExecutorProperty(SystemPackage.Literals.FORM__ELEMENTS, Types._Form, 0);
		public static final ExecutorProperty _Form__entity = new EcoreExecutorProperty(SystemPackage.Literals.FORM__ENTITY, Types._Form, 1);
		public static final ExecutorProperty _Form__method = new EcoreExecutorProperty(SystemPackage.Literals.FORM__METHOD, Types._Form, 2);
		public static final ExecutorProperty _Form__name = new EcoreExecutorProperty(SystemPackage.Literals.FORM__NAME, Types._Form, 3);

		public static final ExecutorProperty _Named__description = new EcoreExecutorProperty(SystemPackage.Literals.NAMED__DESCRIPTION, Types._Named, 0);
		public static final ExecutorProperty _Named__identifier = new EcoreExecutorProperty(SystemPackage.Literals.NAMED__IDENTIFIER, Types._Named, 1);
		public static final ExecutorProperty _Named__name = new EcoreExecutorProperty(SystemPackage.Literals.NAMED__NAME, Types._Named, 2);

		public static final ExecutorProperty _Page__content = new EcoreExecutorProperty(SystemPackage.Literals.PAGE__CONTENT, Types._Page, 0);
		public static final ExecutorProperty _Page__isHomePage = new EcoreExecutorProperty(SystemPackage.Literals.PAGE__IS_HOME_PAGE, Types._Page, 1);
		public static final ExecutorProperty _Page__url = new EcoreExecutorProperty(SystemPackage.Literals.PAGE__URL, Types._Page, 2);
		public static final ExecutorProperty _Page__System__pages = new ExecutorPropertyWithImplementation("System", Types._Page, 3, new EcoreLibraryOppositeProperty(SystemPackage.Literals.SYSTEM__PAGES));

		public static final ExecutorProperty _Reference__foreignKey = new EcoreExecutorProperty(SystemPackage.Literals.REFERENCE__FOREIGN_KEY, Types._Reference, 0);

		public static final ExecutorProperty _StaticContent__text = new EcoreExecutorProperty(SystemPackage.Literals.STATIC_CONTENT__TEXT, Types._StaticContent, 0);
		public static final ExecutorProperty _StaticContent__type = new EcoreExecutorProperty(SystemPackage.Literals.STATIC_CONTENT__TYPE, Types._StaticContent, 1);

		public static final ExecutorProperty _System__entities = new EcoreExecutorProperty(SystemPackage.Literals.SYSTEM__ENTITIES, Types._System, 0);
		public static final ExecutorProperty _System__pages = new EcoreExecutorProperty(SystemPackage.Literals.SYSTEM__PAGES, Types._System, 1);
		public static final ExecutorProperty _System__subversion = new EcoreExecutorProperty(SystemPackage.Literals.SYSTEM__SUBVERSION, Types._System, 2);
		public static final ExecutorProperty _System__version = new EcoreExecutorProperty(SystemPackage.Literals.SYSTEM__VERSION, Types._System, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__Named /* 2 */,
				Fragments._Attribute__Feature /* 3 */,
				Fragments._Attribute__Attribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Content =
			{
				Fragments._Content__OclAny /* 0 */,
				Fragments._Content__OclElement /* 1 */,
				Fragments._Content__Content /* 2 */
			};
		private static final int /*@NonNull*/ [] __Content = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__OclEnumeration /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DynamicContent =
			{
				Fragments._DynamicContent__OclAny /* 0 */,
				Fragments._DynamicContent__OclElement /* 1 */,
				Fragments._DynamicContent__Content /* 2 */,
				Fragments._DynamicContent__DynamicContent /* 3 */
			};
		private static final int /*@NonNull*/ [] __DynamicContent = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Element =
			{
				Fragments._Element__OclAny /* 0 */,
				Fragments._Element__OclElement /* 1 */,
				Fragments._Element__Named /* 2 */,
				Fragments._Element__Element /* 3 */
			};
		private static final int /*@NonNull*/ [] __Element = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__Named /* 2 */,
				Fragments._Entity__Entity /* 3 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Feature =
			{
				Fragments._Feature__OclAny /* 0 */,
				Fragments._Feature__OclElement /* 1 */,
				Fragments._Feature__Named /* 2 */,
				Fragments._Feature__Feature /* 3 */
			};
		private static final int /*@NonNull*/ [] __Feature = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Form =
			{
				Fragments._Form__OclAny /* 0 */,
				Fragments._Form__OclElement /* 1 */,
				Fragments._Form__Content /* 2 */,
				Fragments._Form__Form /* 3 */
			};
		private static final int /*@NonNull*/ [] __Form = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MethodType =
			{
				Fragments._MethodType__OclAny /* 0 */,
				Fragments._MethodType__OclElement /* 1 */,
				Fragments._MethodType__OclType /* 2 */,
				Fragments._MethodType__OclEnumeration /* 3 */,
				Fragments._MethodType__MethodType /* 4 */
			};
		private static final int /*@NonNull*/ [] __MethodType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Named =
			{
				Fragments._Named__OclAny /* 0 */,
				Fragments._Named__OclElement /* 1 */,
				Fragments._Named__Named /* 2 */
			};
		private static final int /*@NonNull*/ [] __Named = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__Named /* 2 */,
				Fragments._Page__Page /* 3 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Reference =
			{
				Fragments._Reference__OclAny /* 0 */,
				Fragments._Reference__OclElement /* 1 */,
				Fragments._Reference__Named /* 2 */,
				Fragments._Reference__Feature /* 3 */,
				Fragments._Reference__Reference /* 4 */
			};
		private static final int /*@NonNull*/ [] __Reference = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StaticContent =
			{
				Fragments._StaticContent__OclAny /* 0 */,
				Fragments._StaticContent__OclElement /* 1 */,
				Fragments._StaticContent__Content /* 2 */,
				Fragments._StaticContent__StaticContent /* 3 */
			};
		private static final int /*@NonNull*/ [] __StaticContent = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _System =
			{
				Fragments._System__OclAny /* 0 */,
				Fragments._System__OclElement /* 1 */,
				Fragments._System__Named /* 2 */,
				Fragments._System__System /* 3 */
			};
		private static final int /*@NonNull*/ [] __System = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._Content.initFragments(_Content, __Content);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._DynamicContent.initFragments(_DynamicContent, __DynamicContent);
			Types._Element.initFragments(_Element, __Element);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._Feature.initFragments(_Feature, __Feature);
			Types._Form.initFragments(_Form, __Form);
			Types._MethodType.initFragments(_MethodType, __MethodType);
			Types._Named.initFragments(_Named, __Named);
			Types._Page.initFragments(_Page, __Page);
			Types._Reference.initFragments(_Reference, __Reference);
			Types._StaticContent.initFragments(_StaticContent, __StaticContent);
			Types._System.initFragments(_System, __System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Content__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Content__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Content__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__DynamicContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Element__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Feature__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Form__Form = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Form__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Form__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Form__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MethodType__MethodType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MethodType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MethodType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MethodType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MethodType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Named__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Named__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Named__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Reference__Reference = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StaticContent__StaticContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StaticContent__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StaticContent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StaticContent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _System__System = {};
		private static final ExecutorOperation /*@NonNull*/ [] _System__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _System__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _System__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__Feature.initOperations(_Attribute__Feature);
			Fragments._Attribute__Named.initOperations(_Attribute__Named);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._Content__Content.initOperations(_Content__Content);
			Fragments._Content__OclAny.initOperations(_Content__OclAny);
			Fragments._Content__OclElement.initOperations(_Content__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclEnumeration.initOperations(_DataType__OclEnumeration);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);

			Fragments._DynamicContent__Content.initOperations(_DynamicContent__Content);
			Fragments._DynamicContent__DynamicContent.initOperations(_DynamicContent__DynamicContent);
			Fragments._DynamicContent__OclAny.initOperations(_DynamicContent__OclAny);
			Fragments._DynamicContent__OclElement.initOperations(_DynamicContent__OclElement);

			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__Named.initOperations(_Element__Named);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__Named.initOperations(_Entity__Named);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__Named.initOperations(_Feature__Named);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__OclElement.initOperations(_Feature__OclElement);

			Fragments._Form__Content.initOperations(_Form__Content);
			Fragments._Form__Form.initOperations(_Form__Form);
			Fragments._Form__OclAny.initOperations(_Form__OclAny);
			Fragments._Form__OclElement.initOperations(_Form__OclElement);

			Fragments._MethodType__MethodType.initOperations(_MethodType__MethodType);
			Fragments._MethodType__OclAny.initOperations(_MethodType__OclAny);
			Fragments._MethodType__OclElement.initOperations(_MethodType__OclElement);
			Fragments._MethodType__OclEnumeration.initOperations(_MethodType__OclEnumeration);
			Fragments._MethodType__OclType.initOperations(_MethodType__OclType);

			Fragments._Named__Named.initOperations(_Named__Named);
			Fragments._Named__OclAny.initOperations(_Named__OclAny);
			Fragments._Named__OclElement.initOperations(_Named__OclElement);

			Fragments._Page__Named.initOperations(_Page__Named);
			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._Reference__Feature.initOperations(_Reference__Feature);
			Fragments._Reference__Named.initOperations(_Reference__Named);
			Fragments._Reference__OclAny.initOperations(_Reference__OclAny);
			Fragments._Reference__OclElement.initOperations(_Reference__OclElement);
			Fragments._Reference__Reference.initOperations(_Reference__Reference);

			Fragments._StaticContent__Content.initOperations(_StaticContent__Content);
			Fragments._StaticContent__OclAny.initOperations(_StaticContent__OclAny);
			Fragments._StaticContent__OclElement.initOperations(_StaticContent__OclElement);
			Fragments._StaticContent__StaticContent.initOperations(_StaticContent__StaticContent);

			Fragments._System__Named.initOperations(_System__Named);
			Fragments._System__OclAny.initOperations(_System__OclAny);
			Fragments._System__OclElement.initOperations(_System__OclElement);
			Fragments._System__System.initOperations(_System__System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			SystemTables.Properties._Attribute__IsPrimaryKey,
			SystemTables.Properties._Named__description,
			SystemTables.Properties._Named__identifier,
			SystemTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemTables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Content = {
			SystemTables.Properties._Content__identifier,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DynamicContent = {
			SystemTables.Properties._DynamicContent__attr,
			SystemTables.Properties._DynamicContent__entity,
			SystemTables.Properties._Content__identifier,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Element = {
			SystemTables.Properties._Element__attr,
			SystemTables.Properties._Named__description,
			SystemTables.Properties._Named__identifier,
			SystemTables.Properties._Element__label,
			SystemTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			SystemTables.Properties._Named__description,
			SystemTables.Properties._Entity__features,
			SystemTables.Properties._Named__identifier,
			SystemTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Feature = {
			SystemTables.Properties._Named__description,
			SystemTables.Properties._Named__identifier,
			SystemTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Form = {
			SystemTables.Properties._Form__elements,
			SystemTables.Properties._Form__entity,
			SystemTables.Properties._Content__identifier,
			SystemTables.Properties._Form__method,
			SystemTables.Properties._Form__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MethodType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Named = {
			SystemTables.Properties._Named__description,
			SystemTables.Properties._Named__identifier,
			SystemTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			SystemTables.Properties._Page__content,
			SystemTables.Properties._Named__description,
			SystemTables.Properties._Named__identifier,
			SystemTables.Properties._Page__isHomePage,
			SystemTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemTables.Properties._Page__url
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Reference = {
			SystemTables.Properties._Named__description,
			SystemTables.Properties._Reference__foreignKey,
			SystemTables.Properties._Named__identifier,
			SystemTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StaticContent = {
			SystemTables.Properties._Content__identifier,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemTables.Properties._StaticContent__text,
			SystemTables.Properties._StaticContent__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _System = {
			SystemTables.Properties._Named__description,
			SystemTables.Properties._System__entities,
			SystemTables.Properties._Named__identifier,
			SystemTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SystemTables.Properties._System__pages,
			SystemTables.Properties._System__subversion,
			SystemTables.Properties._System__version
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._Content__Content.initProperties(_Content);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._DynamicContent__DynamicContent.initProperties(_DynamicContent);
			Fragments._Element__Element.initProperties(_Element);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._Feature__Feature.initProperties(_Feature);
			Fragments._Form__Form.initProperties(_Form);
			Fragments._MethodType__MethodType.initProperties(_MethodType);
			Fragments._Named__Named.initProperties(_Named);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._Reference__Reference.initProperties(_Reference);
			Fragments._StaticContent__StaticContent.initProperties(_StaticContent);
			Fragments._System__System.initProperties(_System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DataType__int = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("int"), Types._DataType, 0);
		public static final EcoreExecutorEnumerationLiteral _DataType__string = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("string"), Types._DataType, 1);
		public static final EcoreExecutorEnumerationLiteral _DataType__text = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("text"), Types._DataType, 2);
		public static final EcoreExecutorEnumerationLiteral _DataType__bool = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("bool"), Types._DataType, 3);
		public static final EcoreExecutorEnumerationLiteral _DataType__date = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("date"), Types._DataType, 4);
		public static final EcoreExecutorEnumerationLiteral _DataType__file = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("file"), Types._DataType, 5);
		public static final EcoreExecutorEnumerationLiteral _DataType__currency = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("currency"), Types._DataType, 6);
		public static final EcoreExecutorEnumerationLiteral _DataType__percent = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("percent"), Types._DataType, 7);
		public static final EcoreExecutorEnumerationLiteral _DataType__image = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("image"), Types._DataType, 8);
		public static final EcoreExecutorEnumerationLiteral _DataType__images = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.DATA_TYPE.getEEnumLiteral("images"), Types._DataType, 9);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DataType = {
			_DataType__int,
			_DataType__string,
			_DataType__text,
			_DataType__bool,
			_DataType__date,
			_DataType__file,
			_DataType__currency,
			_DataType__percent,
			_DataType__image,
			_DataType__images
		};

		public static final EcoreExecutorEnumerationLiteral _MethodType__post = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.METHOD_TYPE.getEEnumLiteral("post"), Types._MethodType, 0);
		public static final EcoreExecutorEnumerationLiteral _MethodType__get = new EcoreExecutorEnumerationLiteral(SystemPackage.Literals.METHOD_TYPE.getEEnumLiteral("get"), Types._MethodType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MethodType = {
			_MethodType__post,
			_MethodType__get
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DataType.initLiterals(_DataType);
			Types._MethodType.initLiterals(_MethodType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SystemTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new SystemTables();
	}

	private SystemTables() {
		super(SystemPackage.eNS_URI);
	}
}
