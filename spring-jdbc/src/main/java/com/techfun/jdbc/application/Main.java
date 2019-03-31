package com.techfun.jdbc.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.EmployeeService;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		RideService service = appContext.getBean("rideService", RideService.class);
		// TODO Auto-generated method stub

		//testCreateRide(service);
		 //testUpdateRide(service);
		// testDeleteRide(ride);
		// testSelectRide(service);
		//testCountRide(service);
		testSelectOneRide(service);
	}

	private static void testCreateRide(RideService rideService) {
		Ride ride = new Ride();
		ride.setName("Phyo Paing");
		ride.setDuration(15);
		rideService.createRide(ride);
		System.out.println("Process Successful completed!");
	}

	private static void testUpdateRide(RideService rideService) {
		Ride ride = new Ride();
		ride.setName("Pyae Phyo");
		ride.setDuration(11);
		ride.setId(1);
		rideService.updateRide(ride);
		System.out.println("Process Successful completed!");
	}

	private static void testDeleteRide(RideService rideService) {
		Ride ride = new Ride();
		ride.setId(2);
		rideService.deleteRide(ride);
		System.out.println("Process Successful completed!");
	}

	private static void testSelectRide(RideService rideService) {
		List<Ride> rideList = rideService.getRide();

		for (Ride rl : rideList) {
			System.out.println("ID" + rl.getId());
			System.out.println("Name" + rl.getName());
			System.out.println("Duration" + rl.getDuration());
		}
		System.out.println("Process Successful completed!");
	}
	
	private static void testCountRide(RideService rideService) {
		int count = rideService.rideCount();
		System.out.println(count);
		System.out.println("Process Successful completed!");
	}
	
	private static void testSelectOneRide(RideService rideService) {
		
		Ride ride = rideService.selectOneRide(11);
		System.out.println(ride.getName());
		System.out.println(ride.getDuration());
		System.out.println("Process Successful completed!");
	}
	
}
