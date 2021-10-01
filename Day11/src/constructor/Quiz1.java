package constructor;

class People{
	String name;
	int age;
	double height;
	
	People(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	People(String name){
		this.name = name;
	}
	
	People(){
		this.name = "����";
	}
	
	
	void showInfo() {
		System.out.printf("%s (%d��, %.1f)\n", name, age, height);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// �Ʒ� �ڵ���� ��� �����ϰ� Ŭ������ ����
		People p1 = new People("ȫ�浿", 15, 167.8);
		People p2 = new People("��浿", 31);
		People p3 = new People("�̱浿");
		People p4 = new People();
		
		p1.showInfo();		// ȫ�浿(15��, 167.8)
		p2.showInfo();		// ��浿(31.�� 0.0)
		p3.showInfo();		// �̱浿(0��, 0.0)
		p4.showInfo();		// ����(0��,0.0)
		
	}
}


















