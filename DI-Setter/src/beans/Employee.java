package beans;

public class Employee {
	private String name, email, department;
	private int id;
	private long mobileNo;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Id=" + id + "\nName=" + name + ",\nEmail=" + email + ",\nDepartment=" + department
				+ ",\nMobileNo=" + mobileNo;
	}	
}