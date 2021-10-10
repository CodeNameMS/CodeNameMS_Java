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
		// name = "홍길동";	// 정적 메서드는 일반 멤버의 참조가 불가능하다.
		return eyes;
	}

	static void setEyes(int eyes) {
		// this.eyes = eyes;	// this는 객체를 저장받고 구분하는 역할 -> static에선 사용 불가능
		People.eyes = eyes;
	}

	void show() {
		System.out.printf("%s (%d세, 눈 %d개)\n", name, age, eyes);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("현재 사람의 눈개수 : " + People.getEyes());
		
		People p1 = new People("홍길동", 20);
		People p2 = new People("김길동", 40);
		People p3 = new People("이길동", 17);
		
		People.setEyes(3);
		
		p1.show();
		p2.show();
		p3.show();
	}
}





















