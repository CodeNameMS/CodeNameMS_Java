package inherited2;

import other.Person;

class Student extends Person {
	int scores;
	
	Student(String name, int age, int scores){
		super(name, age);
		this.scores = scores;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("%s (%d세, %d점)\n", getName(), age, scores);
		
		// ※ private 멤버는 상속은 받았지만, 자식에서는 접근할 수 없다.
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22);
		Student s1 = new Student("김길동", 15, 80);
		
		p1.showInfo();
		p1.eat("라면");
		System.out.println();
		
		s1.showInfo();
		s1.eat("치킨");
	}
}



















