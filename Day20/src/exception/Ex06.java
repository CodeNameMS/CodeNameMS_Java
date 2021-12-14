package exception;



public class Ex06 {
	public static void timer_throws(int n) throws InterruptedException{
		for (int i=n; i>=1; i--) {
			System.out.println(i + "��");
			
			Thread.sleep(1000);
		}
	}
	
	public static void timer_try(int n) {
		for(int i=n; i>=1; i--) {
			System.out.println(i + "��");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		try {
			// ���ܰ� �����Ǳ� ������, ���� ó���ϰų� �� �����Ѵ�.
			timer_throws(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		timer_try(5);
	}
}




























