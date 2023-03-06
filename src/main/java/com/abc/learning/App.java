package com.abc.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.learning.interfaces.Vehicle;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");

		Vehicle car1 = context.getBean("car", Vehicle.class);
		Vehicle car2 = context.getBean("car", Vehicle.class);

		Vehicle rikshaw1 = context.getBean("rikshaw", Vehicle.class);
		Vehicle rikshaw2 = context.getBean("rikshaw", Vehicle.class);
		
		System.out.println("*** Singleton Bean Scope ***");
		System.out.println("car1 : "+car1);
		System.out.println("car2 : "+car2);
		System.out.println("car1 == car2 : "+(car1==car2));
		System.out.println();
		
		System.out.println("*** Prototype Bean Scope ***");
		System.out.println("rikshaw1 : "+rikshaw1);
		System.out.println("rikshaw2 : "+rikshaw2);
		System.out.println("rikshaw1 == rikshaw2 : "+(rikshaw1==rikshaw2));
		System.out.println();
		
		context.close();
	}
}
