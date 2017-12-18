package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/employeeConfig.xml");
		
		Employee e = (Employee)context.getBean("e");
		
		System.out.println("The student infromation is: \n" + e);
	}
}
