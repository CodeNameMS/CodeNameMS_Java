package oop;

// 클래스 : 객체의 도면 상태 (첫글자는 대문자)
// ㄴ> 작성한 클래스는 자바 코드내에서 새로운 자료형으로 동작한다.
class Person{	// 코드 내에서 사람을 표현하고 싶음
	// 1. 속성 : 맴버 변수로 표현
	String name;
	int age;
	double height;
	
	// 2. 기능(= 메서드) : 멤버 함수로 표현
	void sleep() {	// void sleep(Person this)
		System.out.println(name + "(이)가 잠을 잔다. Zzz...쿠울..");
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		Person p2 = null;		// null은 데이터가 없음, 비어있음을 의미한다.
		
		p1.name = "홍길동";		// 참조 변수를 통해서, 인스턴스 공간(= new로 생성된 공간)에 접근하려면
		p1.age = 27;			// . (참조 연산자)를 활용한다.
		p1.height = 171.6;
		
		System.out.println("p1의 이름 : " + p1.name);
		System.out.println("p1의 나이 : " + p1.age);
		System.out.println("p1의 신장 : " + p1.height);
		
		p1.sleep();		//sleep(p1)
		
		// p2는 현재 Person의 공간(= instance)가 없다.
		// p2.name = "김길동";	// null은 데이터를 가리키지 않는 상태
								// 이때, 클래스의 멤버를 참조(.) 하려고 하면 에러 발생
								// 즉, 데이터가 없는데 어떻게 가져오냐? 라는 말
	}
}







































