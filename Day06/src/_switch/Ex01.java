package _switch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 선택문 : 값에 따라서 코드를 분기
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.print("메뉴 입력(1 ~ 3) ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1번 메뉴 선택");
			break;
		case 2:
			System.out.println("2번 메뉴 선택");
			break;
		case 3:
			System.out.println("3번 메뉴 선택");
			break;
		default:
			System.out.println("없는 메뉴입니다~~");
		}
		sc.close();
	}
}




























