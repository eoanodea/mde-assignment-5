/**
 */
package system.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;

import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerRange;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import system.Content;
import system.Page;
import system.SystemPackage;
import system.SystemTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.PageImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link system.impl.PageImpl#isIsHomePage <em>Is Home Page</em>}</li>
 *   <li>{@link system.impl.PageImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends NamedImpl implements Page {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHomePage() <em>Is Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHomePage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HOME_PAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHomePage() <em>Is Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHomePage()
	 * @generated
	 * @ordered
	 */
	protected boolean isHomePage = IS_HOME_PAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.PAGE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHomePage() {
		return isHomePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHomePage(boolean newIsHomePage) {
		boolean oldIsHomePage = isHomePage;
		isHomePage = newIsHomePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.PAGE__IS_HOME_PAGE, oldIsHomePage, isHomePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Content>(Content.class, this, SystemPackage.PAGE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UrlIsValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::UrlIsValid";
		try {
			/**
			 *
			 * inv UrlIsValid:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.url.matches('([^\\s]+)(\\.)([^\\s]+)')
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'URL must contain an ending e.g. .com', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SystemPackage.Literals.PAGE___URL_IS_VALID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SystemTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_IF_status;
				try {
					final /*@NonInvalid*/ String url = this.getUrl();
					if (url == null) {
						throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ boolean status = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, url, SystemTables.STR__o_91_94_92_s_93_p_e_o_92__e_o_91_94_92_s_93_p_e).booleanValue();
					/*@Thrown*/ Object IF_status;
					if (status) {
						IF_status = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(SystemTables.TUPLid_, SystemTables.STR_URL_32_must_32_contain_32_an_32_ending_32_e_g_32__com, status);
						IF_status = TUP_;
					}
					CAUGHT_IF_status = IF_status;
				}
				catch (Exception e) {
					CAUGHT_IF_status = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_IF_status, SystemTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ValidPageURL(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::ValidPageURL";
		try {
			/**
			 *
			 * inv ValidPageURL:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.isHomePage = true
			 *           then
			 *             not Sequence{1..self.url.size()
			 *             }
			 *             ->exists(i |
			 *               (self.url.substring(i, i) = '/'
			 *               ))
			 *           else
			 *             Sequence{1..self.url.size()
			 *             }
			 *             ->exists(i | self.url.substring(i, i) = '/')
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'URL cannot have a / if it is the homepage', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SystemPackage.Literals.PAGE___VALID_PAGE_URL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SystemTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_IF_eq_1;
				try {
					final /*@NonInvalid*/ boolean isHomePage = this.isIsHomePage();
					/*@Thrown*/ Boolean status;
					if (isHomePage) {
						/*@Caught*/ Object CAUGHT_exists;
						try {
							final /*@NonInvalid*/ String url_0 = this.getUrl();
							if (url_0 == null) {
								throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(url_0);
							final /*@Thrown*/ IntegerRange RNG = ValueUtil.createRange(SystemTables.INT_1, size);
							final /*@Thrown*/ SequenceValue Sequence = ValueUtil.createSequenceRange(SystemTables.SEQ_PRIMid_Integer, RNG);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_i = Sequence.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_i.hasNext()) {
									if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator;
									}
									break;
								}
								/*@NonInvalid*/ IntegerValue i = (IntegerValue)ITERATOR_i.next();
								/**
								 * self.url.substring(i, i) = '/'
								 */
								/*@Caught*/ Object CAUGHT_eq;
								try {
									final /*@Thrown*/ String substring = StringSubstringOperation.INSTANCE.evaluate(url_0, i, i);
									final /*@Thrown*/ boolean eq = substring.equals(SystemTables.STR_quot);
									CAUGHT_eq = eq;
								}
								catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break;														// Stop immediately
								}
								else if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
									;															// Carry on
								}
								else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
									accumulator = CAUGHT_eq;									// Cache an exception failure
								}
								else {															// Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							CAUGHT_exists = exists;
						}
						catch (Exception e) {
							CAUGHT_exists = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_exists instanceof InvalidValueException) {
							throw (InvalidValueException)CAUGHT_exists;
						}
						final /*@Thrown*/ Boolean not;
						if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						status = not;
					}
					else {
						final /*@NonInvalid*/ String url_2 = this.getUrl();
						if (url_2 == null) {
							throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(url_2);
						final /*@Thrown*/ IntegerRange RNG_0 = ValueUtil.createRange(SystemTables.INT_1, size_0);
						final /*@Thrown*/ SequenceValue Sequence_0 = ValueUtil.createSequenceRange(SystemTables.SEQ_PRIMid_Integer, RNG_0);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_i_0 = Sequence_0.iterator();
						/*@Thrown*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_i_0.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ IntegerValue i_0 = (IntegerValue)ITERATOR_i_0.next();
							/**
							 * self.url.substring(i, i) = '/'
							 */
							/*@Caught*/ Object CAUGHT_eq_0;
							try {
								final /*@Thrown*/ String substring_0 = StringSubstringOperation.INSTANCE.evaluate(url_2, i_0, i_0);
								final /*@Thrown*/ boolean eq_0 = substring_0.equals(SystemTables.STR_quot);
								CAUGHT_eq_0 = eq_0;
							}
							catch (Exception e) {
								CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else if (CAUGHT_eq_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
								accumulator_0 = CAUGHT_eq_0;									// Cache an exception failure
							}
							else {															// Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						status = exists_0;
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq_1;
					if (eq_1) {
						IF_eq_1 = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(SystemTables.TUPLid_, SystemTables.STR_URL_32_cannot_32_have_32_a_32_s_32_if_32_it_32_is_32_the_32_homepage, status);
						IF_eq_1 = TUP_;
					}
					CAUGHT_IF_eq_1 = IF_eq_1;
				}
				catch (Exception e) {
					CAUGHT_IF_eq_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_IF_eq_1, SystemTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.PAGE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.PAGE__URL:
				return getUrl();
			case SystemPackage.PAGE__IS_HOME_PAGE:
				return isIsHomePage();
			case SystemPackage.PAGE__CONTENT:
				return getContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.PAGE__URL:
				setUrl((String)newValue);
				return;
			case SystemPackage.PAGE__IS_HOME_PAGE:
				setIsHomePage((Boolean)newValue);
				return;
			case SystemPackage.PAGE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Content>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SystemPackage.PAGE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case SystemPackage.PAGE__IS_HOME_PAGE:
				setIsHomePage(IS_HOME_PAGE_EDEFAULT);
				return;
			case SystemPackage.PAGE__CONTENT:
				getContent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SystemPackage.PAGE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case SystemPackage.PAGE__IS_HOME_PAGE:
				return isHomePage != IS_HOME_PAGE_EDEFAULT;
			case SystemPackage.PAGE__CONTENT:
				return content != null && !content.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SystemPackage.PAGE___URL_IS_VALID__DIAGNOSTICCHAIN_MAP:
				return UrlIsValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SystemPackage.PAGE___VALID_PAGE_URL__DIAGNOSTICCHAIN_MAP:
				return ValidPageURL((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (url: ");
		result.append(url);
		result.append(", isHomePage: ");
		result.append(isHomePage);
		result.append(')');
		return result.toString();
	}

} //PageImpl
