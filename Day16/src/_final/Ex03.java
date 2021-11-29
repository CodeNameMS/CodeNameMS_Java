package _final;

class A {
	
}

final class B extends A {
	
}

// final 클래스는 더 이상의 상속이 불가능 -> 기능 확장이 필요 없을 때 사용
//class C extends B{
//	
//}


// 우리가 자주 쓰는 System 클래스는 final 클래스이다.
//class MySystem extends System{
//	
//}

public class Ex03 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();	// final 클래스는 객체를 못만드는 것이 아님!!!
	}
}
























