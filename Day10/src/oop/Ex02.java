package oop;

// Ŭ���� : ��ü�� ���� ���� (ù���ڴ� �빮��)
// ��> �ۼ��� Ŭ������ �ڹ� �ڵ峻���� ���ο� �ڷ������� �����Ѵ�.
class Person{	// �ڵ� ������ ����� ǥ���ϰ� ����
	// 1. �Ӽ� : �ɹ� ������ ǥ��
	String name;
	int age;
	double height;
	
	// 2. ���(= �޼���) : ��� �Լ��� ǥ��
	void sleep() {	// void sleep(Person this)
		System.out.println(name + "(��)�� ���� �ܴ�. Zzz...���..");
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		Person p2 = null;		// null�� �����Ͱ� ����, ��������� �ǹ��Ѵ�.
		
		p1.name = "ȫ�浿";		// ���� ������ ���ؼ�, �ν��Ͻ� ����(= new�� ������ ����)�� �����Ϸ���
		p1.age = 27;			// . (���� ������)�� Ȱ���Ѵ�.
		p1.height = 171.6;
		
		System.out.println("p1�� �̸� : " + p1.name);
		System.out.println("p1�� ���� : " + p1.age);
		System.out.println("p1�� ���� : " + p1.height);
		
		p1.sleep();		//sleep(p1)
		
		// p2�� ���� Person�� ����(= instance)�� ����.
		// p2.name = "��浿";	// null�� �����͸� ����Ű�� �ʴ� ����
								// �̶�, Ŭ������ ����� ����(.) �Ϸ��� �ϸ� ���� �߻�
								// ��, �����Ͱ� ���µ� ��� ��������? ��� ��
	}
}







































