package other;

// 접근 제어 지시자
// 1. private	: 내부
// 2. default	: 내부 + 패키지
// 3. protected : 내부 + 패키지 + 자식
// 4. public	: 내부 + 패키지 + 자식 + 외부


public class Person {
	private String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.printf("%s %d세\n", name, age);
	}
	
	public void eat(String food) {
		System.out.printf("%s(이)가 %s를 먹는다. 냠냠", name, food);
	}
	
	public String getName() {
		return name;
	}
}


















