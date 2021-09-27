package oop;

// 클래스는 같은 패키지 내에서 공유되기 때문에, 똑같은 이름으로 선언할 수 없다.

public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "홍길동"; p1.age = 20; p1.height = 180.5;
		p2.name = "김길동"; p2.age = 30; p2.height = 179.3;
		
		p1.sleep();
		p2.sleep();
	}
}





















