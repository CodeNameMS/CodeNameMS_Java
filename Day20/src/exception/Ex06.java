package exception;



public class Ex06 {
	public static void timer_throws(int n) throws InterruptedException{
		for (int i=n; i>=1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
	}
	
	public static void timer_try(int n) {
		for(int i=n; i>=1; i--) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		try {
			// 예외가 전가되기 때문에, 직접 처리하거나 또 전가한다.
			timer_throws(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		timer_try(5);
	}
}




























