package _switch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// switch -> if문으로 전부 구현 가능
		// 하지만 반대는 불가능
		// 왜냐하면, switch문은 단일 값을 처리하는 분기문이기 때문에
		
		Scanner sc = new Scanner(System.in);
		int num;
	
		System.out.println("정수 입력(1 ~ 10) : ");
		num = sc.nextInt();
	
		switch(num) {
		case 2: case 4: case 6: case 8: case 10:
			System.out.println("짝수");
			break;
			
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("홀수");
		}
		
		sc.close();
		
		// 위와 같이 쓰면 어느정도 범위 처리가 가능하기는 하다 -> 불편할 뿐
	}
}















