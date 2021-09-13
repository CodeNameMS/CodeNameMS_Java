package casting;

// 형 변환(casting) : 데이터 타입. 즉, 자료형을 변환하는 것
// 1. 자동 형 변환(=묵시적 형변환) : 주로 연산 시 발생하고, 다른 데이터 간의 연산이 가능하게 해준다.
// 2. 강제 형 변환(=명시적 형변환) : 개발자가 직접 자료형을 명시해서 변경하는 방식

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(10 + 20);	// int + int : 연산 가능
		
		// 자동 형변환은 아래와 같이 발생
		System.out.println(10 + 3.14);		// int + double : 원래 연산 불가능
											// ㄴ> 다른 타입 간에는 연산 불가능

		System.out.println(10.0 + 3.14);	// double + double = double
											// ㄴ> 따라서 타입을 맞추기 위해서 한 쪽이 '자동으로 변환'됨
		
		System.out.println("10 = "+ 10);	// String + int -> String + String = String
		System.out.println("10 + 2 = " + 10 + 2 );
		System.out.println("10 + 2 = " + (10 + 2));
	}
}












































