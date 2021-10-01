package constructor;

// ������ : �޼����� ��������, Ŭ������ ��� ������ �ʱ�ȭ�ϴ� �뵵�� ���� ���ȴ�.
// ��> �����ڴ� �ϳ��� �ۼ����� ������ Java�����Ϸ��� �˾Ƽ� �ϳ� �������ش�.
// ��> �̸�, '�⺻ ������'��� �Ѵ�.

class Person{
	String name;
	int age;
	
	// �⺻�����ڴ� �����ڰ� �ϳ��� ���� ���� �ڵ����� �����Ǵ� �����Ѵ�.
	Person(){}
	
	// �����ڴ��ʿ��ϴٸ� �����ε��� ���ؼ� �������� �ۼ��� �� �ִ�.
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��\n");
	}
}



public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("��浿", 30);
		
		p1.showInfo();
		p2.showInfo();
	}
}






























