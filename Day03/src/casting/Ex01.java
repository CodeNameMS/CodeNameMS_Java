package casting;

// �� ��ȯ(casting) : ������ Ÿ��. ��, �ڷ����� ��ȯ�ϴ� ��
// 1. �ڵ� �� ��ȯ(=������ ����ȯ) : �ַ� ���� �� �߻��ϰ�, �ٸ� ������ ���� ������ �����ϰ� ���ش�.
// 2. ���� �� ��ȯ(=����� ����ȯ) : �����ڰ� ���� �ڷ����� ����ؼ� �����ϴ� ���

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(10 + 20);	// int + int : ���� ����
		
		// �ڵ� ����ȯ�� �Ʒ��� ���� �߻�
		System.out.println(10 + 3.14);		// int + double : ���� ���� �Ұ���
											// ��> �ٸ� Ÿ�� ������ ���� �Ұ���

		System.out.println(10.0 + 3.14);	// double + double = double
											// ��> ���� Ÿ���� ���߱� ���ؼ� �� ���� '�ڵ����� ��ȯ'��
		
		System.out.println("10 = "+ 10);	// String + int -> String + String = String
		System.out.println("10 + 2 = " + 10 + 2 );
		System.out.println("10 + 2 = " + (10 + 2));
	}
}












































