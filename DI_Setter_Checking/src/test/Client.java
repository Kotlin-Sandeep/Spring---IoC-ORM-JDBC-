package test;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import beans.Car;

public class Client {
	public static void main(String[] args) {
		String[] files = new String[]{"resources/car.xml","resources/engine.xml"};
		ApplicationContext ac = new ClassPathXmlApplicationContext(files);
		Car car= (Car)ac.getBean("d");
		car.show();
	}
}

