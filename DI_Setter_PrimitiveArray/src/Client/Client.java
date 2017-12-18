package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spconfig.xml");
		Test t = (Test)context.getBean("tt");
		t.showName("The Names are: ");
		t.showMarks("The marks are: - ");
	}
}