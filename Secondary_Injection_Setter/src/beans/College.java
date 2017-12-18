package beans;

public class College {
	
	private Student student;
	
	private String name;

	public void setStudent(Student student) {
		this.student = student;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void show()
	{
		System.out.println("College Name : " + name +"\n-----------------------------");
		System.out.println("Student Id : " + student.getId());
		System.out.println("Student name : " + student.getName());
		System.out.println("Student course : " + student.getCourse());
		System.out.println("Student fee paid : " + student.isFeePaid());
	}
}
