package print;

// 1. 패키지 명은 소문자로 시작
// 2. 클래스명(=.java)은 대문자로 시작
// 3. public class 이름은 .java 동일하게 맞춘다
// 4. 필수 !!!
//	   이클립스 화면 레이아웃 초기화
//	  window -> perspective -> reset perspective

// ※ 마우스 드래그 후 ctrl + shift + f : 드래그한 만큼 주석/해제
public class Ex01 {
	public static void main(String[] args) {
		// println("문자열") : 문자열을 출력, 자동으로 끝에 줄바꿈 내장
		// 문자열 : " "(쌍따옴표)로 묶인 데이터를 의미. 문장이나 단어를 표현하기 위한 데이터
		System.out.println("Hello World!!!");
		System.out.println("안녕 세상아!!!");
		System.out.println();				// 빈 println()문은 빈 줄 생성에도 활용된다.
		
		
		// print("문자열") : 문자열을 출력. 단, 줄바꿈이 없음
		System.out.print("Hello World!!!");		// 따라서, \n과 같은 이스케이프문자를 활용 가능
		System.out.print("안녕 세상아!!!");
		
		
		// printf("문자열") : 포멧(=서식)을 활용한 문자열. 줄바꿈 없음
		System.out.printf("Hello %s\n", "World!!!");
		System.out.printf("JDK %.1f, eclipse %d\n", 1.8, 2020);
		
		// %s : String, 문자열이 들어갈 자리
		// %f : float, 소수점이 들어갈 자리. 기본 6자리까지 출력. lf없음.
		// %.nf : 소수점을 n자리만큼 제어
		// %d : decimal, 정수가 들어갈 자리
		
	}
}





























