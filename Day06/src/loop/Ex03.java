package loop;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ���� �ݺ� : �� �״�� ������ �ݺ�
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("���� �Է�(0 : ����) ");
			n = sc.nextInt();
			
			if (n == 0) {
				break;		// ����� ��� Ż��
			}
			System.out.println("n = " + n + "\n");
		}
		System.out.println();
		
		for(;;) {	// ��ȣ ���� ��� ������ ���� �ݺ�
			System.out.print("���� �Ԥ���(0 : ����) ");
			n = sc.nextInt();
			
			if(n == 0) {
				break;
			}
			
			System.out.println("n = " + n + "\n");
		}
		
		sc.close();
	}
}
























