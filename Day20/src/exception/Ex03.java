package exception;



public class Ex03 {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 10, 20, 30 };
		
		try {
			System.out.println("arr[0] = " + arr[0]);
			
			System.out.println("arr[3] = " + arr[3]);
		// ��> �� ���� ���ܰ� �߻��Ѵ�.
		// ��> ���� �̸��� Ȯ���ؼ� ����ó���ϰ� 
		// ��> index������ �ʰ��ߴٴ� ������ ����Ѵ�.
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.err.println("index������ �ʰ��߽��ϴ� !!!");
			System.err.println(e.getMessage() + "(��)�� ����");
		}
		
		
	}
}































