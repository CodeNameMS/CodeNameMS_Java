package _final;

// 메서드의 final : 오버라이딩 불가능

class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name;
	}
	
	final void eat(String food) {
		System.out.println(name + "(이)가 "+ food +"(을)를 먹는다");
	}
}

class Student extends Person {
	private int scores;
	
	Student(String name, int scores){
		super(name);
		this.scores = scores;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", " + scores + "점";
	}
	
	// final 메서드는 자식에서 오버라이딩이 불가능. 단, 일반 메서드처럼 실행은 똑같이 된다.
//	@Override
//	void eat(String food) {
//		System.out.println("배가 안고파서 끼니를 거른다.");
//	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		
		System.out.println("p1 = " + p1);
		p1.eat("라면");
		
		Student s1 = new Student("김길동", 90);
		
		System.out.println("\ns1 = " + s1);
		s1.eat("카레");
	}
}
















