package com.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdbc.dao.StudentDao;
import com.jdbc.dao.StudentDaoImpl;
import com.jdbc.entity.Student;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
		
		Student student = new Student();
		student.setId(1);
		student.setName("Syed");
		student.setMobile(1234);
		student.setCountry("India");
		
		
		StudentDao dao = (StudentDao) new StudentDaoImpl();
		
		dao.insert(student);
	}

}
