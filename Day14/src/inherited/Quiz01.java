package inherited;

// ※ 오버로딩 vs 오버라이딩
// 1. 오버로딩		: 같은 이름의 메서드의 매개변수를 다르게해서 여러개 구성하는 것.
// 2. 오버라이딩	: 부모 클래스에게 물려받은 메서드를 재정의 하는 것.

class Police extends Person{
	String rank;
	
	Police(String name, int age, String rank){
		super(name,age);
		this.rank = rank;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세, %s)\n", name, age, rank);
	}
}

class Doctor extends Person {
	String major;
	
	Doctor(String name, int age, String major){
		super(name,age);
		this.major = major;
	}
	
	
	void showInfo() {
		System.out.printf("%s (%d세, %s)\n", name, age, major);
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		// Ex02의 Person을 상속받아서 아래코드가 실행되게 하라
		Police p1 = new Police("홍길동", 27, "순경");
		Doctor d1 = new Doctor("김길동", 33, "내과");
		
		p1.showInfo();		// 홍길동(27세, 순경)
		d1.showInfo();		// 김길동(33세, 내과)
	}
}























