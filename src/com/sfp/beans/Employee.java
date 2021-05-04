package com.sfp.beans;

public class Employee {
private String employeeName;
private String employeeEmail;
private Integer employeeNumber;
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeEmail() {
	return employeeEmail;
}
public void setEmployeeEmail(String employeeEmail) {
	this.employeeEmail = employeeEmail;
}
public Integer getEmployeeNumber() {
	return employeeNumber;
}
public void setEmployeeNumber(Integer employeeNumber) {
	this.employeeNumber = employeeNumber;
}
@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeEmail=" + employeeEmail + ", employeeNumber="
			+ employeeNumber + "]";
}

}
