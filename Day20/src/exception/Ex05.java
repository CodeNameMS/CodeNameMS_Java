package exception;


public class Ex05 {
	// throws : ���ܸ� �����ϴ� ����
	// �ش� �޼��� ������ �߻��� ���ܸ� ���� ó������ �ʰ�, ȣ���� ��ġ�� �����Ѵ�.
	// ��> �������� �������� ó���ϰ� �ϴ� ����
	
	// main �Լ��������� ������ �ع�����, JVM�� ó���ϰ� �Ǿ��ִ�.
	
	public static void main(String[] args) throws InterruptedException {
		// �ڹ��� �޼��� �߿����� ���ܸ� ó������ ������
		// ������� ���ϴ� �޼������ ��Ȥ �ִ�.
		
		for (int i = 10; i>= 1; i--) {
			System.out.println(i + "��");
			
			Thread.sleep(1000);
		}
		
		
	}
}



































