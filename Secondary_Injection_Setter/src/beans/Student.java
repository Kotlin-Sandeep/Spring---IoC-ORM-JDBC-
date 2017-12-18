package beans;

public class Student {
	
	private int id;
	private String name, course;
	private boolean feePaid;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setFeePaid(boolean feePaid) {
		this.feePaid = feePaid;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public boolean isFeePaid() {
		return feePaid;
	}
}
