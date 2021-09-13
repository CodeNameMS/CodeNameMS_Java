package operator;

// 대입 연산자 : 값을 할당하는 연산자
// 종류 : =

public class Ex02 {
	public static void main(String[] args) {
		// 1. 대입 연산자의 좌변은 '공간', 우변은 '결과값'을 의미한다.
		// 2. 대입 연산자는 항상 우변부터 처리한다.
		// 3. 대입 연산자의 양변의 자료형은 일치시킨다.★
		
		int n = 10;
		System.out.println("n = " + n);
		
		n = 10 + 30;
		System.out.println("n = " + n);
		
		n = n + 10;
		System.out.println("n = " + n + "\n");
		
		int n1, n2, n3;
		
		n1 = n2 = n3 = 30; // 가장 우변부터 처리한다.
		System.out.println("n1 = " + n1 + ", n2 = "+ n2 + ", n3 = " + n3 + "\n");
	
		// 복합 대입 연산자 : 산술 + 대입 연산자
		// 종류 : +=, -=, *=, /=, %=
		int num = 10;
		
		System.out.println("num + 10 = " + (num + 10));
		System.out.println("num = " + num + "\n");		// 산술 연산자는 변수에 변화를 주지 않는다.
		
		num += 10;		// num = num + 10
		System.out.println("num = " + num);
		
		num -= 2;
		System.out.println("num = " + num);
		
		num *= 3;
		System.out.println("num = " + num);
		
		num /= 6;
		System.out.println("num = " + num);
		
		num %= 4;
		System.out.println("num = " + num + "\n");
		
		int a = 10, b = 3, c = 7;
		a +=b *= c -= 2;
		
		System.out.println("a = " + a); // 25
		System.out.println("b = " + b); // 15
		System.out.println("c = " + c); // 5
	}
}





















