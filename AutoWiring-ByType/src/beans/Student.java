package beans;

public class Student 
{
	private College college;
	private String name;
	private int rollNo;
	private float marks;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "college name = " + college + ", student name = " + name + ", student rollNo = " + rollNo + ",student marks = " + marks;
	}
	public void display() 
	{
		System.out.println("College Info : -\n\t" + college);
	}
}
