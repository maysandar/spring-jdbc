package com.techfun.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.techfun.jdbc.connectionhelper.ConnectionHelper;
import com.techfun.jdbc.model.Ride;

@Repository
public class RideRepositoryImpl implements RideRepository {
	
	public void createRide(Ride ride) {

		String insertTableSQL = "INSERT INTO ride(name,duration) values(?,?)";

		try (Connection dbConnection = ConnectionHelper.getDBConnection();
				PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTableSQL)	){

			preparedStatement.setString(1, ride.getName());
			preparedStatement.setInt(2, ride.getDuration());

			preparedStatement.executeUpdate();
			System.out.println("Record is inserted!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}
	
	public void updateRide(Ride ride) {

		String insertTableSQL = "UPDATE ride SET name = ?,duration = ? "
                + " WHERE id = ?";


		try (Connection dbConnection = ConnectionHelper.getDBConnection();
				PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTableSQL)	){

			preparedStatement.setString(1, ride.getName());
			preparedStatement.setInt(2, ride.getDuration());
			preparedStatement.setInt(3, ride.getId());

			preparedStatement.executeUpdate();
			System.out.println("Record is updated successfully!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}
	
	public void deleteRide(Ride ride) {

		String deleteTableSQL = "DELETE from ride WHERE id = ?";


		try (Connection dbConnection = ConnectionHelper.getDBConnection();
			PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteTableSQL)	){

			preparedStatement.setInt(1, ride.getId());

			preparedStatement.executeUpdate();
			System.out.println("Record is deleted successfully!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} 
	}
	
	public void selectRide(Ride ride) {

		String selectTableSQL = "select * from ride";


		try (Connection dbConnection = ConnectionHelper.getDBConnection();
			PreparedStatement preparedStatement = dbConnection.prepareStatement(selectTableSQL)	){
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
