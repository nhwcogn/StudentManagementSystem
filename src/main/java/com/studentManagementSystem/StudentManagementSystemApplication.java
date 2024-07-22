package com.studentManagementSystem;

import com.studentManagementSystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentManagementSystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Le", "Ngoc", "ngoc123@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Nguyen", "A", "nguyenvana@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Pham", "B", "phamthiB@gmail.com");
//		studentRepository.save(student3);
	}

}
