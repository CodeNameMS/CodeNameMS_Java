package exception;

// ���� : ���α׷����� �߻��ϴ� ���۵�
// ��> ���� : �ý��� �߻��ϴ� ����, �����ڰ� ó�� �Ұ���
// ��> ���� : �����ڳ�, ������� �Է� � ���ؼ� �߻��ϴ� ����. �̸� �����ؼ� ó������

// ���� ó�� : ���ܸ� Ž���ؼ� ó���ϴ� ����
// ex) 0���� ������

public class Ex01 {
	public static void main(String[] args) {
		try {	// try : ���ܸ� Ž���ϴ� ����. �߻��ϴ� ���ܴ� ��ġ�ϴ� catch�������� �̵�
			System.out.println("10 / 0 = " + 10 / 0);
		}
		catch(ArithmeticException e){
			// catch : �߻��ϴ� ���ܸ� ó���ϴ� ����
			
			System.err.println("0���� ���� �� �����ϴ�.");
			// err : ǥ�� ������±���
			System.err.println("���� �޽��� : " + e.getMessage());
			
			e.printStackTrace();
			
		}
		
		System.out.println("\n���ܰ� �߻��ϸ�, java�� �⺻������");
		System.out.println("JVM�� �˾Ƽ� ó���Ѵ�");
	}
}




























