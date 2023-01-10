/**
 */
package A3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see A3.A3Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface A3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "A3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Model2TextModel/model/A3.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "A3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A3Package eINSTANCE = A3.impl.A3PackageImpl.init();

	/**
	 * The meta object id for the '{@link A3.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.NamedImpl
	 * @see A3.impl.A3PackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Name Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___NAME_FORMAT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Name Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___NAME_SIZE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link A3.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.SystemImpl
	 * @see A3.impl.A3PackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ENTITIES = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PAGES = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___NAME_FORMAT__DIAGNOSTICCHAIN_MAP = NAMED___NAME_FORMAT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Name Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___NAME_SIZE__DIAGNOSTICCHAIN_MAP = NAMED___NAME_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Number Of Pages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___NUMBER_OF_PAGES = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Number Of Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___NUMBER_OF_ENTITIES = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link A3.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.EntityImpl
	 * @see A3.impl.A3PackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FEATURES = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___NAME_FORMAT__DIAGNOSTICCHAIN_MAP = NAMED___NAME_FORMAT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Name Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___NAME_SIZE__DIAGNOSTICCHAIN_MAP = NAMED___NAME_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Contains PK</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___CONTAINS_PK__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link A3.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.FeatureImpl
	 * @see A3.impl.A3PackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_PRIMARY_KEY = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___NAME_FORMAT__DIAGNOSTICCHAIN_MAP = NAMED___NAME_FORMAT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Name Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___NAME_SIZE__DIAGNOSTICCHAIN_MAP = NAMED___NAME_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link A3.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.AttributeImpl
	 * @see A3.impl.A3PackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_PRIMARY_KEY = FEATURE__IS_PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___NAME_FORMAT__DIAGNOSTICCHAIN_MAP = FEATURE___NAME_FORMAT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Name Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___NAME_SIZE__DIAGNOSTICCHAIN_MAP = FEATURE___NAME_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link A3.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.ReferenceImpl
	 * @see A3.impl.A3PackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_PRIMARY_KEY = FEATURE__IS_PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REF = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___NAME_FORMAT__DIAGNOSTICCHAIN_MAP = FEATURE___NAME_FORMAT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Name Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___NAME_SIZE__DIAGNOSTICCHAIN_MAP = FEATURE___NAME_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link A3.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.PageImpl
	 * @see A3.impl.A3PackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__URL = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Dcontent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DCONTENT = 3;

	/**
	 * The feature id for the '<em><b>Scontent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SCONTENT = 4;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGES = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__COUNTRY = 6;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Url Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___URL_CONTAINS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link A3.impl.D_ContentImpl <em>DContent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.D_ContentImpl
	 * @see A3.impl.A3PackageImpl#getD_Content()
	 * @generated
	 */
	int DCONTENT = 7;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTENT__ENTITY = 0;

	/**
	 * The number of structural features of the '<em>DContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link A3.impl.Static_ContentImpl <em>Static Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.Static_ContentImpl
	 * @see A3.impl.A3PackageImpl#getStatic_Content()
	 * @generated
	 */
	int STATIC_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Static Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Static Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link A3.impl.S_IndexImpl <em>SIndex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.S_IndexImpl
	 * @see A3.impl.A3PackageImpl#getS_Index()
	 * @generated
	 */
	int SINDEX = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDEX__TYPE = STATIC_CONTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Sindividual</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDEX__SINDIVIDUAL = STATIC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SIndex identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDEX__SINDEX_IDENTIFIER = STATIC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SIndex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDEX_FEATURE_COUNT = STATIC_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SIndex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDEX_OPERATION_COUNT = STATIC_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link A3.impl.S_IndividualImpl <em>SIndividual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.S_IndividualImpl
	 * @see A3.impl.A3PackageImpl#getS_Individual()
	 * @generated
	 */
	int SINDIVIDUAL = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDIVIDUAL__TYPE = STATIC_CONTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Individual identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDIVIDUAL__INDIVIDUAL_IDENTIFIER = STATIC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SIndividual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDIVIDUAL_FEATURE_COUNT = STATIC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SIndividual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINDIVIDUAL_OPERATION_COUNT = STATIC_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link A3.impl.D_IndexImpl <em>DIndex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.D_IndexImpl
	 * @see A3.impl.A3PackageImpl#getD_Index()
	 * @generated
	 */
	int DINDEX = 11;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX__ENTITY = DCONTENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX__INDIVIDUAL = DCONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX__INDEX_IDENTIFIER = DCONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DIndex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX_FEATURE_COUNT = DCONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DIndex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDEX_OPERATION_COUNT = DCONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link A3.impl.D_IndividualImpl <em>DIndividual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.impl.D_IndividualImpl
	 * @see A3.impl.A3PackageImpl#getD_Individual()
	 * @generated
	 */
	int DINDIVIDUAL = 12;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDIVIDUAL__ENTITY = DCONTENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Individual identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDIVIDUAL__INDIVIDUAL_IDENTIFIER = DCONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DIndividual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDIVIDUAL_FEATURE_COUNT = DCONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DIndividual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINDIVIDUAL_OPERATION_COUNT = DCONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link A3.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.DataType
	 * @see A3.impl.A3PackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The meta object id for the '{@link A3.FeatureType <em>Feature Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see A3.FeatureType
	 * @see A3.impl.A3PackageImpl#getFeatureType()
	 * @generated
	 */
	int FEATURE_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link A3.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see A3.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link A3.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see A3.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for the '{@link A3.Named#Name_Format(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Format</em>' operation.
	 * @see A3.Named#Name_Format(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNamed__Name_Format__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link A3.Named#Name_Size(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Size</em>' operation.
	 * @see A3.Named#Name_Size(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNamed__Name_Size__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link A3.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see A3.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link A3.System#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see A3.System#getEntities()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link A3.System#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see A3.System#getPages()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Pages();

	/**
	 * Returns the meta object for the '{@link A3.System#numberOfPages() <em>Number Of Pages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Pages</em>' operation.
	 * @see A3.System#numberOfPages()
	 * @generated
	 */
	EOperation getSystem__NumberOfPages();

	/**
	 * Returns the meta object for the '{@link A3.System#numberOfEntities() <em>Number Of Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Entities</em>' operation.
	 * @see A3.System#numberOfEntities()
	 * @generated
	 */
	EOperation getSystem__NumberOfEntities();

	/**
	 * Returns the meta object for class '{@link A3.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see A3.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link A3.Entity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see A3.Entity#getFeatures()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Features();

	/**
	 * Returns the meta object for the '{@link A3.Entity#containsPK(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contains PK</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains PK</em>' operation.
	 * @see A3.Entity#containsPK(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__ContainsPK__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link A3.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see A3.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link A3.Feature#isIsPrimaryKey <em>Is Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary Key</em>'.
	 * @see A3.Feature#isIsPrimaryKey()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsPrimaryKey();

	/**
	 * Returns the meta object for class '{@link A3.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see A3.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link A3.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see A3.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link A3.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see A3.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference list '{@link A3.Reference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref</em>'.
	 * @see A3.Reference#getRef()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Ref();

	/**
	 * Returns the meta object for class '{@link A3.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see A3.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link A3.Page#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see A3.Page#getIdentifier()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link A3.Page#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see A3.Page#getUrl()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Url();

	/**
	 * Returns the meta object for the attribute '{@link A3.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see A3.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference '{@link A3.Page#getD_content <em>Dcontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dcontent</em>'.
	 * @see A3.Page#getD_content()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_D_content();

	/**
	 * Returns the meta object for the containment reference '{@link A3.Page#getS_content <em>Scontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scontent</em>'.
	 * @see A3.Page#getS_content()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_S_content();

	/**
	 * Returns the meta object for the reference '{@link A3.Page#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pages</em>'.
	 * @see A3.Page#getPages()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pages();

	/**
	 * Returns the meta object for the attribute '{@link A3.Page#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see A3.Page#getCountry()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Country();

	/**
	 * Returns the meta object for the '{@link A3.Page#UrlContains(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Url Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Url Contains</em>' operation.
	 * @see A3.Page#UrlContains(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__UrlContains__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link A3.D_Content <em>DContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DContent</em>'.
	 * @see A3.D_Content
	 * @generated
	 */
	EClass getD_Content();

	/**
	 * Returns the meta object for the reference list '{@link A3.D_Content#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity</em>'.
	 * @see A3.D_Content#getEntity()
	 * @see #getD_Content()
	 * @generated
	 */
	EReference getD_Content_Entity();

	/**
	 * Returns the meta object for class '{@link A3.Static_Content <em>Static Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Content</em>'.
	 * @see A3.Static_Content
	 * @generated
	 */
	EClass getStatic_Content();

	/**
	 * Returns the meta object for the attribute '{@link A3.Static_Content#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see A3.Static_Content#getType()
	 * @see #getStatic_Content()
	 * @generated
	 */
	EAttribute getStatic_Content_Type();

	/**
	 * Returns the meta object for class '{@link A3.S_Index <em>SIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIndex</em>'.
	 * @see A3.S_Index
	 * @generated
	 */
	EClass getS_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link A3.S_Index#getS_individual <em>Sindividual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sindividual</em>'.
	 * @see A3.S_Index#getS_individual()
	 * @see #getS_Index()
	 * @generated
	 */
	EReference getS_Index_S_individual();

	/**
	 * Returns the meta object for the attribute '{@link A3.S_Index#getS_Index_identifier <em>SIndex identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SIndex identifier</em>'.
	 * @see A3.S_Index#getS_Index_identifier()
	 * @see #getS_Index()
	 * @generated
	 */
	EAttribute getS_Index_S_Index_identifier();

	/**
	 * Returns the meta object for class '{@link A3.S_Individual <em>SIndividual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIndividual</em>'.
	 * @see A3.S_Individual
	 * @generated
	 */
	EClass getS_Individual();

	/**
	 * Returns the meta object for the attribute '{@link A3.S_Individual#getIndividual_identifier <em>Individual identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual identifier</em>'.
	 * @see A3.S_Individual#getIndividual_identifier()
	 * @see #getS_Individual()
	 * @generated
	 */
	EAttribute getS_Individual_Individual_identifier();

	/**
	 * Returns the meta object for class '{@link A3.D_Index <em>DIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIndex</em>'.
	 * @see A3.D_Index
	 * @generated
	 */
	EClass getD_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link A3.D_Index#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual</em>'.
	 * @see A3.D_Index#getIndividual()
	 * @see #getD_Index()
	 * @generated
	 */
	EReference getD_Index_Individual();

	/**
	 * Returns the meta object for the attribute '{@link A3.D_Index#getIndex_identifier <em>Index identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index identifier</em>'.
	 * @see A3.D_Index#getIndex_identifier()
	 * @see #getD_Index()
	 * @generated
	 */
	EAttribute getD_Index_Index_identifier();

	/**
	 * Returns the meta object for class '{@link A3.D_Individual <em>DIndividual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIndividual</em>'.
	 * @see A3.D_Individual
	 * @generated
	 */
	EClass getD_Individual();

	/**
	 * Returns the meta object for the attribute '{@link A3.D_Individual#getIndividual_identifier <em>Individual identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual identifier</em>'.
	 * @see A3.D_Individual#getIndividual_identifier()
	 * @see #getD_Individual()
	 * @generated
	 */
	EAttribute getD_Individual_Individual_identifier();

	/**
	 * Returns the meta object for enum '{@link A3.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see A3.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link A3.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Type</em>'.
	 * @see A3.FeatureType
	 * @generated
	 */
	EEnum getFeatureType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	A3Factory getA3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link A3.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.NamedImpl
		 * @see A3.impl.A3PackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '<em><b>Name Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED___NAME_FORMAT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNamed__Name_Format__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Name Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED___NAME_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNamed__Name_Size__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link A3.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.SystemImpl
		 * @see A3.impl.A3PackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ENTITIES = eINSTANCE.getSystem_Entities();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PAGES = eINSTANCE.getSystem_Pages();

		/**
		 * The meta object literal for the '<em><b>Number Of Pages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___NUMBER_OF_PAGES = eINSTANCE.getSystem__NumberOfPages();

		/**
		 * The meta object literal for the '<em><b>Number Of Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___NUMBER_OF_ENTITIES = eINSTANCE.getSystem__NumberOfEntities();

		/**
		 * The meta object literal for the '{@link A3.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.EntityImpl
		 * @see A3.impl.A3PackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

		/**
		 * The meta object literal for the '<em><b>Contains PK</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___CONTAINS_PK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__ContainsPK__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link A3.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.FeatureImpl
		 * @see A3.impl.A3PackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Is Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_PRIMARY_KEY = eINSTANCE.getFeature_IsPrimaryKey();

		/**
		 * The meta object literal for the '{@link A3.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.AttributeImpl
		 * @see A3.impl.A3PackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link A3.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.ReferenceImpl
		 * @see A3.impl.A3PackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REF = eINSTANCE.getReference_Ref();

		/**
		 * The meta object literal for the '{@link A3.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.PageImpl
		 * @see A3.impl.A3PackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__IDENTIFIER = eINSTANCE.getPage_Identifier();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__URL = eINSTANCE.getPage_Url();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Dcontent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__DCONTENT = eINSTANCE.getPage_D_content();

		/**
		 * The meta object literal for the '<em><b>Scontent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SCONTENT = eINSTANCE.getPage_S_content();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGES = eINSTANCE.getPage_Pages();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__COUNTRY = eINSTANCE.getPage_Country();

		/**
		 * The meta object literal for the '<em><b>Url Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___URL_CONTAINS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__UrlContains__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link A3.impl.D_ContentImpl <em>DContent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.D_ContentImpl
		 * @see A3.impl.A3PackageImpl#getD_Content()
		 * @generated
		 */
		EClass DCONTENT = eINSTANCE.getD_Content();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONTENT__ENTITY = eINSTANCE.getD_Content_Entity();

		/**
		 * The meta object literal for the '{@link A3.impl.Static_ContentImpl <em>Static Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.Static_ContentImpl
		 * @see A3.impl.A3PackageImpl#getStatic_Content()
		 * @generated
		 */
		EClass STATIC_CONTENT = eINSTANCE.getStatic_Content();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_CONTENT__TYPE = eINSTANCE.getStatic_Content_Type();

		/**
		 * The meta object literal for the '{@link A3.impl.S_IndexImpl <em>SIndex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.S_IndexImpl
		 * @see A3.impl.A3PackageImpl#getS_Index()
		 * @generated
		 */
		EClass SINDEX = eINSTANCE.getS_Index();

		/**
		 * The meta object literal for the '<em><b>Sindividual</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINDEX__SINDIVIDUAL = eINSTANCE.getS_Index_S_individual();

		/**
		 * The meta object literal for the '<em><b>SIndex identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINDEX__SINDEX_IDENTIFIER = eINSTANCE.getS_Index_S_Index_identifier();

		/**
		 * The meta object literal for the '{@link A3.impl.S_IndividualImpl <em>SIndividual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.S_IndividualImpl
		 * @see A3.impl.A3PackageImpl#getS_Individual()
		 * @generated
		 */
		EClass SINDIVIDUAL = eINSTANCE.getS_Individual();

		/**
		 * The meta object literal for the '<em><b>Individual identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINDIVIDUAL__INDIVIDUAL_IDENTIFIER = eINSTANCE.getS_Individual_Individual_identifier();

		/**
		 * The meta object literal for the '{@link A3.impl.D_IndexImpl <em>DIndex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.D_IndexImpl
		 * @see A3.impl.A3PackageImpl#getD_Index()
		 * @generated
		 */
		EClass DINDEX = eINSTANCE.getD_Index();

		/**
		 * The meta object literal for the '<em><b>Individual</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINDEX__INDIVIDUAL = eINSTANCE.getD_Index_Individual();

		/**
		 * The meta object literal for the '<em><b>Index identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DINDEX__INDEX_IDENTIFIER = eINSTANCE.getD_Index_Index_identifier();

		/**
		 * The meta object literal for the '{@link A3.impl.D_IndividualImpl <em>DIndividual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.impl.D_IndividualImpl
		 * @see A3.impl.A3PackageImpl#getD_Individual()
		 * @generated
		 */
		EClass DINDIVIDUAL = eINSTANCE.getD_Individual();

		/**
		 * The meta object literal for the '<em><b>Individual identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DINDIVIDUAL__INDIVIDUAL_IDENTIFIER = eINSTANCE.getD_Individual_Individual_identifier();

		/**
		 * The meta object literal for the '{@link A3.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.DataType
		 * @see A3.impl.A3PackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link A3.FeatureType <em>Feature Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see A3.FeatureType
		 * @see A3.impl.A3PackageImpl#getFeatureType()
		 * @generated
		 */
		EEnum FEATURE_TYPE = eINSTANCE.getFeatureType();

	}

} //A3Package
