package inherited;

// ��� ���迡���� �������� ȣ�� ������ �߿��ϴ�
// - �ڽ� Ŭ������ ������ ������ �� ���� �θ��� �������� �����Ѵ�.
// - ��, �ڽ�Ŭ������ �θ��� �����ڸ� ȣ���Ѵ�!!!

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println("�θ� ������ ȣ��");
	}
	
	void showInfo() {
		System.out.printf("%s (%d��)\n", name, age);
	}
}

// ex �� �����̽��� -> �ڵ��ϼ� extends
class Student extends Person{
	int score;
	
	// �ڽ�Ŭ������ �����ڴ� �⺻������ �θ��� �⺻�����ڸ� ȣ���ϰ� �� �ۼ��Ǿ� �ִ�.
	// ����, super()��� Ű���带 ���ؼ� �θ��� �����ڸ� ��������� ����� ȣ�� ����
	Student(String name, int age, int score){
		super(name, age);	// Person(String, int)�� ȣ���ϴ� ��
		this.score = score;
		
		System.out.println("�ڽ� ������ ȣ��");
	}
	
	// �޼��� �������̵� : �θ��� �޼��鸦 �������ϴ� ��.
	void showInfo() {
		System.out.printf("%s (%d��, %d��)\n", name, age, score);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22);
		System.out.println();
		
		Student s1 = new Student("��浿", 17, 90);
		
		p1.showInfo();
		s1.showInfo();
		
	}
}




































