package loop2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 정수를 입력 받아서 N x N 별찍기를 출력
		// ex) 입력 : 5
		// *****
		// *****
		// *****
		// *****
		// *****
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("1. 입력 : ");
		n1 = sc.nextInt();
		for (int i=0;i<n1;i++) {
			for (int j=0;j<n1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 2. 직각 삼각형
		
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println("2. 직각삼각형");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 3. 2번 위아래 반전
		System.out.println("3. 2번 위아래반전");
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 4. 2번 좌우 반전
		System.out.println("4. 2번 좌우반전");
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 5. 4번을 위아래 반전
		System.out.println("5. 4번을 위아래 반전");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		// 6. 피라미드 출력
		System.out.println("6. 피라미드");
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		sc.close();
	}

}



















