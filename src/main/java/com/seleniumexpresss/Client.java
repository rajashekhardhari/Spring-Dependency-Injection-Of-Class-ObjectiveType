package com.seleniumexpresss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		/*
		 * Student student = new Student(); MathCheat cheat = new MathCheat();
		 * student.setMathcheat(cheat);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans.xml file loaded");

		Student student = context.getBean("stu", Student.class);

		student.cheating();

		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.startCheating();
	}

}
