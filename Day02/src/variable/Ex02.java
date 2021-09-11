package variable;

public class Ex02 {
	public static void main(String[] args) {
		// printf()를 활용한 데이터 출력
		
		System.out.printf("10 = %d\n", 10);
		System.out.printf("10 + 2 = %d\n\n", 10+2);
		
		// println()를 활용한 데이터 출력
		// + 연산으로 데이터를 이어서 출력가능
		System.out.println("10");
		System.out.println(10);
		
		System.out.println("10 = " + 10 + 2);  // 문자열과 다른 타입(정수나 실수 등)을 연산하면 문자열의 결과를 얻는다
		System.out.println("10 + 2 = " + 10 + 2);
		
		System.out.println(10 + 2 + " = 10 + 2");
		
		System.out.println("10 + 2 = " +(10 +2)); // 연산자 우선순위를 무시하는 유일한 수단은 ()괄호이다.
		
		
	}
}










































