package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// ��Ư�� Ƚ�� �ݺ�
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		while(n != 0) {
			System.out.println("while - ���� �Է�(0 : ����) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		}
		System.out.println();
		
		for(int num=1; num!=0;) {	// ������ ����
			System.out.println("for - ���� �Է�(0 : ����)");
			num = sc.nextInt();
			
			System.out.println("num = " + num + "\n");
		}
		
		sc.close();
	}
}

















