package accessModifier;

// 접근 제어 지시자 : 클래스의 멤버에 접근 가능한 정도를 지정하는 것
// 1. private 	: 오로지 클래스 내부에서 접근 가능
// 2. default	: 클래스 내부 + 같은 패키지까지 접근가능
// 3. protected	: 클래스 내부 + 패키지 + 상속 받은 자식 클래스까지 접근가능
// 4. public	: 내부 + 패키지 + 상속 + 외부. 즉, 어디서든 접근 가능

class Access{
	private String pri = "Java";	// private 속성
	String def = "C++";				// default 속성(= 아무것도 지정하지 않은 상태)
	public String pub = "Python";
}

public class Ex01 {
	public static void main(String[] args) {
		Access acc = new Access();
		
		// System.out.println("private 멤버 : " + acc.pri);
		// private 멤버는 클래스 외부에서 접근 불가능
		
		System.out.println("default 멤버 : " + acc.def);	// default는 같은 패키지 내에서는 어디서든 접근 가능
		System.out.println("public 멤버 : " + acc.pub);	// public은 어디서든 접근 가능
		
		// default와 public을 구분해보려면 클래스를 다른 패키지에서 작성해본다.
		
	}
}






















