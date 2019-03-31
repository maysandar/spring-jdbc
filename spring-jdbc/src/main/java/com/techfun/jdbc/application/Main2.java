package com.techfun.jdbc.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.EmployeeService;
import com.techfun.jdbc.service.RideService;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService service = appContext.getBean("employeeService", EmployeeService.class);
		// TODO Auto-generated method stub
		//testInsertEmployeeandRide(service);
		// testCreateEmployee(service);

		//testSelectEmployee(service);
		//testCountEmployee(service);
		testSelectOneEmployee(service);
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
	
	private static void testInsertEmployeeandRide(EmployeeService employeeService) {
		Employee employee = new Employee();
		Ride ride = new Ride();
		employee.setName("May Sandar");
		employee.setAge(20);
		;
		employee.setAddress("151");
		
		ride.setName("May Dway");
		ride.setDuration(15);
		
		employeeService.insertEmployeeAndRide(employee, ride);
		
		System.out.println("Process Successful completed!");
	}
	
	private static void testCountEmployee(EmployeeService employeeService) {
		int count = employeeService.empCount();
		System.out.println(count);
		System.out.println("Process Successful completed!");
	}
	
	private static void testSelectOneEmployee(EmployeeService employeeService) {
		
		Employee employee = employeeService.selectOneEmployee(13);
		System.out.println(employee.getName());
		System.out.println(employee.getAdress());
		System.out.println(employee.getAge());
		System.out.println("Process Successful completed!");
	}

}
