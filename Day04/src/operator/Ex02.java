package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 논리 연산자 : 둘 이상의 참/거짓을 연산하는 연산자
		// 종류 : AND(&&), OR(||), NOT(!)
		
		// 1. AND : 모든 조건이 참이면 결과가 참.
		// ㄴ> 다른 말로, 곱연산이라고 한다.
		System.out.println("true  AND true  결과 : " + (true && true));
		System.out.println("true  AND false 결과 : " + (true && false));
		System.out.println("false AND true  결과 : " + (false && true));
		System.out.println("false AND false 결과 : " + (false && false));
		System.out.println();
		
		// 1. OR : 한 쪽만 참이면 결과가 참
		// ㄴ> 다른 말로, 합연산이라고 한다.
		System.out.println("true  OR true  결과 : " + (true || true));
		System.out.println("true  OR false 결과 : " + (true || false));
		System.out.println("false OR true  결과 : " + (false || true));
		System.out.println("false OR false 결과 : " + (false || false));
		System.out.println();
		
		// 1. NOT : 참 -> 거짓으로, 거짓 -> 참으로 바꾸는 연산
		// ㄴ> 다른 말로, 반전 연산이라고 한다.
		System.out.println("NOT true 결과 : " + !true);
		System.out.println("NOT false 결과 : " + !false);
		System.out.println();
		
	}
}
































