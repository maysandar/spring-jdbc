package com.techfun.jdbc.repository.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;

public class RideRowMapper implements RowMapper<Ride> {
	
	@Override
	public Ride mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Ride ride = new Ride();
		ride.setId(rs.getInt("id"));
		ride.setName(rs.getString("name"));
		ride.setDuration(rs.getInt("duration"));
		return ride;
	}

}
