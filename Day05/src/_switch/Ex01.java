package _switch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 선택문 : 조건이 아니라, 값에 따라서 코드를 분기
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.print("메뉴(1 ~ 3) : ");
		menu = sc.nextInt();
		
		switch(menu) {		// switch(값) { case... }
							// 값으로 가능한 자료형 : 정수와 문자열
		case 1:
			System.out.println("1번 선택");
			break;
		case 2:
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");
			break;			// break : 제어문을 즉시 탈출하는 구문
		default :			// default : 없는 case는 모두 여기서 처리됨
			System.out.println("없는 메뉴입니다.");
		}
		sc.close();
	}
}


























