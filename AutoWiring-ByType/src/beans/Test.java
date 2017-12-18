package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("resource/ApplicationContext.xml");
		Student stu = (Student) context.getBean("se");
		System.out.println("Student Info : -\n\t" + stu);
		stu.display();
	}
}
