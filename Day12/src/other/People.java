package other;

public class People {
	private String name;
	private int age;
	private double height;
	
	public People(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.printf("%s (%d¼¼, %.1fcm)\n", name, age, height);
	}
}
