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

package com.file.upload.model.impl;

import com.file.upload.model.EmployeeDetail;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeDetail in entity cache.
 *
 * @author ChiragSoni
 * @see EmployeeDetail
 * @generated
 */
public class EmployeeDetailCacheModel implements CacheModel<EmployeeDetail>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{employeeId=");
		sb.append(employeeId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeDetail toEntityModel() {
		EmployeeDetailImpl employeeDetailImpl = new EmployeeDetailImpl();

		employeeDetailImpl.setEmployeeId(employeeId);

		if (firstName == null) {
			employeeDetailImpl.setFirstName(StringPool.BLANK);
		}
		else {
			employeeDetailImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			employeeDetailImpl.setLastName(StringPool.BLANK);
		}
		else {
			employeeDetailImpl.setLastName(lastName);
		}

		employeeDetailImpl.setGroupId(groupId);
		employeeDetailImpl.setCompanyId(companyId);
		employeeDetailImpl.setUserId(userId);

		if (userName == null) {
			employeeDetailImpl.setUserName(StringPool.BLANK);
		}
		else {
			employeeDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			employeeDetailImpl.setCreateDate(null);
		}
		else {
			employeeDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeDetailImpl.setModifiedDate(null);
		}
		else {
			employeeDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeDetailImpl.resetOriginalValues();

		return employeeDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeId = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeId);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long employeeId;
	public String firstName;
	public String lastName;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}