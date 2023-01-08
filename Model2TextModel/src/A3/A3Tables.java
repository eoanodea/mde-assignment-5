/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Model2TextModel/model/A3.ecore
 * using:
 *   /Model2TextModel/model/A3.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package A3;

// import A3.A3Package;
// import A3.A3Tables;
import java.lang.String;
import org.eclipse.ocl.pivot.TemplateParameters;
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
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * A3Tables provides the dispatch tables for the A3 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class A3Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(A3Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore = IdManager.getNsURIPackageId("platform:/resource/Model2TextModel/model/A3.ecore", null, A3Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_D_Content = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("D_Content", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_D_Index = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("D_Index", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_D_Individual = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("D_Individual", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Feature = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Named = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("Named", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Reference = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("Reference", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_S_Index = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("S_Index", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_S_Individual = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("S_Individual", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Static_Content = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("Static_Content", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getClassId("System", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataType = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getEnumerationId("DataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_FeatureType = A3Tables.PACKid_platform_c_s_resource_s_Model2TextModel_s_model_s_A3_ecore.getEnumerationId("FeatureType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ String STR__91_0_m_9A_m_Za_m_z_93_p_91__93_91_a_m_z_93 = "[0-9A-Za-z]+[.][a-z]";
	public static final /*@NonInvalid*/ String STR__91_0_m_9A_m_Za_m_z_93_p_91__93_91_c_93_91_o_93_91_m_93 = "[0-9A-Za-z]+[.][c][o][m]";
	public static final /*@NonInvalid*/ String STR__91_0_m_9A_m_Za_m_z_93_p_91__93_91_f_93_91_r_93 = "[0-9A-Za-z]+[.][f][r]";
	public static final /*@NonInvalid*/ String STR__91_0_m_9A_m_Za_m_z_93_p_91__93_91_i_93_91_t_93 = "[0-9A-Za-z]+[.][i][t]";
	public static final /*@NonInvalid*/ String STR__91_a_m_z_93_91_0_m_9A_m_Za_m_z_93_a = "[a-z][0-9A-Za-z]*";
	public static final /*@NonInvalid*/ String STR_american = "american";
	public static final /*@NonInvalid*/ String STR_at_32_least_32_three_32_letters_32_for_32_name = "at least three letters for name";
	public static final /*@NonInvalid*/ String STR_expected_32_word_something_32_format = "expected word.something format";
	public static final /*@NonInvalid*/ String STR_first_32_letter_32_must_32_be_32_capital_32_a = "first letter must be capital a";
	public static final /*@NonInvalid*/ String STR_french = "french";
	public static final /*@NonInvalid*/ String STR_italian = "italian";
	public static final /*@NonInvalid*/ String STR_undefined = "undefined";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_D_Content = TypeId.BAG.getSpecializedId(A3Tables.CLSSid_D_Content, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Page = TypeId.BAG.getSpecializedId(A3Tables.CLSSid_Page, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Reference = TypeId.BAG.getSpecializedId(A3Tables.CLSSid_Reference, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_D_Individual = TypeId.ORDERED_SET.getSpecializedId(A3Tables.CLSSid_D_Individual, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entity = TypeId.ORDERED_SET.getSpecializedId(A3Tables.CLSSid_Entity, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Feature = TypeId.ORDERED_SET.getSpecializedId(A3Tables.CLSSid_Feature, false, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Feature_0 = TypeId.ORDERED_SET.getSpecializedId(A3Tables.CLSSid_Feature, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Page = TypeId.ORDERED_SET.getSpecializedId(A3Tables.CLSSid_Page, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_S_Individual = TypeId.ORDERED_SET.getSpecializedId(A3Tables.CLSSid_S_Individual, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Entity = TypeId.SET.getSpecializedId(A3Tables.CLSSid_Entity, false, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", A3Tables.PARTid_, A3Tables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			A3Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3Tables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(A3Package.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _D_Content = new EcoreExecutorType(A3Package.Literals.DCONTENT, PACKAGE, 0);
		public static final EcoreExecutorType _D_Index = new EcoreExecutorType(A3Package.Literals.DINDEX, PACKAGE, 0);
		public static final EcoreExecutorType _D_Individual = new EcoreExecutorType(A3Package.Literals.DINDIVIDUAL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DataType = new EcoreExecutorEnumeration(A3Package.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(A3Package.Literals.ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _Feature = new EcoreExecutorType(A3Package.Literals.FEATURE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _FeatureType = new EcoreExecutorEnumeration(A3Package.Literals.FEATURE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Named = new EcoreExecutorType(A3Package.Literals.NAMED, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(A3Package.Literals.PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _Reference = new EcoreExecutorType(A3Package.Literals.REFERENCE, PACKAGE, 0);
		public static final EcoreExecutorType _S_Index = new EcoreExecutorType(A3Package.Literals.SINDEX, PACKAGE, 0);
		public static final EcoreExecutorType _S_Individual = new EcoreExecutorType(A3Package.Literals.SINDIVIDUAL, PACKAGE, 0);
		public static final EcoreExecutorType _Static_Content = new EcoreExecutorType(A3Package.Literals.STATIC_CONTENT, PACKAGE, 0);
		public static final EcoreExecutorType _System = new EcoreExecutorType(A3Package.Literals.SYSTEM, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Attribute,
			_D_Content,
			_D_Index,
			_D_Individual,
			_DataType,
			_Entity,
			_Feature,
			_FeatureType,
			_Named,
			_Page,
			_Reference,
			_S_Index,
			_S_Individual,
			_Static_Content,
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
		 * Force initialization of the fields of A3Tables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, A3Tables.Types._Attribute);
		private static final ExecutorFragment _Attribute__Feature = new ExecutorFragment(Types._Attribute, A3Tables.Types._Feature);
		private static final ExecutorFragment _Attribute__Named = new ExecutorFragment(Types._Attribute, A3Tables.Types._Named);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _D_Content__D_Content = new ExecutorFragment(Types._D_Content, A3Tables.Types._D_Content);
		private static final ExecutorFragment _D_Content__OclAny = new ExecutorFragment(Types._D_Content, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _D_Content__OclElement = new ExecutorFragment(Types._D_Content, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _D_Index__D_Content = new ExecutorFragment(Types._D_Index, A3Tables.Types._D_Content);
		private static final ExecutorFragment _D_Index__D_Index = new ExecutorFragment(Types._D_Index, A3Tables.Types._D_Index);
		private static final ExecutorFragment _D_Index__OclAny = new ExecutorFragment(Types._D_Index, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _D_Index__OclElement = new ExecutorFragment(Types._D_Index, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _D_Individual__D_Content = new ExecutorFragment(Types._D_Individual, A3Tables.Types._D_Content);
		private static final ExecutorFragment _D_Individual__D_Individual = new ExecutorFragment(Types._D_Individual, A3Tables.Types._D_Individual);
		private static final ExecutorFragment _D_Individual__OclAny = new ExecutorFragment(Types._D_Individual, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _D_Individual__OclElement = new ExecutorFragment(Types._D_Individual, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, A3Tables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__OclEnumeration = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, A3Tables.Types._Entity);
		private static final ExecutorFragment _Entity__Named = new ExecutorFragment(Types._Entity, A3Tables.Types._Named);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Feature__Feature = new ExecutorFragment(Types._Feature, A3Tables.Types._Feature);
		private static final ExecutorFragment _Feature__Named = new ExecutorFragment(Types._Feature, A3Tables.Types._Named);
		private static final ExecutorFragment _Feature__OclAny = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Feature__OclElement = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FeatureType__FeatureType = new ExecutorFragment(Types._FeatureType, A3Tables.Types._FeatureType);
		private static final ExecutorFragment _FeatureType__OclAny = new ExecutorFragment(Types._FeatureType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FeatureType__OclElement = new ExecutorFragment(Types._FeatureType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FeatureType__OclEnumeration = new ExecutorFragment(Types._FeatureType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _FeatureType__OclType = new ExecutorFragment(Types._FeatureType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Named__Named = new ExecutorFragment(Types._Named, A3Tables.Types._Named);
		private static final ExecutorFragment _Named__OclAny = new ExecutorFragment(Types._Named, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Named__OclElement = new ExecutorFragment(Types._Named, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, A3Tables.Types._Page);

		private static final ExecutorFragment _Reference__Feature = new ExecutorFragment(Types._Reference, A3Tables.Types._Feature);
		private static final ExecutorFragment _Reference__Named = new ExecutorFragment(Types._Reference, A3Tables.Types._Named);
		private static final ExecutorFragment _Reference__OclAny = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Reference__OclElement = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Reference__Reference = new ExecutorFragment(Types._Reference, A3Tables.Types._Reference);

		private static final ExecutorFragment _S_Index__OclAny = new ExecutorFragment(Types._S_Index, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _S_Index__OclElement = new ExecutorFragment(Types._S_Index, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _S_Index__S_Index = new ExecutorFragment(Types._S_Index, A3Tables.Types._S_Index);
		private static final ExecutorFragment _S_Index__Static_Content = new ExecutorFragment(Types._S_Index, A3Tables.Types._Static_Content);

		private static final ExecutorFragment _S_Individual__OclAny = new ExecutorFragment(Types._S_Individual, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _S_Individual__OclElement = new ExecutorFragment(Types._S_Individual, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _S_Individual__S_Individual = new ExecutorFragment(Types._S_Individual, A3Tables.Types._S_Individual);
		private static final ExecutorFragment _S_Individual__Static_Content = new ExecutorFragment(Types._S_Individual, A3Tables.Types._Static_Content);

		private static final ExecutorFragment _Static_Content__OclAny = new ExecutorFragment(Types._Static_Content, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Static_Content__OclElement = new ExecutorFragment(Types._Static_Content, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Static_Content__Static_Content = new ExecutorFragment(Types._Static_Content, A3Tables.Types._Static_Content);

		private static final ExecutorFragment _System__Named = new ExecutorFragment(Types._System, A3Tables.Types._Named);
		private static final ExecutorFragment _System__OclAny = new ExecutorFragment(Types._System, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _System__OclElement = new ExecutorFragment(Types._System, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _System__System = new ExecutorFragment(Types._System, A3Tables.Types._System);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3Tables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of A3Tables::Parameters and all preceding sub-packages.
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

		public static final ExecutorOperation _System__numberOfEntities = new ExecutorOperation("numberOfEntities", TypeUtil.EMPTY_PARAMETER_TYPES, Types._System,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _System__numberOfPages = new ExecutorOperation("numberOfPages", TypeUtil.EMPTY_PARAMETER_TYPES, Types._System,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3Tables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(A3Package.Literals.ATTRIBUTE__TYPE, Types._Attribute, 0);

		public static final ExecutorProperty _D_Content__entity = new EcoreExecutorProperty(A3Package.Literals.DCONTENT__ENTITY, Types._D_Content, 0);
		public static final ExecutorProperty _D_Content__Page__D_content = new ExecutorPropertyWithImplementation("Page", Types._D_Content, 1, new EcoreLibraryOppositeProperty(A3Package.Literals.PAGE__DCONTENT));

		public static final ExecutorProperty _D_Index__Index_identifier = new EcoreExecutorProperty(A3Package.Literals.DINDEX__INDEX_IDENTIFIER, Types._D_Index, 0);
		public static final ExecutorProperty _D_Index__Individual = new EcoreExecutorProperty(A3Package.Literals.DINDEX__INDIVIDUAL, Types._D_Index, 1);

		public static final ExecutorProperty _D_Individual__Individual_identifier = new EcoreExecutorProperty(A3Package.Literals.DINDIVIDUAL__INDIVIDUAL_IDENTIFIER, Types._D_Individual, 0);
		public static final ExecutorProperty _D_Individual__D_Index__Individual = new ExecutorPropertyWithImplementation("D_Index", Types._D_Individual, 1, new EcoreLibraryOppositeProperty(A3Package.Literals.DINDEX__INDIVIDUAL));

		public static final ExecutorProperty _Entity__features = new EcoreExecutorProperty(A3Package.Literals.ENTITY__FEATURES, Types._Entity, 0);
		public static final ExecutorProperty _Entity__D_Content__entity = new ExecutorPropertyWithImplementation("D_Content", Types._Entity, 1, new EcoreLibraryOppositeProperty(A3Package.Literals.DCONTENT__ENTITY));
		public static final ExecutorProperty _Entity__Reference__ref = new ExecutorPropertyWithImplementation("Reference", Types._Entity, 2, new EcoreLibraryOppositeProperty(A3Package.Literals.REFERENCE__REF));
		public static final ExecutorProperty _Entity__System__entities = new ExecutorPropertyWithImplementation("System", Types._Entity, 3, new EcoreLibraryOppositeProperty(A3Package.Literals.SYSTEM__ENTITIES));

		public static final ExecutorProperty _Feature__isPrimaryKey = new EcoreExecutorProperty(A3Package.Literals.FEATURE__IS_PRIMARY_KEY, Types._Feature, 0);
		public static final ExecutorProperty _Feature__Entity__features = new ExecutorPropertyWithImplementation("Entity", Types._Feature, 1, new EcoreLibraryOppositeProperty(A3Package.Literals.ENTITY__FEATURES));

		public static final ExecutorProperty _Named__name = new EcoreExecutorProperty(A3Package.Literals.NAMED__NAME, Types._Named, 0);

		public static final ExecutorProperty _Page__D_content = new EcoreExecutorProperty(A3Package.Literals.PAGE__DCONTENT, Types._Page, 0);
		public static final ExecutorProperty _Page__S_content = new EcoreExecutorProperty(A3Package.Literals.PAGE__SCONTENT, Types._Page, 1);
		public static final ExecutorProperty _Page__country = new EcoreExecutorProperty(A3Package.Literals.PAGE__COUNTRY, Types._Page, 2);
		public static final ExecutorProperty _Page__identifier = new EcoreExecutorProperty(A3Package.Literals.PAGE__IDENTIFIER, Types._Page, 3);
		public static final ExecutorProperty _Page__pages = new EcoreExecutorProperty(A3Package.Literals.PAGE__PAGES, Types._Page, 4);
		public static final ExecutorProperty _Page__title = new EcoreExecutorProperty(A3Package.Literals.PAGE__TITLE, Types._Page, 5);
		public static final ExecutorProperty _Page__url = new EcoreExecutorProperty(A3Package.Literals.PAGE__URL, Types._Page, 6);
		public static final ExecutorProperty _Page__Page__pages = new ExecutorPropertyWithImplementation("Page", Types._Page, 7, new EcoreLibraryOppositeProperty(A3Package.Literals.PAGE__PAGES));
		public static final ExecutorProperty _Page__System__pages = new ExecutorPropertyWithImplementation("System", Types._Page, 8, new EcoreLibraryOppositeProperty(A3Package.Literals.SYSTEM__PAGES));

		public static final ExecutorProperty _Reference__ref = new EcoreExecutorProperty(A3Package.Literals.REFERENCE__REF, Types._Reference, 0);

		public static final ExecutorProperty _S_Index__S_Index_identifier = new EcoreExecutorProperty(A3Package.Literals.SINDEX__SINDEX_IDENTIFIER, Types._S_Index, 0);
		public static final ExecutorProperty _S_Index__s_individual = new EcoreExecutorProperty(A3Package.Literals.SINDEX__SINDIVIDUAL, Types._S_Index, 1);

		public static final ExecutorProperty _S_Individual__Individual_identifier = new EcoreExecutorProperty(A3Package.Literals.SINDIVIDUAL__INDIVIDUAL_IDENTIFIER, Types._S_Individual, 0);
		public static final ExecutorProperty _S_Individual__S_Index__s_individual = new ExecutorPropertyWithImplementation("S_Index", Types._S_Individual, 1, new EcoreLibraryOppositeProperty(A3Package.Literals.SINDEX__SINDIVIDUAL));

		public static final ExecutorProperty _Static_Content__type = new EcoreExecutorProperty(A3Package.Literals.STATIC_CONTENT__TYPE, Types._Static_Content, 0);
		public static final ExecutorProperty _Static_Content__Page__S_content = new ExecutorPropertyWithImplementation("Page", Types._Static_Content, 1, new EcoreLibraryOppositeProperty(A3Package.Literals.PAGE__SCONTENT));

		public static final ExecutorProperty _System__entities = new EcoreExecutorProperty(A3Package.Literals.SYSTEM__ENTITIES, Types._System, 0);
		public static final ExecutorProperty _System__pages = new EcoreExecutorProperty(A3Package.Literals.SYSTEM__PAGES, Types._System, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3Tables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _D_Content =
			{
				Fragments._D_Content__OclAny /* 0 */,
				Fragments._D_Content__OclElement /* 1 */,
				Fragments._D_Content__D_Content /* 2 */
			};
		private static final int /*@NonNull*/ [] __D_Content = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _D_Index =
			{
				Fragments._D_Index__OclAny /* 0 */,
				Fragments._D_Index__OclElement /* 1 */,
				Fragments._D_Index__D_Content /* 2 */,
				Fragments._D_Index__D_Index /* 3 */
			};
		private static final int /*@NonNull*/ [] __D_Index = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _D_Individual =
			{
				Fragments._D_Individual__OclAny /* 0 */,
				Fragments._D_Individual__OclElement /* 1 */,
				Fragments._D_Individual__D_Content /* 2 */,
				Fragments._D_Individual__D_Individual /* 3 */
			};
		private static final int /*@NonNull*/ [] __D_Individual = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__OclEnumeration /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

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

		private static final ExecutorFragment /*@NonNull*/ [] _FeatureType =
			{
				Fragments._FeatureType__OclAny /* 0 */,
				Fragments._FeatureType__OclElement /* 1 */,
				Fragments._FeatureType__OclType /* 2 */,
				Fragments._FeatureType__OclEnumeration /* 3 */,
				Fragments._FeatureType__FeatureType /* 4 */
			};
		private static final int /*@NonNull*/ [] __FeatureType = { 1,1,1,1,1 };

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
				Fragments._Page__Page /* 2 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Reference =
			{
				Fragments._Reference__OclAny /* 0 */,
				Fragments._Reference__OclElement /* 1 */,
				Fragments._Reference__Named /* 2 */,
				Fragments._Reference__Feature /* 3 */,
				Fragments._Reference__Reference /* 4 */
			};
		private static final int /*@NonNull*/ [] __Reference = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _S_Index =
			{
				Fragments._S_Index__OclAny /* 0 */,
				Fragments._S_Index__OclElement /* 1 */,
				Fragments._S_Index__Static_Content /* 2 */,
				Fragments._S_Index__S_Index /* 3 */
			};
		private static final int /*@NonNull*/ [] __S_Index = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _S_Individual =
			{
				Fragments._S_Individual__OclAny /* 0 */,
				Fragments._S_Individual__OclElement /* 1 */,
				Fragments._S_Individual__Static_Content /* 2 */,
				Fragments._S_Individual__S_Individual /* 3 */
			};
		private static final int /*@NonNull*/ [] __S_Individual = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Static_Content =
			{
				Fragments._Static_Content__OclAny /* 0 */,
				Fragments._Static_Content__OclElement /* 1 */,
				Fragments._Static_Content__Static_Content /* 2 */
			};
		private static final int /*@NonNull*/ [] __Static_Content = { 1,1,1 };

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
			Types._D_Content.initFragments(_D_Content, __D_Content);
			Types._D_Index.initFragments(_D_Index, __D_Index);
			Types._D_Individual.initFragments(_D_Individual, __D_Individual);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._Feature.initFragments(_Feature, __Feature);
			Types._FeatureType.initFragments(_FeatureType, __FeatureType);
			Types._Named.initFragments(_Named, __Named);
			Types._Page.initFragments(_Page, __Page);
			Types._Reference.initFragments(_Reference, __Reference);
			Types._S_Index.initFragments(_S_Index, __S_Index);
			Types._S_Individual.initFragments(_S_Individual, __S_Individual);
			Types._Static_Content.initFragments(_Static_Content, __Static_Content);
			Types._System.initFragments(_System, __System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3Tables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _D_Content__D_Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _D_Content__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _D_Content__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _D_Index__D_Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _D_Index__D_Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _D_Index__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _D_Index__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _D_Individual__D_Individual = {};
		private static final ExecutorOperation /*@NonNull*/ [] _D_Individual__D_Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _D_Individual__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _D_Individual__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__FeatureType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__OclType = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _S_Index__S_Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _S_Index__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _S_Index__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _S_Index__Static_Content = {};

		private static final ExecutorOperation /*@NonNull*/ [] _S_Individual__S_Individual = {};
		private static final ExecutorOperation /*@NonNull*/ [] _S_Individual__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _S_Individual__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _S_Individual__Static_Content = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Static_Content__Static_Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Static_Content__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Static_Content__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _System__System = {
			A3Tables.Operations._System__numberOfEntities /* numberOfEntities() */,
			A3Tables.Operations._System__numberOfPages /* numberOfPages() */
		};
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

			Fragments._D_Content__D_Content.initOperations(_D_Content__D_Content);
			Fragments._D_Content__OclAny.initOperations(_D_Content__OclAny);
			Fragments._D_Content__OclElement.initOperations(_D_Content__OclElement);

			Fragments._D_Index__D_Content.initOperations(_D_Index__D_Content);
			Fragments._D_Index__D_Index.initOperations(_D_Index__D_Index);
			Fragments._D_Index__OclAny.initOperations(_D_Index__OclAny);
			Fragments._D_Index__OclElement.initOperations(_D_Index__OclElement);

			Fragments._D_Individual__D_Content.initOperations(_D_Individual__D_Content);
			Fragments._D_Individual__D_Individual.initOperations(_D_Individual__D_Individual);
			Fragments._D_Individual__OclAny.initOperations(_D_Individual__OclAny);
			Fragments._D_Individual__OclElement.initOperations(_D_Individual__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclEnumeration.initOperations(_DataType__OclEnumeration);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__Named.initOperations(_Entity__Named);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__Named.initOperations(_Feature__Named);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__OclElement.initOperations(_Feature__OclElement);

			Fragments._FeatureType__FeatureType.initOperations(_FeatureType__FeatureType);
			Fragments._FeatureType__OclAny.initOperations(_FeatureType__OclAny);
			Fragments._FeatureType__OclElement.initOperations(_FeatureType__OclElement);
			Fragments._FeatureType__OclEnumeration.initOperations(_FeatureType__OclEnumeration);
			Fragments._FeatureType__OclType.initOperations(_FeatureType__OclType);

			Fragments._Named__Named.initOperations(_Named__Named);
			Fragments._Named__OclAny.initOperations(_Named__OclAny);
			Fragments._Named__OclElement.initOperations(_Named__OclElement);

			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._Reference__Feature.initOperations(_Reference__Feature);
			Fragments._Reference__Named.initOperations(_Reference__Named);
			Fragments._Reference__OclAny.initOperations(_Reference__OclAny);
			Fragments._Reference__OclElement.initOperations(_Reference__OclElement);
			Fragments._Reference__Reference.initOperations(_Reference__Reference);

			Fragments._S_Index__OclAny.initOperations(_S_Index__OclAny);
			Fragments._S_Index__OclElement.initOperations(_S_Index__OclElement);
			Fragments._S_Index__S_Index.initOperations(_S_Index__S_Index);
			Fragments._S_Index__Static_Content.initOperations(_S_Index__Static_Content);

			Fragments._S_Individual__OclAny.initOperations(_S_Individual__OclAny);
			Fragments._S_Individual__OclElement.initOperations(_S_Individual__OclElement);
			Fragments._S_Individual__S_Individual.initOperations(_S_Individual__S_Individual);
			Fragments._S_Individual__Static_Content.initOperations(_S_Individual__Static_Content);

			Fragments._Static_Content__OclAny.initOperations(_Static_Content__OclAny);
			Fragments._Static_Content__OclElement.initOperations(_Static_Content__OclElement);
			Fragments._Static_Content__Static_Content.initOperations(_Static_Content__Static_Content);

			Fragments._System__Named.initOperations(_System__Named);
			Fragments._System__OclAny.initOperations(_System__OclAny);
			Fragments._System__OclElement.initOperations(_System__OclElement);
			Fragments._System__System.initOperations(_System__System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3Tables::FragmentOperations and all preceding sub-packages.
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
			A3Tables.Properties._Feature__isPrimaryKey,
			A3Tables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3Tables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _D_Content = {
			A3Tables.Properties._D_Content__entity,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _D_Index = {
			A3Tables.Properties._D_Index__Index_identifier,
			A3Tables.Properties._D_Index__Individual,
			A3Tables.Properties._D_Content__entity,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _D_Individual = {
			A3Tables.Properties._D_Individual__Individual_identifier,
			A3Tables.Properties._D_Content__entity,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			A3Tables.Properties._Entity__features,
			A3Tables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Feature = {
			A3Tables.Properties._Feature__isPrimaryKey,
			A3Tables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FeatureType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Named = {
			A3Tables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			A3Tables.Properties._Page__D_content,
			A3Tables.Properties._Page__S_content,
			A3Tables.Properties._Page__country,
			A3Tables.Properties._Page__identifier,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3Tables.Properties._Page__pages,
			A3Tables.Properties._Page__title,
			A3Tables.Properties._Page__url
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Reference = {
			A3Tables.Properties._Feature__isPrimaryKey,
			A3Tables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3Tables.Properties._Reference__ref
		};

		private static final ExecutorProperty /*@NonNull*/ [] _S_Index = {
			A3Tables.Properties._S_Index__S_Index_identifier,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3Tables.Properties._S_Index__s_individual,
			A3Tables.Properties._Static_Content__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _S_Individual = {
			A3Tables.Properties._S_Individual__Individual_identifier,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3Tables.Properties._Static_Content__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Static_Content = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3Tables.Properties._Static_Content__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _System = {
			A3Tables.Properties._System__entities,
			A3Tables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3Tables.Properties._System__pages
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._D_Content__D_Content.initProperties(_D_Content);
			Fragments._D_Index__D_Index.initProperties(_D_Index);
			Fragments._D_Individual__D_Individual.initProperties(_D_Individual);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._Feature__Feature.initProperties(_Feature);
			Fragments._FeatureType__FeatureType.initProperties(_FeatureType);
			Fragments._Named__Named.initProperties(_Named);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._Reference__Reference.initProperties(_Reference);
			Fragments._S_Index__S_Index.initProperties(_S_Index);
			Fragments._S_Individual__S_Individual.initProperties(_S_Individual);
			Fragments._Static_Content__Static_Content.initProperties(_Static_Content);
			Fragments._System__System.initProperties(_System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3Tables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral _DataType__int = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("int"), Types._DataType, 0);
		public static final EcoreExecutorEnumerationLiteral _DataType__string = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("string"), Types._DataType, 1);
		public static final EcoreExecutorEnumerationLiteral _DataType__text = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("text"), Types._DataType, 2);
		public static final EcoreExecutorEnumerationLiteral _DataType__bool = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("bool"), Types._DataType, 3);
		public static final EcoreExecutorEnumerationLiteral _DataType__date = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("date"), Types._DataType, 4);
		public static final EcoreExecutorEnumerationLiteral _DataType__file = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("file"), Types._DataType, 5);
		public static final EcoreExecutorEnumerationLiteral _DataType__currency = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("currency"), Types._DataType, 6);
		public static final EcoreExecutorEnumerationLiteral _DataType__percent = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("percent"), Types._DataType, 7);
		public static final EcoreExecutorEnumerationLiteral _DataType__image = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("image"), Types._DataType, 8);
		public static final EcoreExecutorEnumerationLiteral _DataType__images = new EcoreExecutorEnumerationLiteral(A3Package.Literals.DATA_TYPE.getEEnumLiteral("images"), Types._DataType, 9);
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

		public static final EcoreExecutorEnumerationLiteral _FeatureType__int = new EcoreExecutorEnumerationLiteral(A3Package.Literals.FEATURE_TYPE.getEEnumLiteral("int"), Types._FeatureType, 0);
		public static final EcoreExecutorEnumerationLiteral _FeatureType__VARCHAR = new EcoreExecutorEnumerationLiteral(A3Package.Literals.FEATURE_TYPE.getEEnumLiteral("VARCHAR"), Types._FeatureType, 1);
		public static final EcoreExecutorEnumerationLiteral _FeatureType__text = new EcoreExecutorEnumerationLiteral(A3Package.Literals.FEATURE_TYPE.getEEnumLiteral("text"), Types._FeatureType, 2);
		public static final EcoreExecutorEnumerationLiteral _FeatureType__bool = new EcoreExecutorEnumerationLiteral(A3Package.Literals.FEATURE_TYPE.getEEnumLiteral("bool"), Types._FeatureType, 3);
		public static final EcoreExecutorEnumerationLiteral _FeatureType__date = new EcoreExecutorEnumerationLiteral(A3Package.Literals.FEATURE_TYPE.getEEnumLiteral("date"), Types._FeatureType, 4);
		public static final EcoreExecutorEnumerationLiteral _FeatureType__image = new EcoreExecutorEnumerationLiteral(A3Package.Literals.FEATURE_TYPE.getEEnumLiteral("image"), Types._FeatureType, 5);
		public static final EcoreExecutorEnumerationLiteral _FeatureType__longtext = new EcoreExecutorEnumerationLiteral(A3Package.Literals.FEATURE_TYPE.getEEnumLiteral("longtext"), Types._FeatureType, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _FeatureType = {
			_FeatureType__int,
			_FeatureType__VARCHAR,
			_FeatureType__text,
			_FeatureType__bool,
			_FeatureType__date,
			_FeatureType__image,
			_FeatureType__longtext
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DataType.initLiterals(_DataType);
			Types._FeatureType.initLiterals(_FeatureType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3Tables::EnumerationLiterals and all preceding sub-packages.
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
		new A3Tables();
	}

	private A3Tables() {
		super(A3Package.eNS_URI);
	}
}
