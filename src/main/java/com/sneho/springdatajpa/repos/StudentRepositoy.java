package com.sneho.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneho.springdatajpa.entities.Student;

public interface StudentRepositoy extends JpaRepository<Student, Long>{

}
