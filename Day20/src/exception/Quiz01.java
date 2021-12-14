package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 정수를 입력 받아서 입력 받은 정수를 출력
		// 단, 정수가 아닌 값을 입력했을때, 다시 입력받도록 해보세요
		
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			try {
				System.out.print("정수 입력 : ");
				n = sc.nextInt();
				
				System.out.println("n = " + n);
				
				break;
				
			} catch(InputMismatchException e) {
				System.err.println("\n정수를 입력해주세요");
				sc.nextLine();	// 버퍼를 비우지 않으면 무한 반복되므로 주의
			}
		}
		sc.close();
	}
}























