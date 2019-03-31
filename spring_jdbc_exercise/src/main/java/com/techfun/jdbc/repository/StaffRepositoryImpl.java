package com.techfun.jdbc.repository;

import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;

@Repository("staffRepository")

public class StaffRepositoryImpl implements StaffRepository {
	
	@Autowired
	private JdbcTemplate jdbTemplate;
	
	public void createStaff(Staff staff,Role role) {
		String sql = "INSERT INTO staff(staff_name,age,position) values(?,?,?)";
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbTemplate.update(
	              connection -> {
	                  PreparedStatement ps = connection.prepareStatement(sql, new String[]{"staff_id"});
	                  ps.setString(1, staff.getStaffName());
	                  ps.setInt(2, staff.getStaffAge());
	                  ps.setString(3, staff.getStaffPosition());
	                  return ps;
	              }, keyHolder);
		Number staffid = keyHolder.getKey();
		jdbTemplate.update("INSERT INTO role(staff_id,role_name) values(?,?)", staffid,role.getRoleName());
		
	}
}
