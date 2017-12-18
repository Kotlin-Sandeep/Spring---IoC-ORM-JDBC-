package beans;

public class College {
	private String collegeName;
	private Student[] student;
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}

	public void show()
	{
		System.out.println("College Name is: - " + collegeName + "\n----------------------------------------");
		for(Student s : student)
			System.out.println(s.toString());
	}
}
