package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
		} catch(InputMismatchException e) {
			System.err.println("정수가 아닌 값을 입력 !!");
			return;
		} finally {
			// 예외 발생 여부에 상관없이 무조건 실행되는 구문 !!!
			// 주로, 할당받은 자원을 반납을 해야하는 경우 많이 쓰게됨
			System.out.println("실행 여부 - 1");
			sc.close();
		}
		
		System.out.println("실행 여부 - 2");
		
	}
}































