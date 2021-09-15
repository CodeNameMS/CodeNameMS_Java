package operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// if ~ else 조건문이 아닌, 조건 연산자로 풉니다.
		
		// 1. 정수를 하나 입력받아서 4의 배수인지 판별
		Scanner su = new Scanner(System.in);
		int n;
		String result;
		
		System.out.print("4의 배수 판별 : ");
		n = su.nextInt();
		
		
		result = (n % 4 == 0) ? "4의 배수" : "4의 배수 아님";
		
		System.out.println(n+"(은)는"+result);
		
		// 2. 정수를 하나 입력받아서, 2와 3의 공배수인지 판별
		
		Scanner su2 = new Scanner(System.in);
		int n2;
		String result2;
		
		System.out.print("2와 3의 공배수인지 판별 : ");
		n2 = su2.nextInt();
		
		result2 = (n2%6 == 0) ? "2와 3의 공배수" : "2와 3의 공배수 아님";
		
		System.out.println(n2+"(은)는"+result2);
		
		
		
		
		// 3. 두 정수를 입력 받아서, 큰 수를 출력
		// 단, 수가 같으면, 아무거나 출력해도 된다.
		
		Scanner su3 = new Scanner(System.in);
		Scanner su4 = new Scanner(System.in);
		int n3,n4;
		String result3;
		
		System.out.print("첫 번째 정수 입력 : ");
		n3 = su3.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		n4 = su4.nextInt();
		
		result3 = (n3 > n4) ? n3+"(이)가 더큽니다" : n4+"(이)가 더 큽니다";
		
		System.out.println(n3+"(와)과 "+n4+" 중 "+result3);
		
		
		
		
		// 4. 정수를 입력 받아서, 절대값을 출력
		
		Scanner su5 = new Scanner(System.in);
		int n5;
		String result5;
		
		System.out.print("수 입력 : ");
		n5 = su5.nextInt();
		result = (n5 > 0) ? "절대값 : "+ n5 : "절대값 : " + -n5;  
		System.out.println(result);
		
		su.close();
		su2.close();
		su3.close();
		su4.close();
		su5.close();
	}
}











