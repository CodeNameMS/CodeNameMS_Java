package accessModifier;

// other 패키지의 People과 비교해서 본다.
import other.People;

class Person{
	// 주로 필드는 거의 private로 설정한다. -> 외부에서 직접 접근하는 경우가 많이 없고 할 필요도 없기 때문
	private String name;
	private int age;
	private double height;
	
	Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	// 메서드는 거의 클래스의 지시자를 따라간다.
	void showInfo() {
		System.out.printf("%s (%d세, %.1fcm)\n", name, age, height);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22, 176.6);
		
		
		// private는 오로지 클래스 내부에서만 접근 가능 
		// System.out.println("p1의 이름 : " + p1.name);
		
		// 즉, 메서드를 이용하면 간접적으로 접근 가능
		p1.showInfo();
		
		People p2 = new People("홍길동", 22, 176.6);
		
		p2.showInfo();
		
	}
}














