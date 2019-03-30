package com.techfun.jdbc.repository;

import java.util.List;

import com.techfun.jdbc.model.Employee;

public interface EmployeeRepository {
	void createEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
	List<Employee> getEmployee();
	
}
