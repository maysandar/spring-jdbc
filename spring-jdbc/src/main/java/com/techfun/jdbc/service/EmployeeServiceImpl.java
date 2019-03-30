package com.techfun.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void createEmployee(Employee employee) {
		employeeRepository.createEmployee(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepository.updateEmployee(employee);
	}

	public void deleteEmployee(Employee employee) {
		employeeRepository.deleteEmployee(employee);
	}
	
	public List<Employee> getEmployee() {
		List<Employee> employees = employeeRepository.getEmployee();
		return employees;
	}
}
