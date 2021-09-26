package method;

public class Ex02 {
	// 매개변수(= parameter) : 함수 호출 시 전달받은 값을 저장하는 변수
	public static void hello(int n) {
		for (int i=1; i<=5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(3);	// 전달인자(= arguments) : 함수 호출 시 함수에게 전달하는 값
		
		hello(1);
		
		hello(7);
		
		// 전달인자와 매개변수 작성 팁
		// 1. 전달인자와 매개변수는 개수 및 자료형을 일치 시킨다 !!!
		// 2. 매개변수에는 전달인자가 순서대로 채워진다.
		
		
	}
}




















