/**
 */
package A3.impl;

import A3.A3Factory;
import A3.A3Package;
import A3.Attribute;
import A3.D_Content;
import A3.D_Index;
import A3.D_Individual;
import A3.DataType;
import A3.Entity;
import A3.Feature;
import A3.FeatureType;
import A3.Named;
import A3.Page;
import A3.Reference;
import A3.S_Index;
import A3.S_Individual;
import A3.Static_Content;

import A3.util.A3Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A3PackageImpl extends EPackageImpl implements A3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_ContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass static_ContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_IndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_IndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_IndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_IndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see A3.A3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private A3PackageImpl() {
		super(eNS_URI, A3Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link A3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static A3Package init() {
		if (isInited) return (A3Package)EPackage.Registry.INSTANCE.getEPackage(A3Package.eNS_URI);

		// Obtain or create and register package
		Object registeredA3Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		A3PackageImpl theA3Package = registeredA3Package instanceof A3PackageImpl ? (A3PackageImpl)registeredA3Package : new A3PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theA3Package.createPackageContents();

		// Initialize created meta-data
		theA3Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theA3Package,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return A3Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theA3Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(A3Package.eNS_URI, theA3Package);
		return theA3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamed__Name_Format__DiagnosticChain_Map() {
		return namedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamed__Name_Size__DiagnosticChain_Map() {
		return namedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Entities() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Pages() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__NumberOfPages() {
		return systemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__NumberOfEntities() {
		return systemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Features() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__ContainsPK__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsPrimaryKey() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Ref() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Identifier() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Url() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_D_content() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_S_content() {
		return (EReference)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Pages() {
		return (EReference)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Country() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__UrlContains__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_Content() {
		return d_ContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getD_Content_Entity() {
		return (EReference)d_ContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatic_Content() {
		return static_ContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatic_Content_Type() {
		return (EAttribute)static_ContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_Index() {
		return s_IndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getS_Index_S_individual() {
		return (EReference)s_IndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getS_Index_S_Index_identifier() {
		return (EAttribute)s_IndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_Individual() {
		return s_IndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getS_Individual_Individual_identifier() {
		return (EAttribute)s_IndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_Index() {
		return d_IndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getD_Index_Individual() {
		return (EReference)d_IndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD_Index_Index_identifier() {
		return (EAttribute)d_IndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD_Individual() {
		return d_IndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD_Individual_Individual_identifier() {
		return (EAttribute)d_IndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeatureType() {
		return featureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A3Factory getA3Factory() {
		return (A3Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);
		createEOperation(namedEClass, NAMED___NAME_FORMAT__DIAGNOSTICCHAIN_MAP);
		createEOperation(namedEClass, NAMED___NAME_SIZE__DIAGNOSTICCHAIN_MAP);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__ENTITIES);
		createEReference(systemEClass, SYSTEM__PAGES);
		createEOperation(systemEClass, SYSTEM___NUMBER_OF_PAGES);
		createEOperation(systemEClass, SYSTEM___NUMBER_OF_ENTITIES);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__FEATURES);
		createEOperation(entityEClass, ENTITY___CONTAINS_PK__DIAGNOSTICCHAIN_MAP);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__IS_PRIMARY_KEY);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__REF);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__IDENTIFIER);
		createEAttribute(pageEClass, PAGE__URL);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEReference(pageEClass, PAGE__DCONTENT);
		createEReference(pageEClass, PAGE__SCONTENT);
		createEReference(pageEClass, PAGE__PAGES);
		createEAttribute(pageEClass, PAGE__COUNTRY);
		createEOperation(pageEClass, PAGE___URL_CONTAINS__DIAGNOSTICCHAIN_MAP);

		d_ContentEClass = createEClass(DCONTENT);
		createEReference(d_ContentEClass, DCONTENT__ENTITY);

		static_ContentEClass = createEClass(STATIC_CONTENT);
		createEAttribute(static_ContentEClass, STATIC_CONTENT__TYPE);

		s_IndexEClass = createEClass(SINDEX);
		createEReference(s_IndexEClass, SINDEX__SINDIVIDUAL);
		createEAttribute(s_IndexEClass, SINDEX__SINDEX_IDENTIFIER);

		s_IndividualEClass = createEClass(SINDIVIDUAL);
		createEAttribute(s_IndividualEClass, SINDIVIDUAL__INDIVIDUAL_IDENTIFIER);

		d_IndexEClass = createEClass(DINDEX);
		createEReference(d_IndexEClass, DINDEX__INDIVIDUAL);
		createEAttribute(d_IndexEClass, DINDEX__INDEX_IDENTIFIER);

		d_IndividualEClass = createEClass(DINDIVIDUAL);
		createEAttribute(d_IndividualEClass, DINDIVIDUAL__INDIVIDUAL_IDENTIFIER);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		featureTypeEEnum = createEEnum(FEATURE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemEClass.getESuperTypes().add(this.getNamed());
		entityEClass.getESuperTypes().add(this.getNamed());
		featureEClass.getESuperTypes().add(this.getNamed());
		attributeEClass.getESuperTypes().add(this.getFeature());
		referenceEClass.getESuperTypes().add(this.getFeature());
		s_IndexEClass.getESuperTypes().add(this.getStatic_Content());
		s_IndividualEClass.getESuperTypes().add(this.getStatic_Content());
		d_IndexEClass.getESuperTypes().add(this.getD_Content());
		d_IndividualEClass.getESuperTypes().add(this.getD_Content());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedEClass, Named.class, "Named", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 1, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNamed__Name_Format__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Name_Format", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNamed__Name_Size__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Name_Size", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemEClass, A3.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Entities(), this.getEntity(), null, "entities", null, 0, -1, A3.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Pages(), this.getPage(), null, "pages", null, 0, -1, A3.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSystem__NumberOfPages(), ecorePackage.getEBigInteger(), "numberOfPages", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSystem__NumberOfEntities(), ecorePackage.getEBigInteger(), "numberOfEntities", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 1, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEntity__ContainsPK__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "containsPK", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_IsPrimaryKey(), ecorePackage.getEBoolean(), "isPrimaryKey", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Type(), this.getFeatureType(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Ref(), this.getEntity(), null, "ref", null, 1, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Identifier(), ecorePackage.getEBigInteger(), "identifier", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Url(), ecorePackage.getEString(), "url", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_D_content(), this.getD_Content(), null, "D_content", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_S_content(), this.getStatic_Content(), null, "S_content", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Pages(), this.getPage(), null, "pages", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Country(), ecorePackage.getEString(), "country", null, 0, 1, Page.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPage__UrlContains__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UrlContains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(d_ContentEClass, D_Content.class, "D_Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getD_Content_Entity(), this.getEntity(), null, "entity", null, 1, -1, D_Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(static_ContentEClass, Static_Content.class, "Static_Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatic_Content_Type(), this.getDataType(), "type", null, 1, 1, Static_Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(s_IndexEClass, S_Index.class, "S_Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getS_Index_S_individual(), this.getS_Individual(), null, "s_individual", null, 1, -1, S_Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getS_Index_S_Index_identifier(), ecorePackage.getEString(), "S_Index_identifier", null, 0, 1, S_Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(s_IndividualEClass, S_Individual.class, "S_Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getS_Individual_Individual_identifier(), ecorePackage.getEBigInteger(), "Individual_identifier", null, 0, 1, S_Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(d_IndexEClass, D_Index.class, "D_Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getD_Index_Individual(), this.getD_Individual(), null, "Individual", null, 1, -1, D_Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD_Index_Index_identifier(), ecorePackage.getEBigInteger(), "Index_identifier", null, 0, 1, D_Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(d_IndividualEClass, D_Individual.class, "D_Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getD_Individual_Individual_identifier(), ecorePackage.getEBigInteger(), "Individual_identifier", null, 0, 1, D_Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.TEXT);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOL);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE);
		addEEnumLiteral(dataTypeEEnum, DataType.FILE);
		addEEnumLiteral(dataTypeEEnum, DataType.CURRENCY);
		addEEnumLiteral(dataTypeEEnum, DataType.PERCENT);
		addEEnumLiteral(dataTypeEEnum, DataType.IMAGE);
		addEEnumLiteral(dataTypeEEnum, DataType.IMAGES);

		initEEnum(featureTypeEEnum, FeatureType.class, "FeatureType");
		addEEnumLiteral(featureTypeEEnum, FeatureType.INT);
		addEEnumLiteral(featureTypeEEnum, FeatureType.VARCHAR);
		addEEnumLiteral(featureTypeEEnum, FeatureType.TEXT);
		addEEnumLiteral(featureTypeEEnum, FeatureType.BOOL);
		addEEnumLiteral(featureTypeEEnum, FeatureType.DATE);
		addEEnumLiteral(featureTypeEEnum, FeatureType.IMAGE);
		addEEnumLiteral(featureTypeEEnum, FeatureType.LONGTEXT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (namedEClass,
		   source,
		   new String[] {
			   "constraints", "Name_Size"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "constraints", "containsPK"
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "constraints", "UrlContains"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getNamed__Name_Format__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'first letter must be capital a\',\n\tstatus : Boolean = \n\t\tself.name.matches(\'[a-z][0-9A-Za-z]*\')\n}.status"
		   });
		addAnnotation
		  (getNamed__Name_Size__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'at least three letters for name\',\n\tstatus : Boolean = \n\t\tself.name.size()>2\n}.status"
		   });
		addAnnotation
		  (getSystem__NumberOfPages(),
		   source,
		   new String[] {
			   "body", "pages->size()"
		   });
		addAnnotation
		  (getSystem__NumberOfEntities(),
		   source,
		   new String[] {
			   "body", "entities->size()"
		   });
		addAnnotation
		  (getEntity__ContainsPK__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "features->select(isPrimaryKey=true)->size()>0"
		   });
		addAnnotation
		  (getPage__UrlContains__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'expected word.something format\',\n\tstatus : Boolean = \n\t\tself.url.matches(\'[0-9A-Za-z]+[.][a-z]\')\n}.status"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getSystem_Entities(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getSystem_Pages(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getEntity_Features(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getReference_Ref(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getD_Content_Entity(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //A3PackageImpl
