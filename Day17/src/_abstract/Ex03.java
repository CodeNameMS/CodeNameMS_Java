package _abstract;

class Programmer extends Person implements Coding {
	
	Programmer(String name) {
		super(name);
	}
	
	@Override
	void study() {
		System.out.println("�������� �����ϴ� ��");
	}
	
	@Override
	public void programming() {
		System.out.println("�� ������ �ϴ� ��");
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 80);
		Child c1 = new Child("��浿");
		Programmer p1 = new Programmer("�̱浿");
		
		// ��̳� �л��� �� �� '���' -> ��ĳ���� ����
		Person[] pers = new Person[] { s1, c1, p1};
		
		// ���� '���'�̳�, �л��� �ڵ� ����, ��̴� �ڵ� �Ұ���
		Coding[] cos = new Coding[] { s1, p1};
		
		cos[0].programming();
		cos[1].programming();
		
	}
}


























