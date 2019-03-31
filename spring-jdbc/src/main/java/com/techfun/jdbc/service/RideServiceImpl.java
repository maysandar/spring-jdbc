package com.techfun.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.RideRepositoryImpl;

@Service("rideService")
public class RideServiceImpl implements RideService {

	@Autowired
	private RideRepositoryImpl rideRepositoryImpl;

	public void createRide(Ride ride) {
		rideRepositoryImpl.createRide(ride);
	}

	public void updateRide(Ride ride) {
		rideRepositoryImpl.updateRide(ride);
	}

	public void deleteRide(Ride ride) {
		rideRepositoryImpl.deleteRide(ride);
	}

	public List<Ride> getRide() {
		List<Ride> rides = rideRepositoryImpl.selectRide();
		return rides;
	}
	
	public Integer rideCount() {
		int count = rideRepositoryImpl.rideCount();
		return count;
	}
	
	public Ride selectOneRide(int id) {
		Ride ride1 = rideRepositoryImpl.selectOneRide(id);
		return ride1;
	}
}
