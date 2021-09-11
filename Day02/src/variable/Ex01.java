package variable;

// ctrl + space : 이클립스의 자동완성
// 예) main + ctrl + space : 메인 함수 자동완성
// 예) syso + ctrl + space : println() 명령어 자동완성

public class Ex01 {
	public static void main(String[] args) {
		// Data Type : 자료형, 코드 내에서 나타낼 ㅅ수 있는 데이터의 종류를 의미
		
		// 문자 	: 문자 단 하나를 의미.
		// 문자열 : 단어나, 문장을 표현하기 위한 데이터
		// 정수 	: 덧셈, 뺄셈 등의 연산을 위한 데이터
		// 실수 	: 숫자 중에서도 소수점(.)이 들어간 데이터
		// 논리 	: 참/거짓을 판별하기 위한 데이터
		
		System.out.println('a'); 		// ' ' : 문자를 의미
		System.out.println("apple\n");	// " " : 문자열을 의미
		
		System.out.println("10");		// " " -> 문자열 -> 표기만을 위한 데이터
		System.out.println(10);			// 따옴표 없음 -> 정수 -> 연산(=계산)을 위한 데이터
		System.out.println(10.0);		// .이 있는 숫자 -> 실수 -> 소수점수 데이터
		
		System.out.println("10" + "12");; 	// 문자열 더하기 -> 이어붙이기
		System.out.println(10 + 12);		// 정수 더하기 -> 연산
		System.out.println(10 + 3.14);		// 실수 더하기 -> 연산
		
		System.out.println(true);			// 참(true)
		System.out.println(false);			// 거짓(false)
		
		System.out.println("true");			// "" -> 문자열 -> 그냥 글자임
	}
}

















































