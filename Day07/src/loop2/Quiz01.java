package loop2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. ������ �Է� �޾Ƽ� N x N ����⸦ ���
		// ex) �Է� : 5
		// *****
		// *****
		// *****
		// *****
		// *****
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("1. �Է� : ");
		n1 = sc.nextInt();
		for (int i=0;i<n1;i++) {
			for (int j=0;j<n1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 2. ���� �ﰢ��
		
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println("2. �����ﰢ��");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 3. 2�� ���Ʒ� ����
		System.out.println("3. 2�� ���Ʒ�����");
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 4. 2�� �¿� ����
		System.out.println("4. 2�� �¿����");
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 5. 4���� ���Ʒ� ����
		System.out.println("5. 4���� ���Ʒ� ����");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		// 6. �Ƕ�̵� ���
		System.out.println("6. �Ƕ�̵�");
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		sc.close();
	}

}



















