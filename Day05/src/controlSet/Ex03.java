package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 조건문 : 조건을 세부적으로 판별할 때 사용
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n + "(은)는 짝수입니다.");
			
			if(n%3 == 0) {
				System.out.println(n + "(은)는 짝수이며 3의 배수입니다.");
			}
			else {
				System.out.println(n + "(은)는 짝수이지만 3의 배수는 아님");
			}
		}
		else {
			System.out.println(n + "(은)는 홀수입니다.");
			
			if (n%3 == 0) {
				System.out.println(n + "(은)는 홀수이며 3의 배수");
			}
			else {
				System.out.println(n + "(은)는 홀수이지만 3의 배수는 아님");
			}
		}
		
		sc.close();
	}
}




















