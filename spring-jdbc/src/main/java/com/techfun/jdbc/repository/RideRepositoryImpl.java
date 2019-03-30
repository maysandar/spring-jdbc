package com.techfun.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.util.RideRowMapper;

@Repository
public class RideRepositoryImpl implements RideRepository {

	@Autowired
	private JdbcTemplate jdbTemplate;
	public void createRide(Ride ride) {

		jdbTemplate.update("INSERT INTO ride(name,duration) values(?,?)", ride.getName(), ride.getDuration());
		System.out.println("Test transaction");
	}

	public void updateRide(Ride ride) {

		jdbTemplate.update("UPDATE ride SET name = ?,duration = ? \" + \" WHERE id = ?", ride.getName(), ride.getDuration(), ride.getId());
		
	}

	public void deleteRide(Ride ride) {

		jdbTemplate.update("DELETE from ride WHERE id = ?", ride.getId());
	}
	
	@Override
	public List<Ride> selectRide() {
		// TODO Auto-generated method stub
		List<Ride> rides = jdbTemplate.query("SELECT * FROM ride", new RideRowMapper());
		return rides;
	}

}
