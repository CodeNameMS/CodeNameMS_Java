package method;

// �Լ�(function)	: Ư�� ������ �ڵ带 �̸��� ����ΰ� �����ϰ� ����ϴ� ���
// �޼���(method)	: Ŭ���� �ȿ� �ۼ��� �Լ��� �ǹ�. ��, ��ü���ⰳ���� ������ �Լ�

public class Ex01 {
	public static void hello() {
		
		for (int i=1; i<=5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n = 10;		// ���� : �����͸� �����ϴ� ����
		
		hello();		// �Լ��� ȣ�� : �̹� �ۼ��Ǿ� �ִ� �Լ��� ����
		
		hello();		// �Լ��� ���뼺 : �� �� �ۼ��ص� �Լ��� ������ ȣ�� ����
		
		hello();
	}
}




















