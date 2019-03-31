package com.techfun.jdbc.service;

import com.techfun.jdbc.model.Staff;
import com.techfun.jdbc.model.Role;

public interface StaffService {
	void createStaff(Staff staff,Role role);

}
