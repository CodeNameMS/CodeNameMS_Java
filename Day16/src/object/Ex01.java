package object;

// Object Ŭ���� : �ڹ��� �ֻ��� Ŭ����
// - �ڹٿ��� �ۼ��� Ŭ������ ��� object�� �ڵ����� ��ӹް� �Ǿ��ִ�.

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ", " + age + "��";
	}
	// toString()�� �������̵��ϸ� ���������� ���ϴ� �������� ��µǰ� �ٲ� �� �ִ�.
	
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22);
		
		System.out.println("p1 = " + p1);	// ���������� �ٷ� ȣ���ϰ� �Ǹ�
											// ��Ű����.Ŭ������@�ؽ��ڵ�
		
		System.out.println("p1 = " + p1.toString());
		// �ڹ��� ���������� ȣ��Ǹ�, ObjectŬ�����κ��� ��ӹ��� toString() �޼��尡 ȣ��ǰ� �Ǿ��ִ�.
		
		
	}
}

























