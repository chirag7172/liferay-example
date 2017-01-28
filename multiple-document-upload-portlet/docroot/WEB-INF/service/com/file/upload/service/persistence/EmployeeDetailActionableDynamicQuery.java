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
import com.file.upload.service.EmployeeDetailLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author ChiragSoni
 * @generated
 */
public abstract class EmployeeDetailActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public EmployeeDetailActionableDynamicQuery() throws SystemException {
		setBaseLocalService(EmployeeDetailLocalServiceUtil.getService());
		setClass(EmployeeDetail.class);

		setClassLoader(com.file.upload.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("employeeId");
	}
}