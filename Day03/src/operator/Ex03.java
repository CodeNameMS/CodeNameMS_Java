package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 증감 연산자 : 피연산자를 1 증가 혹은 1 감소 시키는 연산자
		
		int n = 10;
		
		n++;	// 후치 : 연산자가 뒤에 배치
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n);
		
		++n;	// 전치 : 연산자가 앞에 배치
		System.out.println("n = " + n);
		
		--n;
		System.out.println("n = " + n + "\n");
		
		// 전치와 후치는 일반적으로 차이 없이, 피연산자를 증감 시킨다.
		// 단, 다른 연산과 섞여서 사용되면 결과가 달라진다.
		
		int n1 = 10;
		int n2, n3;
		
		n2 = ++n1;		// 전치 : 먼저 증감 후 다른 연산 수행
		System.out.println("n2 = " + n2 + ", n1 = " + n1);
		
		n1 = 10;
		
		n3 = n1++;		// 후치 : 다른 연산 수행 후 증감
		System.out.println("n3 = " + n3 + ", n1 = " + n1);
		
		int result;
		int a = 3, b = 7, c = 5, d = 2;
		
		result = a++ + --b + c-- + ++d;
		
		System.out.println("result = " + result);	// ? 17
		System.out.println("a = " + a);				// ? 4
		System.out.println("b = " + b);				// ? 6
		System.out.println("c = " + c);				// ? 4
		System.out.println("d = " + d);				// ? 3
		
		
	}
}






































