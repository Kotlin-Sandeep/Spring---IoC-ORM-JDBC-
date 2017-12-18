package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.College;

public class Client {
	public static void main(String[] args) {
		String[] files = new String[]{"resources/student.xml","resources/college.xml"};
		ApplicationContext ac = new ClassPathXmlApplicationContext(files);
		College col= (College)ac.getBean("c");
		col.show();
		
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("resources/college-student.xml");
		College co= (College)ac1.getBean("c");
		co.show();
		
	}
}
