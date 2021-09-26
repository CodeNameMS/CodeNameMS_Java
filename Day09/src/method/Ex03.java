package method;

// 다시
// 1. 전달인자와 매개변수의 개수 및 자료형은 일치시킨다
// 2. 매개변수에는 전달인자가 순서대로 채워진다

public class Ex03 {
	public static void adder(int n1, int n2) {	// 매개변수가 2개
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		System.out.println("n1 + n2 = " + (n1 + n2) + "\n");
	}
	
	public static void main(String[] args) {
		
		adder(5, 3);
		
		adder(10, 7);
		
		// 잘못된 사용 방식
		// adder(5);		// 전달인자 갯수가 일치하지 않는다.
		
		// adder(5, 3.0);	// 전달인자 갯수는 맞지만 자료형이 일치하지 않는다.
		
		
		
	}
}

























