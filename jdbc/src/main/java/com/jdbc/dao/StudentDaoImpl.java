package com.jdbc.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc.entity.Student;
import com.zaxxer.hikari.util.DriverDataSource;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

	public void insert(Student student) {

		String sql = "INSERT INTO STUDENT VALUES (?,?,?,?)";

		Object args[] = { student.getId(), student.getName(), student.getMobile(), student.getCountry() };

		jdbcTemplate.update(sql, args);

	}
	
	public DataSource getDataSource() {
		
		String url = "jdbc:mysql://127.0.0.1:3306/javabatch";
		String username = "root";
		String password = "Temp1234";
		
		
		DataSource dataSource = new DriverManagerDataSource(url, username, password);
	
		return dataSource;
	}

}
