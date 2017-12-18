package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/employeeConfig.xml");
		
		Employee e = (Employee)factory.getBean("t");
		System.out.println(e);
	}
}
