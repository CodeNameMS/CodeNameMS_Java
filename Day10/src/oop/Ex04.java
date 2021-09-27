package oop;

// 생성자 작성 규칙
// 1. 무조건 클래스의 이름과 동일해야 한다.
// 2. 반환형을 작성하면 안된다.
// 3. 

class People{
	String name;
	int age;
	double height;
	
	// 생성자 : 주로 멤버 변수 (= 속성)을 초기화 하기 위해서 사용되는 메서드
	People(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
		
		// this : 0번째 매개 변수로 가려져 있다.
		// 각 객체를 구분하기 위해서 있는 매개변수
	}
	
	// 사용자 메서드 : 사용자(= 개발자)가 필요에 따라서 직접 작성한 메서드
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
	}
}

public class Ex04 {

	public static void main(String[] args) {
		People p1 = new People("홍길동", 28, 168.8);
		People p2 = new People("김길동", 17, 180.3);
		
		
		p1.showInfo();
		p2.showInfo();
	}

}


































