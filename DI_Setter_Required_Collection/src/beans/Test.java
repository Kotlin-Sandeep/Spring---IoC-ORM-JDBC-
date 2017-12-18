package beans;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	private LinkedList book;
	private TreeSet student;
	private HashMap course;
	
	public void setBook(LinkedList book) {
		this.book = book;
	}
	public void setStudent(TreeSet student) {
		this.student = student;
	}
	public void setCourse(HashMap course) {
		this.course = course;
	}
	
	public void show()
	{
		System.out.println("\n------------------------\nBooks Data : \n------------------------");
		for(Object o :book){
			System.out.println(o);
		}
		
		System.out.println("\n------------------------\nStudent Data : \n------------------------");
		for(Object o :student){
			System.out.println(o);
		}
		
		System.out.println("\n------------------------\nCourse Data : \n------------------------");
		Set keys =	course.keySet();
		for(Object o :keys){
			System.out.println("Course Type : " + o + "   Course Info : "+course.get(o));
		}
	}
}