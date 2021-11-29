package object;

// Object 클래스 : 자바의 최상위 클래스
// - 자바에서 작성한 클래스는 모두 object를 자동으로 상속받게 되어있다.

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ", " + age + "세";
	}
	// toString()을 오버라이딩하면 참조변수를 원하는 형식으로 출력되게 바꿀 수 있다.
	
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22);
		
		System.out.println("p1 = " + p1);	// 참조변수를 바로 호출하게 되면
											// 패키지명.클래스명@해시코드
		
		System.out.println("p1 = " + p1.toString());
		// 자바의 참조변수는 호출되면, Object클래스로부터 상속받은 toString() 메서드가 호출되게 되어있다.
		
		
	}
}

























