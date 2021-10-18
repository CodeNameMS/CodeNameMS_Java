package inherited;

// 상속 관계에서는 생성자의 호출 순서가 중요하다
// - 자식 클래스의 공간이 생성될 때 먼저 부모의 공간만을 생성한다.
// - 즉, 자식클래스는 부모의 생성자를 호출한다!!!

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println("부모 생성자 호출");
	}
	
	void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
}

// ex 후 스페이스바 -> 자동완성 extends
class Student extends Person{
	int score;
	
	// 자식클래스의 생성자는 기본적으로 부모의 기본생성자를 호출하게 끔 작성되어 있다.
	// 따라서, super()라는 키워드를 통해서 부모의 생성자를 지정해줘야 제댈로 호출 가능
	Student(String name, int age, int score){
		super(name, age);	// Person(String, int)를 호출하는 것
		this.score = score;
		
		System.out.println("자식 생성자 호출");
	}
	
	// 메서드 오버라이딩 : 부모의 메서들를 재정의하는 것.
	void showInfo() {
		System.out.printf("%s (%d세, %d점)\n", name, age, score);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22);
		System.out.println();
		
		Student s1 = new Student("김길동", 17, 90);
		
		p1.showInfo();
		s1.showInfo();
		
	}
}




































