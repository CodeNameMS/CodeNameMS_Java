package _final;

// �޼����� final : �������̵� �Ұ���

class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name;
	}
	
	final void eat(String food) {
		System.out.println(name + "(��)�� "+ food +"(��)�� �Դ´�");
	}
}

class Student extends Person {
	private int scores;
	
	Student(String name, int scores){
		super(name);
		this.scores = scores;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", " + scores + "��";
	}
	
	// final �޼���� �ڽĿ��� �������̵��� �Ұ���. ��, �Ϲ� �޼���ó�� ������ �Ȱ��� �ȴ�.
//	@Override
//	void eat(String food) {
//		System.out.println("�谡 �Ȱ��ļ� ���ϸ� �Ÿ���.");
//	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		
		System.out.println("p1 = " + p1);
		p1.eat("���");
		
		Student s1 = new Student("��浿", 90);
		
		System.out.println("\ns1 = " + s1);
		s1.eat("ī��");
	}
}
















