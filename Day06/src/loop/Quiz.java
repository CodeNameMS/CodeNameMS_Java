package loop;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1번
		for(int i=1; i<=9; i++) {
			System.out.printf("2 X %d = %d\n", i, 2*i);
		}
		
		// 2번 구구단 수를 입력 받아서 출력
		Scanner sc = new Scanner(System.in);
		int su;
		System.out.print("2. 구구단 수 입력 : ");
		su = sc.nextInt();
		
		for (int j=1; j<=su; j++) {
			System.out.printf("%d X %d = %d \n", su, j, su*j);
		}
		
		// 3번. 입력받은 구구단을 X9 ~ X1 순으로 역으로 출력
		System.out.println("3. 입력받은 구구단 역순 출력");
		
		for (int j=9; j>=1; j--) {
			System.out.printf("%d X %d = %d \n", su, j, su*j);
		}
	}
}


















