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
import A3.FeatureType;
import A3.Named;
import A3.Page;
import A3.Reference;
import A3.S_Index;
import A3.S_Individual;
import A3.Static_Content;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A3FactoryImpl extends EFactoryImpl implements A3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static A3Factory init() {
		try {
			A3Factory theA3Factory = (A3Factory)EPackage.Registry.INSTANCE.getEFactory(A3Package.eNS_URI);
			if (theA3Factory != null) {
				return theA3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new A3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A3FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case A3Package.NAMED: return createNamed();
			case A3Package.SYSTEM: return createSystem();
			case A3Package.ENTITY: return createEntity();
			case A3Package.ATTRIBUTE: return createAttribute();
			case A3Package.REFERENCE: return createReference();
			case A3Package.PAGE: return createPage();
			case A3Package.DCONTENT: return createD_Content();
			case A3Package.STATIC_CONTENT: return createStatic_Content();
			case A3Package.SINDEX: return createS_Index();
			case A3Package.SINDIVIDUAL: return createS_Individual();
			case A3Package.DINDEX: return createD_Index();
			case A3Package.DINDIVIDUAL: return createD_Individual();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case A3Package.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case A3Package.FEATURE_TYPE:
				return createFeatureTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case A3Package.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case A3Package.FEATURE_TYPE:
				return convertFeatureTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Named createNamed() {
		NamedImpl named = new NamedImpl();
		return named;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A3.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_Content createD_Content() {
		D_ContentImpl d_Content = new D_ContentImpl();
		return d_Content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Static_Content createStatic_Content() {
		Static_ContentImpl static_Content = new Static_ContentImpl();
		return static_Content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_Index createS_Index() {
		S_IndexImpl s_Index = new S_IndexImpl();
		return s_Index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_Individual createS_Individual() {
		S_IndividualImpl s_Individual = new S_IndividualImpl();
		return s_Individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_Index createD_Index() {
		D_IndexImpl d_Index = new D_IndexImpl();
		return d_Index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_Individual createD_Individual() {
		D_IndividualImpl d_Individual = new D_IndividualImpl();
		return d_Individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType createFeatureTypeFromString(EDataType eDataType, String initialValue) {
		FeatureType result = FeatureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A3Package getA3Package() {
		return (A3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static A3Package getPackage() {
		return A3Package.eINSTANCE;
	}

} //A3FactoryImpl
