package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List book;
	private Set student;
	private Map course;
	
	public void setBook(List book) {
		this.book = book;
	}
	public void setStudent(Set student) {
		this.student = student;
	}
	public void setCourse(Map course) {
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