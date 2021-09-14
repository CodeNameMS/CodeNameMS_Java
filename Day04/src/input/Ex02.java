package input;

import java.lang.System;	// lang 패키지에 있는 System 클래스를 불러옴
import java.util.Scanner;	// util 패키지에 있는 System 클래스를 불러옴

public class Ex02 {
	public static void main(String[] args) {
		// 자바에서 입력을 도와줄 수 있는 클래스가 있는데 Scanner라고 한다.
		
		// 주의사항 : Scanner는 입력문이 아니다. 데이터를 읽어오는 도구
		
		Scanner sc;		// 참조형 변수는 데이터를 가리키는 변수
						// 즉, 자신의 공간이 지금 없음 -> 못 쓴다는 말
		
		sc = new Scanner(System.in); 	//new는 실제 공간을 생성하는 키워드
		
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();		// next자료형();
		System.out.println("n = " + n);
		
		String str;
		
		System.out.print("문자열 입력 : ");
		str = sc.next();		// 문자열은 next()로 입력 받는다.
		System.out.println("str = " + str);
		
		sc.close();		// Scanner 다 쓰면 반납을 해주자
	}
}


























