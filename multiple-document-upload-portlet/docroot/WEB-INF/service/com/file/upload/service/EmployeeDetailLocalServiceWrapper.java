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

package com.file.upload.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeDetailLocalService}.
 *
 * @author ChiragSoni
 * @see EmployeeDetailLocalService
 * @generated
 */
public class EmployeeDetailLocalServiceWrapper
	implements EmployeeDetailLocalService,
		ServiceWrapper<EmployeeDetailLocalService> {
	public EmployeeDetailLocalServiceWrapper(
		EmployeeDetailLocalService employeeDetailLocalService) {
		_employeeDetailLocalService = employeeDetailLocalService;
	}

	/**
	* Adds the employee detail to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDetail the employee detail
	* @return the employee detail that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.file.upload.model.EmployeeDetail addEmployeeDetail(
		com.file.upload.model.EmployeeDetail employeeDetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.addEmployeeDetail(employeeDetail);
	}

	/**
	* Creates a new employee detail with the primary key. Does not add the employee detail to the database.
	*
	* @param employeeId the primary key for the new employee detail
	* @return the new employee detail
	*/
	@Override
	public com.file.upload.model.EmployeeDetail createEmployeeDetail(
		long employeeId) {
		return _employeeDetailLocalService.createEmployeeDetail(employeeId);
	}

	/**
	* Deletes the employee detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee detail
	* @return the employee detail that was removed
	* @throws PortalException if a employee detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.file.upload.model.EmployeeDetail deleteEmployeeDetail(
		long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.deleteEmployeeDetail(employeeId);
	}

	/**
	* Deletes the employee detail from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDetail the employee detail
	* @return the employee detail that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.file.upload.model.EmployeeDetail deleteEmployeeDetail(
		com.file.upload.model.EmployeeDetail employeeDetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.deleteEmployeeDetail(employeeDetail);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeDetailLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.file.upload.model.impl.EmployeeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.file.upload.model.impl.EmployeeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.file.upload.model.EmployeeDetail fetchEmployeeDetail(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.fetchEmployeeDetail(employeeId);
	}

	/**
	* Returns the employee detail with the primary key.
	*
	* @param employeeId the primary key of the employee detail
	* @return the employee detail
	* @throws PortalException if a employee detail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.file.upload.model.EmployeeDetail getEmployeeDetail(
		long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.getEmployeeDetail(employeeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.file.upload.model.EmployeeDetail> getEmployeeDetails(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.getEmployeeDetails(start, end);
	}

	/**
	* Returns the number of employee details.
	*
	* @return the number of employee details
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeeDetailsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.getEmployeeDetailsCount();
	}

	/**
	* Updates the employee detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeDetail the employee detail
	* @return the employee detail that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.file.upload.model.EmployeeDetail updateEmployeeDetail(
		com.file.upload.model.EmployeeDetail employeeDetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetailLocalService.updateEmployeeDetail(employeeDetail);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeDetailLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeDetailLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeDetailLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeDetailLocalService getWrappedEmployeeDetailLocalService() {
		return _employeeDetailLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeDetailLocalService(
		EmployeeDetailLocalService employeeDetailLocalService) {
		_employeeDetailLocalService = employeeDetailLocalService;
	}

	@Override
	public EmployeeDetailLocalService getWrappedService() {
		return _employeeDetailLocalService;
	}

	@Override
	public void setWrappedService(
		EmployeeDetailLocalService employeeDetailLocalService) {
		_employeeDetailLocalService = employeeDetailLocalService;
	}

	private EmployeeDetailLocalService _employeeDetailLocalService;
}