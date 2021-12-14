package exception;

// 오류 : 프로그램에서 발생하는 오작동
// ㄴ> 에러 : 시스템 발생하는 오류, 개발자가 처리 불가능
// ㄴ> 예외 : 개발자나, 사용자의 입력 등에 의해서 발생하는 오류. 미리 예상해서 처리가능

// 예외 처리 : 예외를 탐지해서 처리하는 구문
// ex) 0으로 나눌때

public class Ex01 {
	public static void main(String[] args) {
		try {	// try : 예외를 탐지하는 구문. 발생하는 예외는 일치하는 catch구문으로 이동
			System.out.println("10 / 0 = " + 10 / 0);
		}
		catch(ArithmeticException e){
			// catch : 발생하는 예외를 처리하는 구문
			
			System.err.println("0으로 나눌 수 없습니다.");
			// err : 표준 에러출력구문
			System.err.println("예외 메시지 : " + e.getMessage());
			
			e.printStackTrace();
			
		}
		
		System.out.println("\n예외가 발생하면, java는 기본적으로");
		System.out.println("JVM이 알아서 처리한다");
	}
}




























