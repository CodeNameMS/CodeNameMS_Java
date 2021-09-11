package variable;

public class Ex06 {
	public static void main(String[] args) {
		
		byte by = 127;
		//Type mismatch: cannot convert from int to byte
		System.out.println("by = " + by);
	
		short sh = 32767;
		System.out.println("sh = " + sh);
		
		int it = 2100000000;
		System.out.println("it = "+ it);
		
		// long lo = 3000000000;
		// The literal 3000000000 of type int is out of range 
	
		// 리터럴  : 변수에 저장되지 않고 일시적으로 바로 사용되는 데이터를 의미
		// 즉, 10이나 3.14 같이 바로 쓰이는 데이터를 의미
		
		// 이러한 리터럴은 메모리 공간에 상수풀이라는 공간에 일시적으로 잡히는데
		// 이때, 기본 잘료형으로 공간이 잡힌다.
		
		// 즉, 10 -> 정수 -> 정수의 기본 -> int(= 4byte)
		
		long lo = 3000000000L;  // L : 리터럴 공간을 long으로 잡아줘~
								// 대소문자를 가리지 않기 때문에 소문자로 l을 작성해도 됨
		System.out.println("lo = " + lo);
	
		float fl = 3.14F; // F = 리터럴 공간을 float으로 잡아줘~
		System.out.println("fl = " + fl);
		
		double db = 3.14;
		System.out.println("db = " + db);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
