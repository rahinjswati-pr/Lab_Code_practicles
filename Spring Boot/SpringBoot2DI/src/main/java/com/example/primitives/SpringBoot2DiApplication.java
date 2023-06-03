package com.example.primitives;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.primitives.bean.Student;

@SpringBootApplication
public class SpringBoot2DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=
		SpringApplication.run(SpringBoot2DiApplication.class, args);
		
		Student s=c.getBean(Student.class);
		System.out.println("****STUDENT INFORMATION****");
		System.out.println(s);
	}

}
