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
//		Employee emp1=new Employee();
//		emp1.id=123;
//		emp1.name="saheel";
//		emp1.email="jamadarsaheel306@gmail.com";
//		emp1.designation="developer";
//		Address adrs1=new Address();
//		adrs1.doorNo=12345;
//		adrs1.streetName="ajjskskk";
//		adrs1.city="bijapur";
//		emp1.address=adrs1;
//		System.out.println("emp1 is : "+emp1);
//		System.out.println("adrs1 is : "+adrs1);
//		adrs1.doorNo=12345;
//		adrs1.streetName="new Street";
//		adrs1.city="shindagi";
//		System.out.println("emp1 is : "+emp1);
//		System.out.println("adrs1 is : "+adrs1);
		//lose coupling chaloo karte hai loose coupling
		Employee emp2=new Employee();
		emp2.setId(12);
		emp2.setName("suman");
		emp2.setEmail("sumantotad2002@gmail.com");
		emp2.setDesignation("developer");
		Address adr2=new Address();
         adr2.setDoorNo(786);
		 adr2.setStreetName("chadchan");
		adr2.setCity("Indi");
		emp2.setAddress(adr2);
		System.out.println("emp2 is: "+emp2);
		System.out.println("adr2 is : "+adr2);
		emp2.getAddress().setStreetName("hingani");
		emp2.getAddress().setCity("bagalkote");
		System.out.println("emp2 after the change: "+emp2);
		System.out.println("adr2 is : "+adr2);

	}
	/*
	 Employee{id=123, name='saheel', email='jamadarsaheel306@gmail.com', designation='developer', address=Address{doorNo=12345, streetName='ajjskskk', city='bijapur'}}
adrs1 is : Address{doorNo=12345, streetName='ajjskskk', city='bijapur'}
emp1 is : Employee{id=123, name='saheel', email='jamadarsaheel306@gmail.com', designation='developer', address=Address{doorNo=12345, streetName='new Street', city='shindagi'}}
adrs1 is : Address{doorNo=12345, streetName='new Street', city='shindagi'}
	 */

}
