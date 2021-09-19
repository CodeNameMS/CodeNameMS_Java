package loop;

// 반복문 : 조건에 따라서 코드를 루프
// ㄴ> while, do ~while, for

// 지정 횟수 반복	: 횟수가 정해진 반복. ex) 10번, 50번
// 불특정 횟수 반복	: 횟수가 지정되지 않은 반복. ex) 종료를 누를때까지

public class Ex01 {
	public static void main(String[] args) {
		// while : 조건식이 참이면 종속문장 수행, 거짓이면 탈출
		System.out.println("while)");
		
		int i = 1;			// 반복의 초기값
		
		while(i <= 5) {		// 반복의 조건식
			System.out.println(i + " : Hello java");
			i++;			// 반복의 증감식
		}
		System.out.println();
		
		// for : 초기값, 조건식, 증감식을 한 곳에 모아둔 구문
		// ㄴ> 횟수 파악이 용이하기 때문에, 지정 횟수 반복에 많이 사용됨
		System.out.println("for)");
		
		for (int j = 1; j<= 5; j++) {	// for (초기값; 초건식; 증감식)
			System.out.println(j + " : Hello Java");
		}
		
		// for문 순서) 초기값 -> 조건식 -> 종속문장 -> 증감식 -> 조건식 -> 종속문장 -> 증감식
	}
}







































