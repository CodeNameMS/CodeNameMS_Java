package method;

// ��ȯ�� : �Լ��� �ڷ����� �ǹ��ϰ�, �Լ� ������� �ڷ����� ���Ѵ�.
// - ��ȯ���� ���� �Լ� : void
// - ��ȯ���� �ִ� �Լ� : void�� �ƴ� �ڷ����� �ۼ��� �Լ�


public class Ex04 {
	// 1. ��ȯ���� ���� �Լ� : �Լ��� �ڵ常 �����ϰ� ������� ���� �Լ�. ���� �ʿ���� ��������� �ʿ��� �Լ��� ����
	public static void adder(int n1, int n2) {
		System.out.println("�� ���� �� : " + (n1 + n2));
	}
	
	// 2. ��ȯ���� �ִ� �Լ� : �Լ��� ���� �� �ۼ��� �ڷ����� ���� ����� �����ִ� �Լ�
	public static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		adder(10, 4);	// ��ȯ���� ���� �Լ��� �׳� �̸��� ȣ���Ѵ�.
		
		// ��ȯ���� �ִ� �Լ��� ����� �����ش�. ���� ����� ������ �ʿ䰡 �ִ�.
		int result = adder2(4, 7);
	//  int result = 11;
		
		System.out.println("result = " + result);
		
		
		
		// ��ȯ���� �ִ� �Լ��� ���� �� �����ϰų�, Ȥ�� �ٷ� ����ع�����.
		System.out.println("adder2(6, 3) = " + adder2(6, 3));
	//	System.out.println("adder2(6, 3) = " + 9);
		
		result = adder2(adder2(10, 3), adder2(7, 1));
		
		System.out.println("result = " + result);
	}
}





























