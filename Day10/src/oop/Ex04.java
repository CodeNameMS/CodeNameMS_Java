package oop;

// ������ �ۼ� ��Ģ
// 1. ������ Ŭ������ �̸��� �����ؾ� �Ѵ�.
// 2. ��ȯ���� �ۼ��ϸ� �ȵȴ�.
// 3. 

class People{
	String name;
	int age;
	double height;
	
	// ������ : �ַ� ��� ���� (= �Ӽ�)�� �ʱ�ȭ �ϱ� ���ؼ� ���Ǵ� �޼���
	People(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
		
		// this : 0��° �Ű� ������ ������ �ִ�.
		// �� ��ü�� �����ϱ� ���ؼ� �ִ� �Ű�����
	}
	
	// ����� �޼��� : �����(= ������)�� �ʿ信 ���� ���� �ۼ��� �޼���
	void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + height);
	}
}

public class Ex04 {

	public static void main(String[] args) {
		People p1 = new People("ȫ�浿", 28, 168.8);
		People p2 = new People("��浿", 17, 180.3);
		
		
		p1.showInfo();
		p2.showInfo();
	}

}


































