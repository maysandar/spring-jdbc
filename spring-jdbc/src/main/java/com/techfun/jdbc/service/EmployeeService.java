package com.techfun.jdbc.service;

import java.util.List;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;

public interface EmployeeService {
	void createEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
	List<Employee> getEmployee();
	void insertEmployeeAndRide(Employee employee, Ride ride);
}
