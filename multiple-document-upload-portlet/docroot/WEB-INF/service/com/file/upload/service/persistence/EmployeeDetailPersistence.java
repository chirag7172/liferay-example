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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ChiragSoni
 * @see EmployeeDetailPersistenceImpl
 * @see EmployeeDetailUtil
 * @generated
 */
public interface EmployeeDetailPersistence extends BasePersistence<EmployeeDetail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeDetailUtil} to access the employee detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employee details where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @return the matching employee details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.file.upload.model.EmployeeDetail> findByEmployeeId(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.file.upload.model.EmployeeDetail> findByEmployeeId(
		long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.file.upload.model.EmployeeDetail> findByEmployeeId(
		long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee detail in the ordered set where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee detail
	* @throws com.file.upload.NoSuchEmployeeDetailException if a matching employee detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.file.upload.model.EmployeeDetail findByEmployeeId_First(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.file.upload.NoSuchEmployeeDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee detail in the ordered set where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee detail, or <code>null</code> if a matching employee detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.file.upload.model.EmployeeDetail fetchByEmployeeId_First(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee detail in the ordered set where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee detail
	* @throws com.file.upload.NoSuchEmployeeDetailException if a matching employee detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.file.upload.model.EmployeeDetail findByEmployeeId_Last(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.file.upload.NoSuchEmployeeDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee detail in the ordered set where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee detail, or <code>null</code> if a matching employee detail could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.file.upload.model.EmployeeDetail fetchByEmployeeId_Last(
		long employeeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee details where employeeId = &#63; from the database.
	*
	* @param employeeId the employee ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmployeeId(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee details where employeeId = &#63;.
	*
	* @param employeeId the employee ID
	* @return the number of matching employee details
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmployeeId(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee detail in the entity cache if it is enabled.
	*
	* @param employeeDetail the employee detail
	*/
	public void cacheResult(com.file.upload.model.EmployeeDetail employeeDetail);

	/**
	* Caches the employee details in the entity cache if it is enabled.
	*
	* @param employeeDetails the employee details
	*/
	public void cacheResult(
		java.util.List<com.file.upload.model.EmployeeDetail> employeeDetails);

	/**
	* Creates a new employee detail with the primary key. Does not add the employee detail to the database.
	*
	* @param employeeId the primary key for the new employee detail
	* @return the new employee detail
	*/
	public com.file.upload.model.EmployeeDetail create(long employeeId);

	/**
	* Removes the employee detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee detail
	* @return the employee detail that was removed
	* @throws com.file.upload.NoSuchEmployeeDetailException if a employee detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.file.upload.model.EmployeeDetail remove(long employeeId)
		throws com.file.upload.NoSuchEmployeeDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.file.upload.model.EmployeeDetail updateImpl(
		com.file.upload.model.EmployeeDetail employeeDetail)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee detail with the primary key or throws a {@link com.file.upload.NoSuchEmployeeDetailException} if it could not be found.
	*
	* @param employeeId the primary key of the employee detail
	* @return the employee detail
	* @throws com.file.upload.NoSuchEmployeeDetailException if a employee detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.file.upload.model.EmployeeDetail findByPrimaryKey(
		long employeeId)
		throws com.file.upload.NoSuchEmployeeDetailException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee detail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee detail
	* @return the employee detail, or <code>null</code> if a employee detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.file.upload.model.EmployeeDetail fetchByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employee details.
	*
	* @return the employee details
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.file.upload.model.EmployeeDetail> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.file.upload.model.EmployeeDetail> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.file.upload.model.EmployeeDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employee details from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employee details.
	*
	* @return the number of employee details
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}