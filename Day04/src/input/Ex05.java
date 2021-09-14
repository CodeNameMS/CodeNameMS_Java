package input;

import java.util.Scanner;

// 버퍼(buffer) : 데이터를 모아서 전달하는 임시 공간
// 버퍼에서 데이터를 구분하는 구분자는 공백(space)와 엔터(enter, \n)이 된다.

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		sc.nextLine(); // 버퍼에서 엔터 전까지 모두 가져오는 함수
		
		int n3, n4;
		
		System.out.print("다시 두 정수 입력 : ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.println("n3 = " + n3 + ", n4 = " + n4);
		
		sc.close();

	}

}























