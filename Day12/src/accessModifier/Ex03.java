package accessModifier;

// other ��Ű���� People�� ���ؼ� ����.
import other.People;

class Person{
	// �ַ� �ʵ�� ���� private�� �����Ѵ�. -> �ܺο��� ���� �����ϴ� ��찡 ���� ���� �� �ʿ䵵 ���� ����
	private String name;
	private int age;
	private double height;
	
	Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	// �޼���� ���� Ŭ������ �����ڸ� ���󰣴�.
	void showInfo() {
		System.out.printf("%s (%d��, %.1fcm)\n", name, age, height);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22, 176.6);
		
		
		// private�� ������ Ŭ���� ���ο����� ���� ���� 
		// System.out.println("p1�� �̸� : " + p1.name);
		
		// ��, �޼��带 �̿��ϸ� ���������� ���� ����
		p1.showInfo();
		
		People p2 = new People("ȫ�浿", 22, 176.6);
		
		p2.showInfo();
		
	}
}














