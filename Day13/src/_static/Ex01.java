package _static;

// static : 정적

class Person{
	// 일반 멤버 : non-static이라고 한다.
	// ㄴ> new 로 인스턴스가 생성될 때 만들어지고 사용할 수 있다.
	// ㄴ> new 로 인스턴스가 생성될 때마다 별개의 공간을 가짐. 즉, 객체마다 다르게 값을 구성
	String name;
	int age;
	
	// 정적 멤버 : static이라고 한다.
	// ㄴ> 클래스가 작성된 순간부터 만들어져 있다. 즉, 객체가 없어도 있다는 의미
	// ㄴ> 클래스가 가지는 멤버로, 해당 클래스로 작성된 객체들이 '공유'하는 공간
	static int eyes;
	
	Person(String name, int age){

		this.name = name;
		this.age = age;

	}
	
	void show() {
		System.out.printf("%s (%d세, %d개)\n", name, age, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("김길동", 15);
		Person p3 = new Person("이길동", 30);
		
		Person.eyes = 1;
		
		p1.show();
		p2.show();
		p3.show();
	}
}













