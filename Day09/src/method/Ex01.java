package method;

// 함수(function)	: 특정 길이의 코드를 이름을 지어두고 저장하고 사용하는 방식
// 메서드(method)	: 클래스 안에 작성된 함수를 의미. 즉, 객체지향개념이 더해진 함수

public class Ex01 {
	public static void hello() {
		
		for (int i=1; i<=5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n = 10;		// 변수 : 데이터를 저장하는 공간
		
		hello();		// 함수의 호출 : 이미 작성되어 있는 함수를 실행
		
		hello();		// 함수의 재사용성 : 한 번 작성해둔 함수는 여러번 호출 가능
		
		hello();
	}
}




















