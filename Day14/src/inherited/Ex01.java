package inherited;

// 상속 : 이미 작성되어 있는 클래스의 내용을 그대로 물려받아서 새로운 클래스를 작성하는 것
// - 기존 클래스의 기능을 물려 받고, 기능을 '확장' 시키기 위한 기법

// 상속을 해주는 클래스 	: 상위, 부모, 슈퍼, 기반 클래스
// 상속을 받는 클래스		: 하위, 자식, 서브, 파생 클래스

class Super{
	int a = 10;
	
	void supFunc() {
		System.out.println("부모 클래스 메서드");
	}
}

class Sub extends Super{	// 하위 클래스 extends 부모 클래스
	int b = 20;
	
	void subFunc() {
		System.out.println("자식 클래스 메서드");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Super sup = new Super();
		sup.supFunc();
		
		//sup.subFunc();
		//ㄴ> 부모는 자식의 멤버를 참조할 수 없다.(= 불효자)
		
		Sub sub = new Sub();
		
		System.out.println("\na = " + sub.a);
		sub.supFunc();
		// ㄴ> 자식은 부모에게 물려 받았기 때문에 부모의 멤버 참조 가능
		
		
		System.out.println("b = " + sub.b);
		sub.subFunc();
		
	}
}
























