package _static;

import java.util.Scanner;
import other.Func;

public class Quiz1 {

	public static void main(String[] args) {
		// other라는 패키지에 Func라는 클래스를 작성해서 문제를 푼다.
		
		// 1. 두 정수를 입력 받아서 큰 수를 반환
		// 단, 같은 경우는 아무거나 반환
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		
		
		System.out.println("1. 두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("큰 수 : " + Func.compare(n1, n2));
		
		// 2. 2. 1 ~ n까지의 합계를 반환하는 메서드
		int n;
		
		System.out.println("2. 정수 입력 : ");
		n = sc.nextInt();
		
		System.out.printf("1 ~ %d까지의 합 : %d\n", n, Func.total(n));
		
		
		// 3. 소수를 판별하는 메서드(반환형은 boolean)
		if (Func.isPrime(n)) {
			System.out.println(n + "(은)는 소수");
		}
		else {
			System.out.println(n + "(은)는 소수 아님");
		}
		
		
		// 4. 배열을 일렬로 출력하는 메서드
		int[] arr = new int[] {10,20,30,40,50};
		
		Func.printArr(arr);
		// 5. 거꾸로 수를 반환하는 메서드
		int rev = Func.reverse(1234);
		
		System.out.println("rev = "  + rev);
		sc.close();

	}

}






















