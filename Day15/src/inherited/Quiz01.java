package inherited;

class Airplain {
	Person[] member = new Person[5];	// ����� �¼�
	int tmp = 0;
	
	void takeOn(Person target) {
		for (int i=0; i< member.length; i++) {
			if(member[i] == null) {		// �迭�� �����Ͱ� ������ == �¼��� �������
				member[i] = target;
				
				System.out.println(target.getName() + "���� ž��");
				return;
			}
		}
		System.out.println("���� �¼��� �����ϴ� !");
	}
	
	void list() {
		for (int i=0; i<member.length; i++) {
			if(member[i] != null) {
				member[i].showInfo();
			}
			else {
				System.out.println("======== ���¼� ========");
			}
		}
	}
	
	void emergency(Person target) {
		for (int i=0; i<member.length; i++) {
			if(member[i] instanceof Doctor) {	// ����߿� �ǻ簡 ������
				System.out.println("�ǻ縦 ã�ҽ��ϴ� !");
				Doctor C = (Doctor)member[i];
				C.cure(target);
				return;
			}
		}
		System.out.println("�⳻�� �ǻ簡 �����ϴ� !!!");
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Person per = new Person("ȫ�浿", 30);
		Student stu = new Student("��浿", 15, 78);
		Police pol = new Police("�̱浿", 40, "�氨");
		Doctor doc = new Doctor("�ڱ浿", 37, "����");
		
		Airplain air = new Airplain();
		
		air.takeOn(per);	// ����⿡ '���'�� Ż �� �ִ� �޼���
		air.takeOn(stu);
		air.takeOn(pol);
		air.takeOn(doc);
		System.out.println();
		
		air.list();			// �°��� ����� ���
		System.out.println();
		
		air.emergency(stu);	// �°� �߿��� �ǻ縦 ã�Ƽ�, ���޵� '���'�� ġ���ϵ���, cure()�� ȣ��
							// ��, �ǻ簡 ������ ���ٰ� ���
		
	}
}



























