package com.techfun.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public void selectRide(Ride ride) {
		rideRepositoryImpl.selectRide(ride);
	}
}
