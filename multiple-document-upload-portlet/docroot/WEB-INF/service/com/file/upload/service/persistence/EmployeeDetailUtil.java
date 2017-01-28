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

import com.file.upload.model.EmployeeDetail;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employee detail service. This utility wraps {@link EmployeeDetailPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ChiragSoni
 * @see EmployeeDetailPersistence
 * @see EmployeeDetailPersistenceImpl
 * @generated
 */
public class EmployeeDetailUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(EmployeeDetail employeeDetail) {
		getPersistence().clearCache(employeeDetail);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EmployeeDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmployeeDetail update(EmployeeDetail employeeDetail)
		throws SystemException {
		return getPersistence().update(employeeDetail);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmployeeDetail update(EmployeeDetail employeeDetail,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employeeDetail, serviceContext);
	}

	/**
	* Returns all the employee details where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @return the matching employee details
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.file.upload.model.EmployeeDetail> findByEmployeeId(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmployeeId(employeeId);
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
	public static java.util.List<com.file.upload.model.EmployeeDetail> findByEmployeeId(
		long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmployeeId(employeeId, start, end);
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
	public static java.util.List<com.file.upload.model.EmployeeDetail> findByEmployeeId(
		long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmployeeId(employeeId, start, end, orderByComparator);
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
	public static com.file.upload.model.EmployeeDetail findByEmployeeId_First(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.file.upload.NoSuchEmployeeDetailException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmployeeId_First(employeeId, orderByComparator);
	}

	/**
	* Returns the first employee detail in the ordered set where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee detail, or <code>null</code> if a matching employee detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.file.upload.model.EmployeeDetail fetchByEmployeeId_First(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmployeeId_First(employeeId, orderByComparator);
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
	public static com.file.upload.model.EmployeeDetail findByEmployeeId_Last(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.file.upload.NoSuchEmployeeDetailException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmployeeId_Last(employeeId, orderByComparator);
	}

	/**
	* Returns the last employee detail in the ordered set where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee detail, or <code>null</code> if a matching employee detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.file.upload.model.EmployeeDetail fetchByEmployeeId_Last(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmployeeId_Last(employeeId, orderByComparator);
	}

	/**
	* Removes all the employee details where employeeId = &#63; from the database.
	*
	* @param employeeId the employee ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmployeeId(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEmployeeId(employeeId);
	}

	/**
	* Returns the number of employee details where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @return the number of matching employee details
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmployeeId(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmployeeId(employeeId);
	}

	/**
	* Caches the employee detail in the entity cache if it is enabled.
	*
	* @param employeeDetail the employee detail
	*/
	public static void cacheResult(
		com.file.upload.model.EmployeeDetail employeeDetail) {
		getPersistence().cacheResult(employeeDetail);
	}

	/**
	* Caches the employee details in the entity cache if it is enabled.
	*
	* @param employeeDetails the employee details
	*/
	public static void cacheResult(
		java.util.List<com.file.upload.model.EmployeeDetail> employeeDetails) {
		getPersistence().cacheResult(employeeDetails);
	}

	/**
	* Creates a new employee detail with the primary key. Does not add the employee detail to the database.
	*
	* @param employeeId the primary key for the new employee detail
	* @return the new employee detail
	*/
	public static com.file.upload.model.EmployeeDetail create(long employeeId) {
		return getPersistence().create(employeeId);
	}

	/**
	* Removes the employee detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee detail
	* @return the employee detail that was removed
	* @throws com.file.upload.NoSuchEmployeeDetailException if a employee detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.file.upload.model.EmployeeDetail remove(long employeeId)
		throws com.file.upload.NoSuchEmployeeDetailException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(employeeId);
	}

	public static com.file.upload.model.EmployeeDetail updateImpl(
		com.file.upload.model.EmployeeDetail employeeDetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employeeDetail);
	}

	/**
	* Returns the employee detail with the primary key or throws a {@link com.file.upload.NoSuchEmployeeDetailException} if it could not be found.
	*
	* @param employeeId the primary key of the employee detail
	* @return the employee detail
	* @throws com.file.upload.NoSuchEmployeeDetailException if a employee detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.file.upload.model.EmployeeDetail findByPrimaryKey(
		long employeeId)
		throws com.file.upload.NoSuchEmployeeDetailException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(employeeId);
	}

	/**
	* Returns the employee detail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee detail
	* @return the employee detail, or <code>null</code> if a employee detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.file.upload.model.EmployeeDetail fetchByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeId);
	}

	/**
	* Returns all the employee details.
	*
	* @return the employee details
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.file.upload.model.EmployeeDetail> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.file.upload.model.EmployeeDetail> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.file.upload.model.EmployeeDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employee details from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employee details.
	*
	* @return the number of employee details
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeeDetailPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeeDetailPersistence)PortletBeanLocatorUtil.locate(com.file.upload.service.ClpSerializer.getServletContextName(),
					EmployeeDetailPersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeDetailUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeeDetailPersistence persistence) {
	}

	private static EmployeeDetailPersistence _persistence;
}