package input;

import java.io.IOException;

// 표준 입출력 : console창에 입력과 출력이 발생

// 표준 출력 스트림 : System.out
// 표준 입력 스트림 : System.in

// 스트림(Stream) : 데이터가 지나갈 수 있는 통로의 개념


public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		int n = System.in.read();
		
		System.out.println("n = " + (char)n);
		
		// read()라는 함수의 문제점
		// 1. 예외라는 것을 처리하지 않으면 못씀 -> 지금 진도에서는 이르다.
		// 2. 입력받은 값을 UNICOD 값으로 가져온다. 즉, 형변환이 필요하다.
		// 3. 문자열을 입ㄹ력받기 위해선 기타 다른 클래스의 도움이 필요하다 -> 지금 진도에서 이르다.
		
	}
}
























