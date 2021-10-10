package _static;

// static : ����

class Person{
	// �Ϲ� ��� : non-static�̶�� �Ѵ�.
	// ��> new �� �ν��Ͻ��� ������ �� ��������� ����� �� �ִ�.
	// ��> new �� �ν��Ͻ��� ������ ������ ������ ������ ����. ��, ��ü���� �ٸ��� ���� ����
	String name;
	int age;
	
	// ���� ��� : static�̶�� �Ѵ�.
	// ��> Ŭ������ �ۼ��� �������� ������� �ִ�. ��, ��ü�� ��� �ִٴ� �ǹ�
	// ��> Ŭ������ ������ �����, �ش� Ŭ������ �ۼ��� ��ü���� '����'�ϴ� ����
	static int eyes;
	
	Person(String name, int age){

		this.name = name;
		this.age = age;

	}
	
	void show() {
		System.out.printf("%s (%d��, %d��)\n", name, age, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("��浿", 15);
		Person p3 = new Person("�̱浿", 30);
		
		Person.eyes = 1;
		
		p1.show();
		p2.show();
		p3.show();
	}
}













