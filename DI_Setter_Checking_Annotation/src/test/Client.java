package test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.DAO;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/dao.xml");
		DAO d= (DAO)ac.getBean("c");
		d.getConnect();
	}
}
