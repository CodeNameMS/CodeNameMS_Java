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
		System.out.printf("%s (%d��, %d��)\n", getName(), age, scores);
		
		// �� private ����� ����� �޾�����, �ڽĿ����� ������ �� ����.
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22);
		Student s1 = new Student("��浿", 15, 80);
		
		p1.showInfo();
		p1.eat("���");
		System.out.println();
		
		s1.showInfo();
		s1.eat("ġŲ");
	}
}



















