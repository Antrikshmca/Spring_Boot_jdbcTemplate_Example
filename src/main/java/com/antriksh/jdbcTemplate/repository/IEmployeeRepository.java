package com.antriksh.jdbcTemplate.repository;

import com.antriksh.jdbcTemplate.model.Employee;

public interface IEmployeeRepository {
	
	 
	int saveEmployee(Employee e);
	int updateEmployee(Employee e);
	int deleteEmployee(Integer e);

}
