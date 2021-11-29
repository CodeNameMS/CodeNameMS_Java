package _abstract;

interface Coding {
	// �ʵ�� �ڵ����� public static final �Ӽ��� ���´�.
	String Language = "Java";
	
	// �޼���� �ڵ����� public abstract �Ӽ��� ���´�.
	void programming();
}

abstract class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("�̸� : " + name);
	}
	
	abstract void study();
	
}

class Student extends Person implements Coding {
	int scores;
	
	Student(String name, int scores) {
		super(name);
		this.scores = scores;
	}
	
	@Override
	void study() {
		System.out.println("������ ������ ����");
	}
	
	@Override
	public void programming() {
		System.out.println(Language + "�� �ڵ� ��");
	}
}

class Child extends Person {
	
	Child(String name){
		super(name);
	}
	
	@Override
	void study() {
		System.out.println("���ϱ⸦ �ܿ�� ��");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 70);
		Child c1 = new Child("��浿");
		
		// Person[] p1 = new Person[] { s1, c1 };
		
		s1.showInfo();
		c1.showInfo();
		
		s1.study();
		c1.study();
		System.out.println();
		
		s1.programming();
		// c1.programming();
		// ��> c1�� Coding�� �����ϰ� ���� �ʴ�
		
		// Coding cod = new Coding();
		// ��> �������̽��� ��ü ������ �Ұ���
		
		// �߻� Ŭ���� vs �������̽�
		// 1. �߻�Ŭ���� 
		// - Ŭ������ ����� 'Ȯ��'�� ���ؼ� ���
		// - ��, �� ���� ��� ����
		
		// 2. �������̽�
		// - �������̽��� Ư�� ����� '����'���� '����'�ϱ� ���ؼ� ���
		// - �ַ� ��ü���� Ȯ���� �ƴ϶�, Ư�� �Ӽ��� �߰��ϴ� ����
		// - ���� ���� ���� ��Ӱ���. ��, �׸�ŭ �������̽��� ����� �����ؾ� �Ѵ�.
		
		
		
		
		
	}
}


















