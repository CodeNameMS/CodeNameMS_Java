package inherited;

// �� �����ε� vs �������̵�
// 1. �����ε�		: ���� �̸��� �޼����� �Ű������� �ٸ����ؼ� ������ �����ϴ� ��.
// 2. �������̵�	: �θ� Ŭ�������� �������� �޼��带 ������ �ϴ� ��.

class Police extends Person{
	String rank;
	
	Police(String name, int age, String rank){
		super(name,age);
		this.rank = rank;
	}
	
	void showInfo() {
		System.out.printf("%s (%d��, %s)\n", name, age, rank);
	}
}

class Doctor extends Person {
	String major;
	
	Doctor(String name, int age, String major){
		super(name,age);
		this.major = major;
	}
	
	
	void showInfo() {
		System.out.printf("%s (%d��, %s)\n", name, age, major);
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		// Ex02�� Person�� ��ӹ޾Ƽ� �Ʒ��ڵ尡 ����ǰ� �϶�
		Police p1 = new Police("ȫ�浿", 27, "����");
		Doctor d1 = new Doctor("��浿", 33, "����");
		
		p1.showInfo();		// ȫ�浿(27��, ����)
		d1.showInfo();		// ��浿(33��, ����)
	}
}























