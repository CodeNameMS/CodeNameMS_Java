package operator;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 조건 연산자 : 조건을 비교하여 값을 선택하는 연산자
		// 형태)
		// 조건식 ? 참 : 거짓
		
		Scanner sc = new Scanner(System.in);
		int n;
		String result;
		
		System.out.print("3의 배수 판별 : ");
		n = sc.nextInt();
		
		result = (n % 3 == 0) ? "3의 배수" : "3의 배수 아님";
		
		System.out.println(n + "(은)는" + result);
	}

}























