package _static;

class People{
	private String name;
	private int age;
	
	private static int eyes = 2;
	
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	static int getEyes() {
		// name = "ȫ�浿";	// ���� �޼���� �Ϲ� ����� ������ �Ұ����ϴ�.
		return eyes;
	}

	static void setEyes(int eyes) {
		// this.eyes = eyes;	// this�� ��ü�� ����ް� �����ϴ� ���� -> static���� ��� �Ұ���
		People.eyes = eyes;
	}

	void show() {
		System.out.printf("%s (%d��, �� %d��)\n", name, age, eyes);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("���� ����� ������ : " + People.getEyes());
		
		People p1 = new People("ȫ�浿", 20);
		People p2 = new People("��浿", 40);
		People p3 = new People("�̱浿", 17);
		
		People.setEyes(3);
		
		p1.show();
		p2.show();
		p3.show();
	}
}





















