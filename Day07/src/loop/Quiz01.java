package loop;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. ������ �Է� �޾Ƽ� ����� ���
		// �����ϸ� �������� ����� �Ѵ�
		// ex) �Է� : 6 -> ��� : 1 2 3 6 (4��)
		Scanner sc = new Scanner(System.in);
		int su1,count=0;
		
		System.out.print("1. ���� �Է� : ");
		su1 = sc.nextInt();
		
		for (int i=1;i<=su1;i++) {
			if(su1%i==0){
				System.out.printf("%d ",i);
				count++;
			}
		}
		System.out.printf("(%d��)\n",count);
		
		// 2. ������ �Է� �޾Ƽ� �Ҽ��� �Ǻ�
		// ex) �Է� : 7 -> ��� : �Ҽ�
		// ex) �Է� : 6 -> ��� : �Ҽ��ƴ�
		
		
		int su2;
		count = 0;
		
		System.out.print("2. ���� �Է� : ");
		su2 = sc.nextInt();
		
		for (int i=1;i<=su2;i++) {
			if(su2%i==0){
				count++;
			}
		}
		if(count==2) {
			System.out.println("�Ҽ�");
		}
		else {
			System.out.println("�Ҽ� �ƴ�");
		}
		
		// 3-1. 1 ~ 1000������ ���� ���
		// 3-2. 1 ~ 1000������ �� �� 3�� ����� �տ��� ����
		// 3-3. 1 ~ 1000������ �� �� 3�� ����� �տ��� �����ϵ�, 3�� 5�� ������� �տ� ����
		
		int sum=0;
		
		System.out.print("3-1. 1~1000���� ���� ��� : ");
		for(int i=0;i<=1000;i++) {
			sum+=i;
			
			// ����� �ڵ�
			// System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		System.out.println(sum);
		
		sum=0;
		System.out.print("3-2. 3�� ����� �տ��� ���� : ");
		for(int i=0;i<=1000;i++) {
			if(i%3==0) continue;
			sum+=i;
			// ����� �ڵ�
			// System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		System.out.println(sum);
		
		sum=0;
		System.out.print("3-3. 3�� ����� �տ��� ����, 3��5�� ������� ���� : ");
		for(int i=0;i<=1000;i++) {
			if(i%3 == 0) {
				if(i%5 != 0) {
					continue;
				}
			}
			sum+=i;
			// ����� �ڵ�
			// System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		System.out.println(sum);
		
		sc.close();
	}
}






















