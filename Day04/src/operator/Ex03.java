package operator;

import java.util.Scanner;

// 일항 : 증감 -> a++
// 이항 : 산술, 대입, 비교, 논리 -> a + b
// 삼항 : 조건


public class Ex03 {

	public static void main(String[] args) {
		// 조건 연산자 : 조건에 따라서 값을 '선택'하는 연산자
		// 형태)
		// 조건식 ? 참 : 거짓
		
		Scanner sc = new Scanner(System.in);
		String result;
		int n;
		
		System.out.print("3의 배수 판별 : ");
		n = sc.nextInt();
		
		result = (n %2 == 0 ) ? "3의 배수 " : "3의 배수 아님";
		
		System.out.println(n + "(은)는" + result);
		
		sc.close();
		
	}

}


















