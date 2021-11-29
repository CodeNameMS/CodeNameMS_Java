package _abstract;

interface Coding {
	// 필드는 자동으로 public static final 속성을 갖는다.
	String Language = "Java";
	
	// 메서드는 자동으로 public abstract 속성을 갖는다.
	void programming();
}

abstract class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("이름 : " + name);
	}
	
	abstract void study();
	
}

class Student extends Person implements Coding {
	int scores;
	
	Student(String name, int scores) {
		super(name);
		this.scores = scores;
	}
	
	@Override
	void study() {
		System.out.println("수학의 정석을 공부");
	}
	
	@Override
	public void programming() {
		System.out.println(Language + "로 코딩 중");
	}
}

class Child extends Person {
	
	Child(String name){
		super(name);
	}
	
	@Override
	void study() {
		System.out.println("곱하기를 외우는 중");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 70);
		Child c1 = new Child("김길동");
		
		// Person[] p1 = new Person[] { s1, c1 };
		
		s1.showInfo();
		c1.showInfo();
		
		s1.study();
		c1.study();
		System.out.println();
		
		s1.programming();
		// c1.programming();
		// ㄴ> c1은 Coding을 구현하고 있지 않다
		
		// Coding cod = new Coding();
		// ㄴ> 인터페이스도 객체 생성이 불가능
		
		// 추상 클래스 vs 인터페이스
		// 1. 추상클래스 
		// - 클래스는 기능의 '확장'을 위해서 사용
		// - 단, 한 개만 상속 가능
		
		// 2. 인터페이스
		// - 인터페이스는 특정 기능을 '구현'함을 '증명'하기 위해서 사용
		// - 주로 전체적인 확장이 아니라, 특정 속성을 추가하는 개념
		// - 개수 제한 없이 상속가능. 단, 그만큼 인터페이스의 기능을 구현해야 한다.
		
		
		
		
		
	}
}


















