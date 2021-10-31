package inherited;

class Police extends Person {
	String rank;
	
	Police(String name, int age, String rank){
		super(name, age);
		
		this.rank = rank;
	}
	
	@Override
	void showInfo() {
		System.out.printf("�̸� : %s (%d��, %s)\n", getName(),getAge(),rank);
	}
}

class Doctor extends Person {
	String major;
	
	Doctor(String name, int age, String major){
		super(name, age);
		
		this.major = major;
	}
	
	@Override
	void showInfo() {
		System.out.printf("�̸� : %s (%d��, %s)\n", getName(), getAge(), major);
	}
	
	void cure(Person target) {
		System.out.println(target.getName() + "�� ġ�Ḧ �����մϴ�.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person per = new Person("ȫ�浿", 30);
		Student stu = new Student("��浿", 15, 78);
		Police pol = new Police("�̱浿", 40, "�氨");
		Doctor doc = new Doctor("�ڱ浿", 37, "����");
		
		per.showInfo();
		stu.showInfo();
		pol.showInfo();
		doc.showInfo();
		System.out.println();
		
		// �迭�� ��� ��� ��ĳ����  
		// ��, up-casting�� ���� Ŭ������ ��� ó���ϱ� ����
		Person[] member = new Person[] { per, stu, pol , doc };
		
		for (int i=0; i<member.length; i++) {
			System.out.print(i +"��°");
			member[i].showInfo();
		}
		System.out.println();
		
		// member[1].study();
		// - ���� up-casting �Ǿ��ִ� ���� -> �ڽ��� ��� ���� �Ұ���
		
		// member[3]�� ������ cure()�޼��带 ȣ���� ������
		Doctor Doc = (Doctor)member[3];
		
		
		Doc.cure(stu);
		Doc.cure(pol);

		// down-casting ��
		Student Stu = (Student)member[1];
		Stu.study("Java");
		System.out.println();
	
		// ����ȯ�� �ٸ��� �������� ������ ����
		System.out.println(member[3] instanceof Person);
		System.out.println(member[3] instanceof Doctor);
		System.out.println(member[3] instanceof Police);
		// member[3]�� �ǻ� -> ��, ������ ��ȯ �Ұ���
		
		
	}
}
























