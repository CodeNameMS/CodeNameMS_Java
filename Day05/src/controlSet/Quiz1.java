package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// ���ǹ����� Ǭ��
		
		// 1. ������ �Է� �޾Ƽ� 7�� ����� ���
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		if(n%7==0) {
			System.out.println(n+"(��)�� 7�� ����Դϴ�.");
		}
		else {
			System.out.println(n+"(��)�� 7�� ����� �ƴմϴ�.");
		}
		
		// 2. �� ������ �Է� �޾Ƽ� ū ���� ���
		// ��, ������ '����' ���
		
		int su1,su2;
		
		System.out.print("�� ���� �Է� : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		if(su1 > su2) {
			System.out.println(su1+"(��)�� �� Ů�ϴ�.");
		}
		else if(su1 == su2) {
			System.out.println("�� ���� �����ϴ�.");
		}
		else {
			System.out.println(su2+"(��)�� �� Ů�ϴ�.");
		}
		// 3. ������ �Է� �޾Ƽ� ���밪�� ���
		int su3;
		
		System.out.print("���� �Է� : ");
		su3 = sc.nextInt();
		
		if(su3<0) {
			su3 = -su3;
		}
		System.out.println("���밪 : "+ su3);
		
		// 4. �� ������ �Է¹޾Ƽ�, �հ谡 ¦���̸� ���
		
		int su4,su5;
		System.out.print("�� ���� �Է� : ");
		su4 = sc.nextInt();
		su5 = sc.nextInt();
		
		if((su4+su5)%2 ==0) {
			System.out.println("�� ���� ���� ¦���Դϴ�.");
		}
		else {
			System.out.println("�� ���� ���� ¦���� �ƴմϴ�.");
		}
		
		// 5. �� ������ �Է¹޾Ƽ�, ���� ū ��(= �ִ밪)�� ���
		
		int a1,a2,a3,result;
		
		System.out.print("�� ���� �Է� : ");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		result = 0;
		
		if(a1 > a2) {
			result = a1;
			if(result < a3) {
				result = a3;
			}
		}
		else {
			result = a2;
			if(result < a3) {
				result = a3;
			}
		}
		System.out.println("���� ū �� : "+result);
		
		sc.close();
	}
}














