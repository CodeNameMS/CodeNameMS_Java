package method;

// method overloading : �޼��� �����ε�
// - �޼��带 ���� �̸����� ������ �ۼ��ϴ� ���
// - �̸��� �ϳ�������, ����� �������� �ȴ�. ��, �� �޼��尡 ���� �����ϰ� ��(=����, ����ȭ)

// �����ε� ��Ģ)
// 1. �޼����� �̸��� ��Ȯ�� ��ġ�ؾ� �Ѵ�.
// 2. �Ű������� ���°� �޶���Ѵ�. ex) ������ �ٸ�����, �ڷ����� �޶���Ѵ�.
// 3. ����. ��ȯ���� �����ε��� �������� �ʴ´�.(������ ���� ���Ѵ�)

public class Ex02 {
	public static int adder() {
		return 10 + 20;
	}
	public static int adder(int n) {
		return 10 + n;
	}
	
	public static double adder(double n) {		// ��ȯ���� �����ε��� ���� x
		return 10.5 + n;						// �ڷ����� �޶� ����
	}
	
	public static int adder(int n1, int n2) {	// �Ű������� ������ �ٸ��� ����
		return n1 + n2;							
	}
	
	public static void main(String[] args) {
		
		System.out.println("adder() = " + adder());
		System.out.println("adder(5) = " + adder(5));
		System.out.println("adder(3.1) = " + adder(3.1));
		
		System.out.println("adder(3, 6) = " + adder(3, 6));
	}
}































