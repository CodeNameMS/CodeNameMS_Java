package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ��ø ���ǹ� : ������ ���������� �Ǻ��� �� ���
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n + "(��)�� ¦���Դϴ�.");
			
			if(n%3 == 0) {
				System.out.println(n + "(��)�� ¦���̸� 3�� ����Դϴ�.");
			}
			else {
				System.out.println(n + "(��)�� ¦�������� 3�� ����� �ƴ�");
			}
		}
		else {
			System.out.println(n + "(��)�� Ȧ���Դϴ�.");
			
			if (n%3 == 0) {
				System.out.println(n + "(��)�� Ȧ���̸� 3�� ���");
			}
			else {
				System.out.println(n + "(��)�� Ȧ�������� 3�� ����� �ƴ�");
			}
		}
		
		sc.close();
	}
}




















