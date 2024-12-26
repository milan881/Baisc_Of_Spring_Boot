package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entites.Student;

public interface StudentRepo extends CrudRepository<Student, Long> {

}
