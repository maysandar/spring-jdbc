package com.techfun.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.repository.util.EmployeeRowMapper;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	private JdbcTemplate jdbTemplate;

	@Override
	public void createEmployee(Employee employee) {

		jdbTemplate.update("INSERT INTO employee(name,age,address) values(?,?,?)", employee.getName(),
				employee.getAge(), employee.getAdress());
	}

	public void updateEmployee(Employee employee) {

		jdbTemplate.update("UPDATE employee SET name = ?,age = ?,address = ? WHERE id = ?", employee.getName(),
				employee.getAge(), employee.getAdress(), employee.getId());

	}

	public void deleteEmployee(Employee employee) {

		jdbTemplate.update("DELETE from employee WHERE id = ?", employee.getId());
	}

	@Override
	public List<Employee> getEmployee() {
		
		List<Employee> employees = jdbTemplate.query("SELECT * FROM employee", new EmployeeRowMapper());

		return employees;
	}

}
