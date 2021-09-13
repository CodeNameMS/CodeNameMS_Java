package operator;

// 연산자 : 데이터를 가공하여 새로운 데이터를 얻는 기호들
// 종류 : 산술, 대입, 증감, 비교, 논리, 조건

public class Ex01 {
	public static void main(String[] args) {
		// 산술 연산자 : 사칙연산을 수행하는 연산자
		// 종류 : +, -, *, /, %
		
		System.out.println("10 + 2 = " + (10 + 2));
		System.out.println("2 - 10 = " + (2 - 10));
		System.out.println("10 * 2 = " + 10 * 2);
		System.out.println("10 / 2 = " + 10 / 2);
		System.out.println("11 % 2 = " + 11 % 2);
		
		// ※나머지의 사용처
		// 1. 배수 구분
		// 2. 수의 범위제한
		// 3. 자리수 추출
		
		// 1. 배수 구분 : 나머지가 있다 -> 나누지 못함 -> 배수가 아님
		System.out.println("13 % 3 = " + 13 % 3);
		
		// 2. 수의 범위 제한
		// n % 100 -> 0 ~ 99
		// n % 100 + 1 -> 1 ~ 100
		// n % 45 +3 -> 3 ~ 47
		
		// 3. 자리수 추출
		// 10의 승수로 나누면 특정 자리를 뽑아낼 수 있다.
		
		// 팁 : 0 자리만큼 나머지, 1자리 왼쪽만큼 몫
		
		// ex) 123456 % 10 = 12345...6
		
		int birth = 991129;
		
		System.out.println("생년 : " + birth / 10000);
		System.out.println("생월 : " + birth%10000/100);
		System.out.println("생일 : " + birth % 100);
		
		
	}
}
















