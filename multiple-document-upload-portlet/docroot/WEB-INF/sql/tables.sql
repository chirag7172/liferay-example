create table employee_detail (
	employeeId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);