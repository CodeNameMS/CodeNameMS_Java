package operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// if ~ else ���ǹ��� �ƴ�, ���� �����ڷ� Ǳ�ϴ�.
		
		// 1. ������ �ϳ� �Է¹޾Ƽ� 4�� ������� �Ǻ�
		Scanner su = new Scanner(System.in);
		int n;
		String result;
		
		System.out.print("4�� ��� �Ǻ� : ");
		n = su.nextInt();
		
		
		result = (n % 4 == 0) ? "4�� ���" : "4�� ��� �ƴ�";
		
		System.out.println(n+"(��)��"+result);
		
		// 2. ������ �ϳ� �Է¹޾Ƽ�, 2�� 3�� ��������� �Ǻ�
		
		Scanner su2 = new Scanner(System.in);
		int n2;
		String result2;
		
		System.out.print("2�� 3�� ��������� �Ǻ� : ");
		n2 = su2.nextInt();
		
		result2 = (n2%6 == 0) ? "2�� 3�� �����" : "2�� 3�� ����� �ƴ�";
		
		System.out.println(n2+"(��)��"+result2);
		
		
		
		
		// 3. �� ������ �Է� �޾Ƽ�, ū ���� ���
		// ��, ���� ������, �ƹ��ų� ����ص� �ȴ�.
		
		Scanner su3 = new Scanner(System.in);
		Scanner su4 = new Scanner(System.in);
		int n3,n4;
		String result3;
		
		System.out.print("ù ��° ���� �Է� : ");
		n3 = su3.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		n4 = su4.nextInt();
		
		result3 = (n3 > n4) ? n3+"(��)�� ��Ů�ϴ�" : n4+"(��)�� �� Ů�ϴ�";
		
		System.out.println(n3+"(��)�� "+n4+" �� "+result3);
		
		
		
		
		// 4. ������ �Է� �޾Ƽ�, ���밪�� ���
		
		Scanner su5 = new Scanner(System.in);
		int n5;
		String result5;
		
		System.out.print("�� �Է� : ");
		n5 = su5.nextInt();
		result = (n5 > 0) ? "���밪 : "+ n5 : "���밪 : " + -n5;  
		System.out.println(result);
		
		su.close();
		su2.close();
		su3.close();
		su4.close();
		su5.close();
	}
}











