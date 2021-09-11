package variable;

public class Ex04 {
	public static void main(String[] args) {
		// 변수 : 변하는 수. 마지막에 저장된 값이 남는다
		
		int n1 = 10;
		System.out.println("n1 = "+ n1);
		
		n1 = 20;		// 코드는 위에서 아래로 순차적으로 수행
		System.out.println("n1 = "+ n1);
		
		n1 = 10 + 20;	// = 을 대입 연산이라고 하는데, 항상 우변부터 처리한다
		System.out.println("n1 = " + n1);
	}
}
		
		