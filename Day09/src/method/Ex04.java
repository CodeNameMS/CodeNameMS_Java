package method;

// 반환형 : 함수의 자료형을 의미하고, 함수 결과값의 자료형을 말한다.
// - 반환형이 없는 함수 : void
// - 반환형이 있는 함수 : void가 아닌 자료형이 작성된 함수


public class Ex04 {
	// 1. 반환형이 없는 함수 : 함수의 코드만 실행하고 결과값이 없는 함수. 값이 필요없고 출력정도만 필요한 함수에 사용됨
	public static void adder(int n1, int n2) {
		System.out.println("두 수의 합 : " + (n1 + n2));
	}
	
	// 2. 반환형이 있는 함수 : 함수를 실행 후 작성된 자료형의 값을 결과로 돌려주는 함수
	public static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		adder(10, 4);	// 반환형이 없는 함수는 그냥 이름만 호출한다.
		
		// 반환형이 있는 함수는 결과를 돌려준다. 따라서 결과를 저장할 필요가 있다.
		int result = adder2(4, 7);
	//  int result = 11;
		
		System.out.println("result = " + result);
		
		
		
		// 반환형이 있는 함수는 값을 꼭 저장하거나, 혹은 바로 사용해버린다.
		System.out.println("adder2(6, 3) = " + adder2(6, 3));
	//	System.out.println("adder2(6, 3) = " + 9);
		
		result = adder2(adder2(10, 3), adder2(7, 1));
		
		System.out.println("result = " + result);
	}
}





























