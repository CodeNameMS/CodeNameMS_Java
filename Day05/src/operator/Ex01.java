package operator;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// ���� ������ : ������ ���Ͽ� ���� �����ϴ� ������
		// ����)
		// ���ǽ� ? �� : ����
		
		Scanner sc = new Scanner(System.in);
		int n;
		String result;
		
		System.out.print("3�� ��� �Ǻ� : ");
		n = sc.nextInt();
		
		result = (n % 3 == 0) ? "3�� ���" : "3�� ��� �ƴ�";
		
		System.out.println(n + "(��)��" + result);
	}

}























