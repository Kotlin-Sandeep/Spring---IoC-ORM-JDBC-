package beans;

public class Car {
	
	private Engine engine;
	private String name;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("car name : " + name);
		System.out.println("car model year : " + engine.getModelYear());
		System.out.println("car price : " + engine.getPrice());
	}
}
