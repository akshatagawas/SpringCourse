package com.springboot.learn_jpa_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn DevOps", "Baker Keith"));
//		repository.insert(new Course(2, "Learn AWS", "Billy Grande"));
//		repository.insert(new Course(3, "Learn AI", "Matthew Francisco"));
//		repository.insert(new Course(4, "Learn React", "Anurag Bisht"));
//		repository.insert(new Course(5, "Learn ML", "Keith Simmons"));
		
		
		
		
		
		repository.save(new Course(1, "Learn DevOps", "Baker Keith"));
		repository.save(new Course(2, "Learn AWS", "Billy Grande"));
		repository.save(new Course(3, "Learn AI", "Matthew Francisco"));
		repository.save(new Course(4, "Learn React", "Anurag Bisht"));
		repository.save(new Course(5, "Learn ML", "Keith Simmons"));
		
		
		
		
		repository.deleteById(3l);
		
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(4l));
		System.out.println(repository.findById(5l));
		
		
		System.out.println(repository.findByAuthor("Anurag Bisht"));
		System.out.println(repository.findByName("Learn AWS"));
		
		
		
		
	}

}
