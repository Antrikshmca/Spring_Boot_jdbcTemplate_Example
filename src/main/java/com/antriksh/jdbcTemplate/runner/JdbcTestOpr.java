package com.antriksh.jdbcTemplate.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.antriksh.jdbcTemplate.model.Employee;
import com.antriksh.jdbcTemplate.repository.IEmployeeRepository;

@Component
public class JdbcTestOpr implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jt;
	@Autowired
	private IEmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {

		//repo.saveEmployee());
		 
		 
		 //int count = jt.update(sql); 
		 //System.out.println("inserted rows "+ count);
		  
		 

	}

}
