package loop2;

public class Ex02 {
	public static void main(String[] args) {
		
		// ��ø �ݺ��� Ȱ���ؼ� ������ 2�� ~ 9�� ���
		// ��, �� ���� x1 ~ x9������ ���
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
	}
}

















