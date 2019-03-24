package com.techfun.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.EmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepositoryImpl employeeRepositoryImpl;
	@Override
	public void createEmployee(Employee employee) {
		employeeRepositoryImpl.createEmployee(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepositoryImpl.updateEmployee(employee);
	}

	public void deleteEmployee(Employee employee) {
		employeeRepositoryImpl.deleteEmployee(employee);
	}

}
