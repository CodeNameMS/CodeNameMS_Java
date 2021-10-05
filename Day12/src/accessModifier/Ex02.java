package accessModifier;

import other.Pub;

public class Ex02 {

	public static void main(String[] args) {
		// default 클래스는 외부에서 사용 불가능
		// Def d = new Def();
		
		Pub p = new Pub();
		
		//System.out.println("private : " + p.pri);
		//System.out.println("default : " + p.def);
		
		// private는 말할 것도 없고
		// default는 같은 패키지 내부에서만 접근 가능
		// 즉, 패키지가 달라지면 사용하지 못함
		
		System.out.println("public : " + p.pub);
		
		p.show();
		
	}

}


















