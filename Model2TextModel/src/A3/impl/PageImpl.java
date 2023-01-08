/**
 */
package A3.impl;

import A3.A3Package;
import A3.A3Tables;
import A3.D_Content;
import A3.Page;
import A3.Static_Content;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link A3.impl.PageImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link A3.impl.PageImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link A3.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link A3.impl.PageImpl#getD_content <em>Dcontent</em>}</li>
 *   <li>{@link A3.impl.PageImpl#getS_content <em>Scontent</em>}</li>
 *   <li>{@link A3.impl.PageImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link A3.impl.PageImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected BigInteger identifier = IDENTIFIER_EDEFAULT;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getD_content() <em>Dcontent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_content()
	 * @generated
	 * @ordered
	 */
	protected D_Content d_content;

	/**
	 * The cached value of the '{@link #getS_content() <em>Scontent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS_content()
	 * @generated
	 * @ordered
	 */
	protected Static_Content s_content;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected Page pages;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

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
		return A3Package.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(BigInteger newIdentifier) {
		BigInteger oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3Package.PAGE__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A3Package.PAGE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3Package.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_Content getD_content() {
		return d_content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetD_content(D_Content newD_content, NotificationChain msgs) {
		D_Content oldD_content = d_content;
		d_content = newD_content;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A3Package.PAGE__DCONTENT, oldD_content, newD_content);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_content(D_Content newD_content) {
		if (newD_content != d_content) {
			NotificationChain msgs = null;
			if (d_content != null)
				msgs = ((InternalEObject)d_content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A3Package.PAGE__DCONTENT, null, msgs);
			if (newD_content != null)
				msgs = ((InternalEObject)newD_content).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A3Package.PAGE__DCONTENT, null, msgs);
			msgs = basicSetD_content(newD_content, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3Package.PAGE__DCONTENT, newD_content, newD_content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Static_Content getS_content() {
		return s_content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS_content(Static_Content newS_content, NotificationChain msgs) {
		Static_Content oldS_content = s_content;
		s_content = newS_content;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A3Package.PAGE__SCONTENT, oldS_content, newS_content);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_content(Static_Content newS_content) {
		if (newS_content != s_content) {
			NotificationChain msgs = null;
			if (s_content != null)
				msgs = ((InternalEObject)s_content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A3Package.PAGE__SCONTENT, null, msgs);
			if (newS_content != null)
				msgs = ((InternalEObject)newS_content).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A3Package.PAGE__SCONTENT, null, msgs);
			msgs = basicSetS_content(newS_content, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3Package.PAGE__SCONTENT, newS_content, newS_content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPages() {
		if (pages != null && pages.eIsProxy()) {
			InternalEObject oldPages = (InternalEObject)pages;
			pages = (Page)eResolveProxy(oldPages);
			if (pages != oldPages) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, A3Package.PAGE__PAGES, oldPages, pages));
			}
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPages(Page newPages) {
		Page oldPages = pages;
		pages = newPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3Package.PAGE__PAGES, oldPages, pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		/**
		 *
		 * if self.url.matches('[0-9A-Za-z]+[.][i][t]')
		 * then 'italian'
		 * elseif self.url.matches('[0-9A-Za-z]+[.][c][o][m]')
		 * then 'american'
		 * elseif self.url.matches('[0-9A-Za-z]+[.][f][r]')
		 * then 'french'
		 * else 'undefined'
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ String url = this.getUrl();
		if (url == null) {
			throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
		}
		final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, url, A3Tables.STR__91_0_m_9A_m_Za_m_z_93_p_91__93_91_i_93_91_t_93).booleanValue();
		/*@NonInvalid*/ String IF_matches;
		if (matches) {
			IF_matches = A3Tables.STR_italian;
		}
		else {
			final /*@Thrown*/ boolean matches_0 = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, url, A3Tables.STR__91_0_m_9A_m_Za_m_z_93_p_91__93_91_c_93_91_o_93_91_m_93).booleanValue();
			/*@NonInvalid*/ String IF_matches_0;
			if (matches_0) {
				IF_matches_0 = A3Tables.STR_american;
			}
			else {
				final /*@Thrown*/ boolean matches_1 = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, url, A3Tables.STR__91_0_m_9A_m_Za_m_z_93_p_91__93_91_f_93_91_r_93).booleanValue();
				/*@NonInvalid*/ String IF_matches_1;
				if (matches_1) {
					IF_matches_1 = A3Tables.STR_french;
				}
				else {
					IF_matches_1 = A3Tables.STR_undefined;
				}
				IF_matches_0 = IF_matches_1;
			}
			IF_matches = IF_matches_0;
		}
		return IF_matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		// TODO: implement this method to set the 'Country' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UrlContains(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::UrlContains";
		try {
			/**
			 *
			 * inv UrlContains:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.url.matches('[0-9A-Za-z]+[.][a-z]')
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'expected word.something format', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3Package.Literals.PAGE___URL_CONTAINS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3Tables.INT_0).booleanValue();
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
					final /*@Thrown*/ boolean status = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, url, A3Tables.STR__91_0_m_9A_m_Za_m_z_93_p_91__93_91_a_m_z_93).booleanValue();
					/*@Thrown*/ Object IF_status;
					if (status) {
						IF_status = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(A3Tables.TUPLid_, A3Tables.STR_expected_32_word_something_32_format, status);
						IF_status = TUP_;
					}
					CAUGHT_IF_status = IF_status;
				}
				catch (Exception e) {
					CAUGHT_IF_status = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_IF_status, A3Tables.INT_0).booleanValue();
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
			case A3Package.PAGE__DCONTENT:
				return basicSetD_content(null, msgs);
			case A3Package.PAGE__SCONTENT:
				return basicSetS_content(null, msgs);
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
			case A3Package.PAGE__IDENTIFIER:
				return getIdentifier();
			case A3Package.PAGE__URL:
				return getUrl();
			case A3Package.PAGE__TITLE:
				return getTitle();
			case A3Package.PAGE__DCONTENT:
				return getD_content();
			case A3Package.PAGE__SCONTENT:
				return getS_content();
			case A3Package.PAGE__PAGES:
				if (resolve) return getPages();
				return basicGetPages();
			case A3Package.PAGE__COUNTRY:
				return getCountry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A3Package.PAGE__IDENTIFIER:
				setIdentifier((BigInteger)newValue);
				return;
			case A3Package.PAGE__URL:
				setUrl((String)newValue);
				return;
			case A3Package.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case A3Package.PAGE__DCONTENT:
				setD_content((D_Content)newValue);
				return;
			case A3Package.PAGE__SCONTENT:
				setS_content((Static_Content)newValue);
				return;
			case A3Package.PAGE__PAGES:
				setPages((Page)newValue);
				return;
			case A3Package.PAGE__COUNTRY:
				setCountry((String)newValue);
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
			case A3Package.PAGE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case A3Package.PAGE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case A3Package.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case A3Package.PAGE__DCONTENT:
				setD_content((D_Content)null);
				return;
			case A3Package.PAGE__SCONTENT:
				setS_content((Static_Content)null);
				return;
			case A3Package.PAGE__PAGES:
				setPages((Page)null);
				return;
			case A3Package.PAGE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
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
			case A3Package.PAGE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case A3Package.PAGE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case A3Package.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case A3Package.PAGE__DCONTENT:
				return d_content != null;
			case A3Package.PAGE__SCONTENT:
				return s_content != null;
			case A3Package.PAGE__PAGES:
				return pages != null;
			case A3Package.PAGE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? getCountry() != null : !COUNTRY_EDEFAULT.equals(getCountry());
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
			case A3Package.PAGE___URL_CONTAINS__DIAGNOSTICCHAIN_MAP:
				return UrlContains((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", url: ");
		result.append(url);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PageImpl
