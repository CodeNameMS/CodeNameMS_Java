package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 비교(관계) 연산자 : 데이터 간의 대소 관계를 비교하는 연산자
		// 종류 : <, >, <=, >=, ==, !=
		
		// 비교 결과는 boolean. 즉, 참/거짓으로 도출된다.
		System.out.println("3 < 10 결과 ) " + (3 < 10));
		System.out.println("10 < 10 결과) " + (10 < 10));
		System.out.println("10 <= 10 결과) " + (10 <= 10) + "\n");
		
		System.out.println("10 == 10결과) " + (10 == 10));
		System.out.println("10 == 10결과) " + (10 != 10));
		
		// 비교의 결과. 즉, 참/거짓은 boolean 자료형 변수에 저장 가능하다~
		// 참거짓의 값을 0과 1로 표현은 가능하나 다른 언어와 달리 Java는 명확히 true / false로 표현한다.
		// boolean이라는 자료형에만 값을 저장할 수 있다.
		boolean bo = 3 < 10;
		System.out.println("bo = " + bo);
	}
}

































