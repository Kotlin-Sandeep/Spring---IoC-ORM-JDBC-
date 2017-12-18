package beans;

public class Test {
	private String name[];
	private float marks[];
	
	public void setName(String[] name) {
		this.name = name;
	}
	
	public void setMarks(float[] marks) {
		this.marks = marks;
	}

	public void showName(String text){
		System.out.println(text);
		System.out.println("--------------------------");
		
		for(String s:name)
		System.out.println("Name: " + s);
	}

	public void showMarks(String text){
		System.out.println("\n"+text);
		System.out.println("--------------------------");
		
		for(float s:marks)
		System.out.println("Name: " + s);
	}
}