package Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Demo;

public class Client {
	public static void main(String[] args) {
		//Resource res = new ClassPathResource("resources/spring.xml");
		
		ApplicationContext fac =  new ClassPathXmlApplicationContext("resources/spring.xml");
		
		//BeanFactory  fac = new XmlBeanFactory(res);
		
		Demo t1 = (Demo)fac.getBean("abc");
		t1.show();
		}
}
