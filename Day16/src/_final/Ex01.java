package _final;

// final : ��������

// 1. ������ ����	: ������ �ʴ� ��� �������� ����
// 2. �޼��忡 ����	: �ڽ�Ŭ�������� �������̵��� �Ұ���
// 3. Ŭ������ ����	: �ش� Ŭ������ �� �̻� ����� �� �� ���� Ŭ������ �ȴ�.

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		final int FN = 10;
		
		System.out.println("n = " + n);
		System.out.println("fn = " + FN + "\n");
		
		n = 20;
		// FN = 20;		// final�� ������ ������ ����� �Ǿ� �� �̻� ���� �Ұ���
		
		System.out.println("n = " + n);
		System.out.println("fn = " + FN + "\n");
		
		// ����, ������ ��ȭ�� �ִ� �����ڴ� ��� ��� �Ұ���
		System.out.println("n + FN = " + (n + FN)+ "\n");		// ��� ������ ���� ������ ���길 �� ��, ��ȭ�� ���� �ʴ´�.
		
		// FN +=2;
		// FN++;
		
		final int f;	// �ʱ�ȭ�� ���� ������
		
		f = 100;		// ���� �ѹ��� ���� ������ ����
		
		// f = 100;		// ���� ä���� ���ĺ��ʹ� �ȵ�
		System.out.println("f = " + f + "\n");
		
		
		// ��ǥ���� ����� = PI
		System.out.println("PI = " + Math.PI);
	}
}

























