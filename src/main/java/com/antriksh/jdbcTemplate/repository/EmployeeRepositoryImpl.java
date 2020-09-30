package com.antriksh.jdbcTemplate.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.antriksh.jdbcTemplate.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements IEmployeeRepository {
	@Autowired
	private JdbcTemplate jt;

	
	  @Override public int saveEmployee(Employee e) { 
			/*
			 * String sql="insert into Employee values(?,?,?,?)"; return
			 * jt.update(sql,e.getAddress(),e.getName(),e.getSalary());
			 */
		  return 0;
		  }
	 

	@Override
	public int updateEmployee(Employee e) {
		return 0;
	}

	@Override
	public int deleteEmployee(Integer e) {
		return 0;
	}

}
