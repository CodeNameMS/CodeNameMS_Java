package method;

public class Ex02 {
	// �Ű�����(= parameter) : �Լ� ȣ�� �� ���޹��� ���� �����ϴ� ����
	public static void hello(int n) {
		for (int i=1; i<=5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(3);	// ��������(= arguments) : �Լ� ȣ�� �� �Լ����� �����ϴ� ��
		
		hello(1);
		
		hello(7);
		
		// �������ڿ� �Ű����� �ۼ� ��
		// 1. �������ڿ� �Ű������� ���� �� �ڷ����� ��ġ ��Ų�� !!!
		// 2. �Ű��������� �������ڰ� ������� ä������.
		
		
	}
}




















