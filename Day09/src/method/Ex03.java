package method;

// �ٽ�
// 1. �������ڿ� �Ű������� ���� �� �ڷ����� ��ġ��Ų��
// 2. �Ű��������� �������ڰ� ������� ä������

public class Ex03 {
	public static void adder(int n1, int n2) {	// �Ű������� 2��
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		System.out.println("n1 + n2 = " + (n1 + n2) + "\n");
	}
	
	public static void main(String[] args) {
		
		adder(5, 3);
		
		adder(10, 7);
		
		// �߸��� ��� ���
		// adder(5);		// �������� ������ ��ġ���� �ʴ´�.
		
		// adder(5, 3.0);	// �������� ������ ������ �ڷ����� ��ġ���� �ʴ´�.
		
		
		
	}
}

























