package com.techfun.jdbc.repository;

import com.techfun.jdbc.model.Role;
import com.techfun.jdbc.model.Staff;

public interface StaffRepository {
	
	public void createStaff(Staff staff,Role role);

}
