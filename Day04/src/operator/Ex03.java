package operator;

import java.util.Scanner;

// ���� : ���� -> a++
// ���� : ���, ����, ��, �� -> a + b
// ���� : ����


public class Ex03 {

	public static void main(String[] args) {
		// ���� ������ : ���ǿ� ���� ���� '����'�ϴ� ������
		// ����)
		// ���ǽ� ? �� : ����
		
		Scanner sc = new Scanner(System.in);
		String result;
		int n;
		
		System.out.print("3�� ��� �Ǻ� : ");
		n = sc.nextInt();
		
		result = (n %2 == 0 ) ? "3�� ��� " : "3�� ��� �ƴ�";
		
		System.out.println(n + "(��)��" + result);
		
		sc.close();
		
	}

}


















