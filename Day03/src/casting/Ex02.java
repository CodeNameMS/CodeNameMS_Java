package casting;

// ���� �� ��ȯ : �����ڰ� ���� �ڷ����� �ٲٴ� ���

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("10 + 2 = " + (10 + 2));
		System.out.println("10 - 2 = " + (10 - 2));
		System.out.println("10 + 2 = " + 10 * 2);
		System.out.println("10 + 2 = " + 10 / 2);
		System.out.println("10 + 2 = " + 10 % 2);
		
		// ���⼭ �����⸦ ���캸��
		System.out.println("15 / 4 = " + 15/4);
		System.out.println("15 / 4.0  = " + 15 / 4.0 + "\n");
		
		int n1 = 15, n2 = 4;
		System.out.println("n1 = " + n1 + ",n 2 = " + n2);
		
		System.out.println("n1 / n2 = " + n1 / n2 );
		System.out.println("n1 / n2 = " + n1 /(double)n2);
		
		System.out.println("n1 / n2 = " + (double)n1 / n2 + "\n");
		
		System.out.println("����ȯ ��    ) n2 = " + n2);
		System.out.println("����ȯ ���� ) n2 = " + (double)n2);
		System.out.println("����ȯ ��    ) n2 = " + n2);
	}
}