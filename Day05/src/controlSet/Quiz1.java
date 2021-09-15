package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 조건문으로 푼다
		
		// 1. 정수를 입력 받아서 7의 배수를 출력
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		if(n%7==0) {
			System.out.println(n+"(은)는 7의 배수입니다.");
		}
		else {
			System.out.println(n+"(은)는 7의 배수가 아닙니다.");
		}
		
		// 2. 두 정수를 입력 받아서 큰 수를 출력
		// 단, 같으면 '같다' 출력
		
		int su1,su2;
		
		System.out.print("두 정수 입력 : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		if(su1 > su2) {
			System.out.println(su1+"(이)가 더 큽니다.");
		}
		else if(su1 == su2) {
			System.out.println("두 수가 같습니다.");
		}
		else {
			System.out.println(su2+"(이)가 더 큽니다.");
		}
		// 3. 정수를 입력 받아서 절대값을 출력
		int su3;
		
		System.out.print("정수 입력 : ");
		su3 = sc.nextInt();
		
		if(su3<0) {
			su3 = -su3;
		}
		System.out.println("절대값 : "+ su3);
		
		// 4. 두 정수를 입력받아서, 합계가 짝수이면 출력
		
		int su4,su5;
		System.out.print("두 정수 입력 : ");
		su4 = sc.nextInt();
		su5 = sc.nextInt();
		
		if((su4+su5)%2 ==0) {
			System.out.println("두 수의 합이 짝수입니다.");
		}
		else {
			System.out.println("두 수의 합이 짝수가 아닙니다.");
		}
		
		// 5. 세 정수를 입력받아서, 제일 큰 수(= 최대값)을 출력
		
		int a1,a2,a3,result;
		
		System.out.print("세 정수 입력 : ");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		result = 0;
		
		if(a1 > a2) {
			result = a1;
			if(result < a3) {
				result = a3;
			}
		}
		else {
			result = a2;
			if(result < a3) {
				result = a3;
			}
		}
		System.out.println("가장 큰 수 : "+result);
		
		sc.close();
	}
}














