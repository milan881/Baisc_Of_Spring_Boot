package com.example.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entites.Student;
import com.example.demo.repository.StudentRepo;

/**
 * Test class for verifying the functionality of StudentRepo.
 * It includes test methods for saving, deleting, and retrieving
 * student records in the database.
 */
@SpringBootTest
class DemoApplicationTests {

	// Injecting the StudentRepo to interact with the database
	@Autowired
	private StudentRepo studentRepo;
	
	 /**
     * Test to save a single student record into the database.
     * Ensures that the save operation is working as expected.
     */
	@Test
	void SaveOneRecord() {
		System.out.println(studentRepo);
		Student S1 = new Student();
		S1.setName("Milan");
		S1.setCourse("Development");
		S1.setFee(1000);
		
		//Save
		studentRepo.save(S1);
		
	}

	/**
     * Test to delete a student record from the database by its ID.
     * This method checks if the delete operation works correctly.
     */
	@Test
	void deleteOneRecord(){
		studentRepo.deleteById(1L);
	}
	

    /**
     * Test to retrieve a student record from the database by its ID.
     * It ensures that the find operation retrieves the expected record.
     */
	@Test
	void redingTheRecord() {
		Optional<Student> find = studentRepo.findById(2L);
		Student S = find.get();
		System.out.println(S.getId());
		System.out.println(S.getName());
		System.out.println(S.getCourse());
		System.out.println(S.getFee());
	}
	
	
	/**
	 * Test to update an existing student record in the database.
	 * Checks if the student exists, modifies its details, and updates the record.
	 */
	@Test
	void updateStudentRecord() {
		Optional<Student> find = studentRepo.findById(2L);
		Student S1 = find.get();
		S1.setCourse("Spring Boot Developer");
		studentRepo.save(S1);
	}
	
}
