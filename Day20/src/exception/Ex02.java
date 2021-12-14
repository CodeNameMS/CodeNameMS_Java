package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
			
			System.out.println("10 / n = " + 10 / n);
			
		} catch(InputMismatchException e) {
			System.err.println("정수가 아닌 값을 입력했습니다");
			// e.printStackTrace();
			
		} catch(ArithmeticException e) {
			System.err.println("0으로 나누었습니다!!!");
			
		} catch(Exception e) {
			
			// Exception 클래스 : 예외의 최상위 클래스로, 모든 예외가 처리가능
			// 보통 마지막에 작성해서 모르는 예외를 처리하기 위한 용도
			System.out.println("기타 예외 발생 : " + e.getMessage());
		}
		
		
		sc.close();
	}
}













