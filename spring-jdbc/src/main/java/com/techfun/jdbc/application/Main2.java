package com.techfun.jdbc.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.service.EmployeeService;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService service = appContext.getBean("employeeService", EmployeeService.class);
		// TODO Auto-generated method stub

		// testCreateEmployee(service);

		testSelectEmployee(service);
	}

	private static void testCreateEmployee(EmployeeService employeeService) {
		Employee employee = new Employee();
		employee.setName("Phyo Paing");
		employee.setAge(20);
		;
		employee.setAddress("15");
		employeeService.createEmployee(employee);
		System.out.println("Process Successful completed!");
	}

	private static void testUpdateEmployee(EmployeeService employeeService) {
		Employee employee = new Employee();
		employee.setName("Pyae Phyo");
		employee.setAge(11);
		employee.setAddress("No.4");
		employee.setId(1);
		employeeService.updateEmployee(employee);
		System.out.println("Process Successful completed!");
	}

	private static void testDeleteEmployee(EmployeeService employeeService) {
		Employee employee = new Employee();
		employee.setId(2);
		employeeService.deleteEmployee(employee);
		System.out.println("Process Successful completed!");
	}

	private static void testSelectEmployee(EmployeeService employeeService) {

		List<Employee> empList = employeeService.getEmployee();

		for (Employee emp : empList) {
			System.out.println("ID" + emp.getId());
			System.out.println("Name" + emp.getName());
			System.out.println("Address" + emp.getAdress());
			System.out.println("Age" + emp.getAge());
		}
		System.out.println("Process Successful completed!");
	}

}
