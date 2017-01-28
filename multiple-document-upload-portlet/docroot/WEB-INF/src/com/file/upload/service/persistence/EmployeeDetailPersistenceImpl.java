/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.file.upload.service.persistence;

import com.file.upload.NoSuchEmployeeDetailException;
import com.file.upload.model.EmployeeDetail;
import com.file.upload.model.impl.EmployeeDetailImpl;
import com.file.upload.model.impl.EmployeeDetailModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employee detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ChiragSoni
 * @see EmployeeDetailPersistence
 * @see EmployeeDetailUtil
 * @generated
 */
public class EmployeeDetailPersistenceImpl extends BasePersistenceImpl<EmployeeDetail>
	implements EmployeeDetailPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeDetailUtil} to access the employee detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeDetailImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDetailImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDetailImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEEID =
		new FinderPath(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDetailImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEmployeeId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID =
		new FinderPath(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailModelImpl.FINDER_CACHE_ENABLED,
			EmployeeDetailImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmployeeId",
			new String[] { Long.class.getName() },
			EmployeeDetailModelImpl.EMPLOYEEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEEID = new FinderPath(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmployeeId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the employee details where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @return the matching employee details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDetail> findByEmployeeId(long employeeId)
		throws SystemException {
		return findByEmployeeId(employeeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee details where employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.file.upload.model.impl.EmployeeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of employee details
	 * @param end the upper bound of the range of employee details (not inclusive)
	 * @return the range of matching employee details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDetail> findByEmployeeId(long employeeId, int start,
		int end) throws SystemException {
		return findByEmployeeId(employeeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee details where employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.file.upload.model.impl.EmployeeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of employee details
	 * @param end the upper bound of the range of employee details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDetail> findByEmployeeId(long employeeId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID;
			finderArgs = new Object[] { employeeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEEID;
			finderArgs = new Object[] { employeeId, start, end, orderByComparator };
		}

		List<EmployeeDetail> list = (List<EmployeeDetail>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmployeeDetail employeeDetail : list) {
				if ((employeeId != employeeDetail.getEmployeeId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_EMPLOYEEDETAIL_WHERE);

			query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeDetailModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeId);

				if (!pagination) {
					list = (List<EmployeeDetail>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeDetail>(list);
				}
				else {
					list = (List<EmployeeDetail>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first employee detail in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee detail
	 * @throws com.file.upload.NoSuchEmployeeDetailException if a matching employee detail could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail findByEmployeeId_First(long employeeId,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeDetailException, SystemException {
		EmployeeDetail employeeDetail = fetchByEmployeeId_First(employeeId,
				orderByComparator);

		if (employeeDetail != null) {
			return employeeDetail;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeId=");
		msg.append(employeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeDetailException(msg.toString());
	}

	/**
	 * Returns the first employee detail in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee detail, or <code>null</code> if a matching employee detail could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail fetchByEmployeeId_First(long employeeId,
		OrderByComparator orderByComparator) throws SystemException {
		List<EmployeeDetail> list = findByEmployeeId(employeeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last employee detail in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee detail
	 * @throws com.file.upload.NoSuchEmployeeDetailException if a matching employee detail could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail findByEmployeeId_Last(long employeeId,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeDetailException, SystemException {
		EmployeeDetail employeeDetail = fetchByEmployeeId_Last(employeeId,
				orderByComparator);

		if (employeeDetail != null) {
			return employeeDetail;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeId=");
		msg.append(employeeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeDetailException(msg.toString());
	}

	/**
	 * Returns the last employee detail in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee detail, or <code>null</code> if a matching employee detail could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail fetchByEmployeeId_Last(long employeeId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByEmployeeId(employeeId);

		if (count == 0) {
			return null;
		}

		List<EmployeeDetail> list = findByEmployeeId(employeeId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the employee details where employeeId = &#63; from the database.
	 *
	 * @param employeeId the employee ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEmployeeId(long employeeId) throws SystemException {
		for (EmployeeDetail employeeDetail : findByEmployeeId(employeeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employeeDetail);
		}
	}

	/**
	 * Returns the number of employee details where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @return the number of matching employee details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmployeeId(long employeeId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEEID;

		Object[] finderArgs = new Object[] { employeeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEEDETAIL_WHERE);

			query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(employeeId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2 = "employeeDetail.employeeId = ?";

	public EmployeeDetailPersistenceImpl() {
		setModelClass(EmployeeDetail.class);
	}

	/**
	 * Caches the employee detail in the entity cache if it is enabled.
	 *
	 * @param employeeDetail the employee detail
	 */
	@Override
	public void cacheResult(EmployeeDetail employeeDetail) {
		EntityCacheUtil.putResult(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailImpl.class, employeeDetail.getPrimaryKey(),
			employeeDetail);

		employeeDetail.resetOriginalValues();
	}

	/**
	 * Caches the employee details in the entity cache if it is enabled.
	 *
	 * @param employeeDetails the employee details
	 */
	@Override
	public void cacheResult(List<EmployeeDetail> employeeDetails) {
		for (EmployeeDetail employeeDetail : employeeDetails) {
			if (EntityCacheUtil.getResult(
						EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeDetailImpl.class, employeeDetail.getPrimaryKey()) == null) {
				cacheResult(employeeDetail);
			}
			else {
				employeeDetail.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeDetailImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeDetailImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee detail.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeDetail employeeDetail) {
		EntityCacheUtil.removeResult(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailImpl.class, employeeDetail.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeDetail> employeeDetails) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeDetail employeeDetail : employeeDetails) {
			EntityCacheUtil.removeResult(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeDetailImpl.class, employeeDetail.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee detail with the primary key. Does not add the employee detail to the database.
	 *
	 * @param employeeId the primary key for the new employee detail
	 * @return the new employee detail
	 */
	@Override
	public EmployeeDetail create(long employeeId) {
		EmployeeDetail employeeDetail = new EmployeeDetailImpl();

		employeeDetail.setNew(true);
		employeeDetail.setPrimaryKey(employeeId);

		return employeeDetail;
	}

	/**
	 * Removes the employee detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the employee detail
	 * @return the employee detail that was removed
	 * @throws com.file.upload.NoSuchEmployeeDetailException if a employee detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail remove(long employeeId)
		throws NoSuchEmployeeDetailException, SystemException {
		return remove((Serializable)employeeId);
	}

	/**
	 * Removes the employee detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee detail
	 * @return the employee detail that was removed
	 * @throws com.file.upload.NoSuchEmployeeDetailException if a employee detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail remove(Serializable primaryKey)
		throws NoSuchEmployeeDetailException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmployeeDetail employeeDetail = (EmployeeDetail)session.get(EmployeeDetailImpl.class,
					primaryKey);

			if (employeeDetail == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeDetailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeDetail);
		}
		catch (NoSuchEmployeeDetailException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected EmployeeDetail removeImpl(EmployeeDetail employeeDetail)
		throws SystemException {
		employeeDetail = toUnwrappedModel(employeeDetail);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeDetail)) {
				employeeDetail = (EmployeeDetail)session.get(EmployeeDetailImpl.class,
						employeeDetail.getPrimaryKeyObj());
			}

			if (employeeDetail != null) {
				session.delete(employeeDetail);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeDetail != null) {
			clearCache(employeeDetail);
		}

		return employeeDetail;
	}

	@Override
	public EmployeeDetail updateImpl(
		com.file.upload.model.EmployeeDetail employeeDetail)
		throws SystemException {
		employeeDetail = toUnwrappedModel(employeeDetail);

		boolean isNew = employeeDetail.isNew();

		EmployeeDetailModelImpl employeeDetailModelImpl = (EmployeeDetailModelImpl)employeeDetail;

		Session session = null;

		try {
			session = openSession();

			if (employeeDetail.isNew()) {
				session.save(employeeDetail);

				employeeDetail.setNew(false);
			}
			else {
				session.merge(employeeDetail);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeDetailModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeDetailModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeDetailModelImpl.getOriginalEmployeeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID,
					args);

				args = new Object[] { employeeDetailModelImpl.getEmployeeId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeDetailImpl.class, employeeDetail.getPrimaryKey(),
			employeeDetail);

		return employeeDetail;
	}

	protected EmployeeDetail toUnwrappedModel(EmployeeDetail employeeDetail) {
		if (employeeDetail instanceof EmployeeDetailImpl) {
			return employeeDetail;
		}

		EmployeeDetailImpl employeeDetailImpl = new EmployeeDetailImpl();

		employeeDetailImpl.setNew(employeeDetail.isNew());
		employeeDetailImpl.setPrimaryKey(employeeDetail.getPrimaryKey());

		employeeDetailImpl.setEmployeeId(employeeDetail.getEmployeeId());
		employeeDetailImpl.setFirstName(employeeDetail.getFirstName());
		employeeDetailImpl.setLastName(employeeDetail.getLastName());
		employeeDetailImpl.setGroupId(employeeDetail.getGroupId());
		employeeDetailImpl.setCompanyId(employeeDetail.getCompanyId());
		employeeDetailImpl.setUserId(employeeDetail.getUserId());
		employeeDetailImpl.setUserName(employeeDetail.getUserName());
		employeeDetailImpl.setCreateDate(employeeDetail.getCreateDate());
		employeeDetailImpl.setModifiedDate(employeeDetail.getModifiedDate());

		return employeeDetailImpl;
	}

	/**
	 * Returns the employee detail with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee detail
	 * @return the employee detail
	 * @throws com.file.upload.NoSuchEmployeeDetailException if a employee detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeDetailException, SystemException {
		EmployeeDetail employeeDetail = fetchByPrimaryKey(primaryKey);

		if (employeeDetail == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeDetailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeDetail;
	}

	/**
	 * Returns the employee detail with the primary key or throws a {@link com.file.upload.NoSuchEmployeeDetailException} if it could not be found.
	 *
	 * @param employeeId the primary key of the employee detail
	 * @return the employee detail
	 * @throws com.file.upload.NoSuchEmployeeDetailException if a employee detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail findByPrimaryKey(long employeeId)
		throws NoSuchEmployeeDetailException, SystemException {
		return findByPrimaryKey((Serializable)employeeId);
	}

	/**
	 * Returns the employee detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee detail
	 * @return the employee detail, or <code>null</code> if a employee detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmployeeDetail employeeDetail = (EmployeeDetail)EntityCacheUtil.getResult(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeDetailImpl.class, primaryKey);

		if (employeeDetail == _nullEmployeeDetail) {
			return null;
		}

		if (employeeDetail == null) {
			Session session = null;

			try {
				session = openSession();

				employeeDetail = (EmployeeDetail)session.get(EmployeeDetailImpl.class,
						primaryKey);

				if (employeeDetail != null) {
					cacheResult(employeeDetail);
				}
				else {
					EntityCacheUtil.putResult(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeDetailImpl.class, primaryKey,
						_nullEmployeeDetail);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeDetailModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeDetailImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeDetail;
	}

	/**
	 * Returns the employee detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employee detail
	 * @return the employee detail, or <code>null</code> if a employee detail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmployeeDetail fetchByPrimaryKey(long employeeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeId);
	}

	/**
	 * Returns all the employee details.
	 *
	 * @return the employee details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDetail> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.file.upload.model.impl.EmployeeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee details
	 * @param end the upper bound of the range of employee details (not inclusive)
	 * @return the range of employee details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDetail> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.file.upload.model.impl.EmployeeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee details
	 * @param end the upper bound of the range of employee details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmployeeDetail> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<EmployeeDetail> list = (List<EmployeeDetail>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEEDETAIL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEDETAIL;

				if (pagination) {
					sql = sql.concat(EmployeeDetailModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeDetail>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmployeeDetail>(list);
				}
				else {
					list = (List<EmployeeDetail>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the employee details from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmployeeDetail employeeDetail : findAll()) {
			remove(employeeDetail);
		}
	}

	/**
	 * Returns the number of employee details.
	 *
	 * @return the number of employee details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEDETAIL);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the employee detail persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.file.upload.model.EmployeeDetail")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmployeeDetail>> listenersList = new ArrayList<ModelListener<EmployeeDetail>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmployeeDetail>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(EmployeeDetailImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMPLOYEEDETAIL = "SELECT employeeDetail FROM EmployeeDetail employeeDetail";
	private static final String _SQL_SELECT_EMPLOYEEDETAIL_WHERE = "SELECT employeeDetail FROM EmployeeDetail employeeDetail WHERE ";
	private static final String _SQL_COUNT_EMPLOYEEDETAIL = "SELECT COUNT(employeeDetail) FROM EmployeeDetail employeeDetail";
	private static final String _SQL_COUNT_EMPLOYEEDETAIL_WHERE = "SELECT COUNT(employeeDetail) FROM EmployeeDetail employeeDetail WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeDetail.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeDetail exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeDetail exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeeDetailPersistenceImpl.class);
	private static EmployeeDetail _nullEmployeeDetail = new EmployeeDetailImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeDetail> toCacheModel() {
				return _nullEmployeeDetailCacheModel;
			}
		};

	private static CacheModel<EmployeeDetail> _nullEmployeeDetailCacheModel = new CacheModel<EmployeeDetail>() {
			@Override
			public EmployeeDetail toEntityModel() {
				return _nullEmployeeDetail;
			}
		};
}