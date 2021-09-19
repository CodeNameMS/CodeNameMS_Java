package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 1. ������ �Է� �޾Ƽ� 1 ~ �Է¹��� ������ ���
		// ex) �Է� : 5 -> ��� : 1 2 3 4 5
		Scanner sc = new Scanner(System.in);
		int su1;
		
		System.out.print("1. ���� �Է� : ");
		su1 = sc.nextInt();
		
		for(int i=1; i<=su1; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 2. ������ �Է� �޾Ƽ� 1 ~ �Է¹��� �� ������ ���� ���
		// ex) �Է� : 5 -> ��� 15
		System.out.print("2. ���� �Է� : ");
		su1 = sc.nextInt();
		int sum=0;
		
		for(int j=0; j<=su1; j++) {
			sum += j;
		}
		System.out.print("��� : " + sum);
		System.out.println();
		
		
		// 3. 0�� �Է¹��������� �Է��� �ް�, �Է¹޾Ҵ� ���� ���� ���
		// ex) �Է� : 1
		// ex) �Է� : 5
		// ex) �Է� : 0 -> ��� : 6
		System.out.print("3. ���� �Է�(0�̸� ����) : ");
		sum = 0;
		
		for(;;) {
			su1 = sc.nextInt();
			sum += su1;
			System.out.println("�Է°� : " + su1);
			
			if (su1 == 0) break;
		}
		System.out.print("��� : " + sum);
		System.out.println();
		
		// 4. ������ �Է� �޾Ƽ�, �Ųٷ� ���� ����Ѵ�.
		// ex) �Է� : 1234 -> ��� : 4321
		
		System.out.print("���� �Է� : ");
		su1 = sc.nextInt();
		
		int result = 0;
		
		while(su1 != 0) {
			result = result * 10 + su1%10;
			su1 /= 10;
		}
		System.out.println("��� : " + result);
	}
}






























