package controlSet;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// else if : 위의 조건이 거짓이면 검사하는 구문
		// ㄴ> 다중 조건문을 구성시 사용
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("성인");
		}
		else if(age >= 17) {	// '위의 조건이 거짓'이면 조건을 검사	
			System.out.print("고등학생");
		}
		else if(age >= 14) {
			System.out.print("중학생");
		}						// else는 좀 더 정확하게 정의하면
		else {					// 모든 조건이 거짓이면 실행하는 구문
			System.out.print("초등학생 이하");
		}
		
		System.out.println("입니다");
		sc.close();
	}
}





































