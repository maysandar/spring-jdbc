package com.techfun.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;
import com.techfun.jdbc.service.StaffService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StaffService service = appContext.getBean("staffService", StaffService.class);
		testCreateStaff(service);
	}
	
	private static void testCreateStaff(StaffService staffservice) {
		Staff staff = new Staff();
		Role role = new Role();
		staff.setStaffName("May Sandar");
		staff.setStaffAge(27);
		staff.setStaffPosition("Developer");
		role.setRoleName("Java");
		staffservice.createStaff(staff, role);
		System.out.println("Process Successful completed!");
	}
}
