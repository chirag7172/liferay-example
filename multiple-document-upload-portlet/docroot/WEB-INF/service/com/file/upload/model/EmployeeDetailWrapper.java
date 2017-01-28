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

package com.file.upload.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeDetail}.
 * </p>
 *
 * @author ChiragSoni
 * @see EmployeeDetail
 * @generated
 */
public class EmployeeDetailWrapper implements EmployeeDetail,
	ModelWrapper<EmployeeDetail> {
	public EmployeeDetailWrapper(EmployeeDetail employeeDetail) {
		_employeeDetail = employeeDetail;
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeDetail.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeDetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this employee detail.
	*
	* @return the primary key of this employee detail
	*/
	@Override
	public long getPrimaryKey() {
		return _employeeDetail.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee detail.
	*
	* @param primaryKey the primary key of this employee detail
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeeDetail.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee ID of this employee detail.
	*
	* @return the employee ID of this employee detail
	*/
	@Override
	public long getEmployeeId() {
		return _employeeDetail.getEmployeeId();
	}

	/**
	* Sets the employee ID of this employee detail.
	*
	* @param employeeId the employee ID of this employee detail
	*/
	@Override
	public void setEmployeeId(long employeeId) {
		_employeeDetail.setEmployeeId(employeeId);
	}

	/**
	* Returns the first name of this employee detail.
	*
	* @return the first name of this employee detail
	*/
	@Override
	public java.lang.String getFirstName() {
		return _employeeDetail.getFirstName();
	}

	/**
	* Sets the first name of this employee detail.
	*
	* @param firstName the first name of this employee detail
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_employeeDetail.setFirstName(firstName);
	}

	/**
	* Returns the last name of this employee detail.
	*
	* @return the last name of this employee detail
	*/
	@Override
	public java.lang.String getLastName() {
		return _employeeDetail.getLastName();
	}

	/**
	* Sets the last name of this employee detail.
	*
	* @param lastName the last name of this employee detail
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_employeeDetail.setLastName(lastName);
	}

	/**
	* Returns the group ID of this employee detail.
	*
	* @return the group ID of this employee detail
	*/
	@Override
	public long getGroupId() {
		return _employeeDetail.getGroupId();
	}

	/**
	* Sets the group ID of this employee detail.
	*
	* @param groupId the group ID of this employee detail
	*/
	@Override
	public void setGroupId(long groupId) {
		_employeeDetail.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this employee detail.
	*
	* @return the company ID of this employee detail
	*/
	@Override
	public long getCompanyId() {
		return _employeeDetail.getCompanyId();
	}

	/**
	* Sets the company ID of this employee detail.
	*
	* @param companyId the company ID of this employee detail
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employeeDetail.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this employee detail.
	*
	* @return the user ID of this employee detail
	*/
	@Override
	public long getUserId() {
		return _employeeDetail.getUserId();
	}

	/**
	* Sets the user ID of this employee detail.
	*
	* @param userId the user ID of this employee detail
	*/
	@Override
	public void setUserId(long userId) {
		_employeeDetail.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee detail.
	*
	* @return the user uuid of this employee detail
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDetail.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee detail.
	*
	* @param userUuid the user uuid of this employee detail
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employeeDetail.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this employee detail.
	*
	* @return the user name of this employee detail
	*/
	@Override
	public java.lang.String getUserName() {
		return _employeeDetail.getUserName();
	}

	/**
	* Sets the user name of this employee detail.
	*
	* @param userName the user name of this employee detail
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_employeeDetail.setUserName(userName);
	}

	/**
	* Returns the create date of this employee detail.
	*
	* @return the create date of this employee detail
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employeeDetail.getCreateDate();
	}

	/**
	* Sets the create date of this employee detail.
	*
	* @param createDate the create date of this employee detail
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employeeDetail.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this employee detail.
	*
	* @return the modified date of this employee detail
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employeeDetail.getModifiedDate();
	}

	/**
	* Sets the modified date of this employee detail.
	*
	* @param modifiedDate the modified date of this employee detail
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employeeDetail.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _employeeDetail.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employeeDetail.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employeeDetail.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeeDetail.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employeeDetail.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employeeDetail.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employeeDetail.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employeeDetail.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employeeDetail.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employeeDetail.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employeeDetail.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeDetailWrapper((EmployeeDetail)_employeeDetail.clone());
	}

	@Override
	public int compareTo(com.file.upload.model.EmployeeDetail employeeDetail) {
		return _employeeDetail.compareTo(employeeDetail);
	}

	@Override
	public int hashCode() {
		return _employeeDetail.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.file.upload.model.EmployeeDetail> toCacheModel() {
		return _employeeDetail.toCacheModel();
	}

	@Override
	public com.file.upload.model.EmployeeDetail toEscapedModel() {
		return new EmployeeDetailWrapper(_employeeDetail.toEscapedModel());
	}

	@Override
	public com.file.upload.model.EmployeeDetail toUnescapedModel() {
		return new EmployeeDetailWrapper(_employeeDetail.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employeeDetail.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeeDetail.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employeeDetail.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeDetailWrapper)) {
			return false;
		}

		EmployeeDetailWrapper employeeDetailWrapper = (EmployeeDetailWrapper)obj;

		if (Validator.equals(_employeeDetail,
					employeeDetailWrapper._employeeDetail)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmployeeDetail getWrappedEmployeeDetail() {
		return _employeeDetail;
	}

	@Override
	public EmployeeDetail getWrappedModel() {
		return _employeeDetail;
	}

	@Override
	public void resetOriginalValues() {
		_employeeDetail.resetOriginalValues();
	}

	private EmployeeDetail _employeeDetail;
}