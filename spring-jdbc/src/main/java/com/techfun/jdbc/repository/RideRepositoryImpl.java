package com.techfun.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.connectionhelper.ConnectionHelper;
import com.techfun.jdbc.model.Ride;

@Repository
public class RideRepositoryImpl implements RideRepository {

	@Autowired
	private JdbcTemplate jdbTemplate;
	public void createRide(Ride ride) {

		jdbTemplate.update("INSERT INTO ride(name,duration) values(?,?)", ride.getName(), ride.getDuration());
	}

	public void updateRide(Ride ride) {

		jdbTemplate.update("UPDATE ride SET name = ?,duration = ? \" + \" WHERE id = ?", ride.getName(), ride.getDuration(), ride.getId());
		
	}

	public void deleteRide(Ride ride) {

		jdbTemplate.update("DELETE from ride WHERE id = ?", ride.getId());
	}

	public void selectRide(Ride ride) {

		String selectTableSQL = "select * from ride";

		try (Connection dbConnection = ConnectionHelper.getDBConnection();
				PreparedStatement preparedStatement = dbConnection.prepareStatement(selectTableSQL)) {
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				String id = rs.getString("id");
				String name = rs.getString("name");
				String duration = rs.getString("duration");

				System.out.println("Ride id : " + id);
				System.out.println("Ride name : " + name);
				System.out.println("Ride duration : " + duration);
				System.out.println("----------------------");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}
}
