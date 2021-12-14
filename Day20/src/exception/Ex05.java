package exception;


public class Ex05 {
	// throws : 예외를 전가하는 구문
	// 해당 메서드 내에서 발생한 예외를 직접 처리하지 않고, 호출한 위치로 전가한다.
	// ㄴ> 전가받은 구간에서 처리하게 하는 구문
	
	// main 함수에서까지 전가를 해버리면, JVM이 처리하게 되어있다.
	
	public static void main(String[] args) throws InterruptedException {
		// 자바의 메서드 중에서는 예외를 처리하지 않으면
		// 사용하지 못하는 메서드들이 간혹 있다.
		
		for (int i = 10; i>= 1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
		
		
	}
}



































