package com.techfun.jdbc.repository;

import java.util.List;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;

public interface RideRepository {
	
	void createRide(Ride ride);
	
	void updateRide(Ride ride);
	
	void deleteRide(Ride ride);
	
	List<Ride> selectRide();
	
	Integer rideCount();
	
	Ride selectOneRide(int id);
	
}