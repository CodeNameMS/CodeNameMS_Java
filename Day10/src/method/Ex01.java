package method;

// method : Ư�� ������ �ڵ�(=���)�� �̸����� ����ΰ� ����ϴ� ���

public class Ex01 {
	public static void hello(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i + ": Hello World!!!");
		}
		System.out.println();
	}
	
	public static double circle(double r) {
		return 3.141592 * r * r;
	}
	
	public static void main(String[] args) {
		// ��ȯ���� ���� �޼���(=�Լ�)�� �׳� �̸��� ȣ���ϸ� ��
		hello(5, 10);
		
		hello(2, 4);
		
		// ��ȯ���� �ִ� �޼���� ���� ������ ���⶧����, ���� Ȥ�� �ٷ� ����Ѵ�.
		double result = circle(3);	// ����� ������ ����
		System.out.println("result = " + result);
		
		// ����� �ٷ� ���(=���)
		System.out.println("������ 5�� ������ : " + circle(5));
	}
}





























