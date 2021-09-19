package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 불특정 횟수 반복
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		while(n != 0) {
			System.out.println("while - 정수 입력(0 : 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		}
		System.out.println();
		
		for(int num=1; num!=0;) {	// 증감식 생략
			System.out.println("for - 정수 입력(0 : 종료)");
			num = sc.nextInt();
			
			System.out.println("num = " + num + "\n");
		}
		
		sc.close();
	}
}

















