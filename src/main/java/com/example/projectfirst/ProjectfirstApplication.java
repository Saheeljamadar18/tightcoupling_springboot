package com.example.projectfirst;

import com.example.projectfirst.model.Address;
import com.example.projectfirst.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectfirstApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectfirstApplication.class, args);
		
		System.out.print("hello everyone,this is our first springboot app!!");
		//tight coupling
		Employee emp1=new Employee();
		emp1.id=123;
		emp1.name="saheel";
		emp1.email="jamadarsaheel306@gmail.com";
		emp1.designation="developer";
		Address adrs1=new Address();
		adrs1.doorNo=12345;
		adrs1.streetName="ajjskskk";
		adrs1.city="bijapur";
		emp1.address=adrs1;
		System.out.println("emp1 is : "+emp1);
		System.out.println("adrs1 is : "+adrs1);

	}

}
