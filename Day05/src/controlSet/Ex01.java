package controlSet;

import java.util.Scanner;

// 제어문 : 코드의 흐름을 제어하는 구문
// 1. 조건문 : 조건에 따라서 코드의 흐름을 분기
// 2. 반복문 : 조건에 따라서 코드를 루프
// 3. 보조 제어문 : 위의 두 구문을 보조하는 구문

// 종류
// 1. 조건문 : if ~ / else if ~ / else, switch ~ case
// 2. while, do ~ while, for
// 3. 보조 제어문 : break;, continue, return

public class Ex01 {
	public static void main(String[] args) {
		// 조건문 if : 조건식이 참이면 종속문장 수행, 거짓이면 그냥 다음 구문으로
		// else : if문과 한 쌍이 되며, 위의 조건이 거짓이면 실행하는 구문
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {	// (조건식) { 종속문장 }
			System.out.print("성인 ");
		}
		else {				// else { 종속문장 }
			System.out.print("미성년자");
		}
		
		System.out.println("입니다.");	// 다음 문장
		sc.close();
	}
}

























