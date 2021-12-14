package exception;



public class Ex03 {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 10, 20, 30 };
		
		try {
			System.out.println("arr[0] = " + arr[0]);
			
			System.out.println("arr[3] = " + arr[3]);
		// ㄴ> 이 줄은 예외가 발생한다.
		// ㄴ> 예외 이름을 확인해서 예외처리하고 
		// ㄴ> index범위를 초과했다는 구문을 출력한다.
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.err.println("index범위를 초과했습니다 !!!");
			System.err.println(e.getMessage() + "(은)는 없음");
		}
		
		
	}
}































