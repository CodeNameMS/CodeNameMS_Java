package inherited;

// 상속 : 기존에 작성된 클래스의 기능을 물려받아서 기능을 확장시키는 방식

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("이름 : " + name + " (" + age + "세)");
	}
	
	void eat(String food) {
		System.out.println(name + "(이)가 " + food + "(을)를 먹는다. 냠냠");
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}

}

class Student extends Person{
	private int scores;
	
	Student(String name, int age, int scores){
		super(name, age);		// 부모님껀 부모님한테~
		
		this.scores = scores;	// 내껀 내가~
	}
	
	@Override
	void showInfo() {
		System.out.printf("이름 : %s (%d세, %d점)\n", getName(), getAge(), scores);
	}
	
	void study(String sub) {
		System.out.printf("%s(이)가 %s(을)를 공부한다\n", getName(), sub);
	}
}
	
public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22);
		
		p1.showInfo();
		p1.eat("불고기");
		// p1.study("Python");		// 부모는 자식의 메서드를 모른다.
		System.out.println();
		
		Student s1 = new Student("김길동", 17, 88);
		
		s1.showInfo();
		s1.eat("짜장면");
		s1.study("Java");
		System.out.println();
		
		// 클래스 간에는 상속관계일때만 형변환(= casting)이 가능하다.
		// 부모 참조변수 : new 자식클래스;
		// - 공간은 자식클래스 공간이지만, 멤버는 부모 멤버 밖에 참조하지 못함.
		// - 이를, up-casting(= 업캐스팅)이라고 한다.
		Person s2 = new Student("이길동", 19, 70);
		
		s2.showInfo();			// 2. 하지만, 오버라이딩된 메서드는 자식의 형태로 실행되는 특징이 있다.
		s2.eat("볶음밥");
		// s2.study("C++");		// 자식의 메서드 호출 불가능 -> 2번으로
		
		
		// 이렇게, up-casting된 객체를 다시 끄집어 내리는 것을 down-casting이라고 한다.
		// 이때, 강제 형변환이 필요하다.
		Student stu = (Student)s2;
		
		System.out.println("\ndown 후)");
		stu.showInfo();
		stu.study("C언어");		// 다운 캐스팅을 하고나면, 다시 자식클래스의 모든 기능을 사용 가능
		
		
		
		
		
		
		
	}
}























