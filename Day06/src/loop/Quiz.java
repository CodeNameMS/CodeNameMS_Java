package loop;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1��
		for(int i=1; i<=9; i++) {
			System.out.printf("2 X %d = %d\n", i, 2*i);
		}
		
		// 2�� ������ ���� �Է� �޾Ƽ� ���
		Scanner sc = new Scanner(System.in);
		int su;
		System.out.print("2. ������ �� �Է� : ");
		su = sc.nextInt();
		
		for (int j=1; j<=su; j++) {
			System.out.printf("%d X %d = %d \n", su, j, su*j);
		}
		
		// 3��. �Է¹��� �������� X9 ~ X1 ������ ������ ���
		System.out.println("3. �Է¹��� ������ ���� ���");
		
		for (int j=9; j>=1; j--) {
			System.out.printf("%d X %d = %d \n", su, j, su*j);
		}
	}
}


















