package _static;

import java.util.Scanner;
import other.Func;

public class Quiz1 {

	public static void main(String[] args) {
		// other��� ��Ű���� Func��� Ŭ������ �ۼ��ؼ� ������ Ǭ��.
		
		// 1. �� ������ �Է� �޾Ƽ� ū ���� ��ȯ
		// ��, ���� ���� �ƹ��ų� ��ȯ
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		
		
		System.out.println("1. �� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("ū �� : " + Func.compare(n1, n2));
		
		// 2. 2. 1 ~ n������ �հ踦 ��ȯ�ϴ� �޼���
		int n;
		
		System.out.println("2. ���� �Է� : ");
		n = sc.nextInt();
		
		System.out.printf("1 ~ %d������ �� : %d\n", n, Func.total(n));
		
		
		// 3. �Ҽ��� �Ǻ��ϴ� �޼���(��ȯ���� boolean)
		if (Func.isPrime(n)) {
			System.out.println(n + "(��)�� �Ҽ�");
		}
		else {
			System.out.println(n + "(��)�� �Ҽ� �ƴ�");
		}
		
		
		// 4. �迭�� �Ϸķ� ����ϴ� �޼���
		int[] arr = new int[] {10,20,30,40,50};
		
		Func.printArr(arr);
		// 5. �Ųٷ� ���� ��ȯ�ϴ� �޼���
		int rev = Func.reverse(1234);
		
		System.out.println("rev = "  + rev);
		sc.close();

	}

}






















