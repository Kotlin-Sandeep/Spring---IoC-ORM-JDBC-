package beans;

public class Employee {
	private String name, email, department;
	private int id;
	private long mobileNo;
	
	public Employee(int id, long mobileNo, String name, String email, String department) {
		this.name = name;
		this.email = email;
		this.department = department;
		this.id = id;
		this.mobileNo = mobileNo;
	}



	@Override
	public String toString() {
		return "Id = " + id + "\nName = " + name + ",\nEmail = " + email + ",\nDepartment = " + department
				+ ",\nMobileNo = " + mobileNo;
	}	
}