package loop;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 무한 반복 : 말 그대로 끝없이 반복
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("정수 입력(0 : 종료) ");
			n = sc.nextInt();
			
			if (n == 0) {
				break;		// 제어문을 즉시 탈출
			}
			System.out.println("n = " + n + "\n");
		}
		System.out.println();
		
		for(;;) {	// 괄호 안을 모두 생략시 무한 반복
			System.out.print("정수 입ㄹ력(0 : 종료) ");
			n = sc.nextInt();
			
			if(n == 0) {
				break;
			}
			
			System.out.println("n = " + n + "\n");
		}
		
		sc.close();
	}
}
























