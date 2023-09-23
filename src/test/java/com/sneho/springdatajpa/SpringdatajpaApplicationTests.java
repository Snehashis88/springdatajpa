package com.sneho.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sneho.springdatajpa.entities.Student;
import com.sneho.springdatajpa.repos.StudentRepositoy;

@SpringBootTest
class SpringdatajpaApplicationTests {
	
	@Autowired
	private StudentRepositoy repository;

	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Snehashis");
		student.setTestScore(100);
		repository.save(student);
		Student savedStudent = repository.findById(1l).get();
		assertNotNull(savedStudent);
	}

}
