package accessModifier;

import other.Pub;

public class Ex02 {

	public static void main(String[] args) {
		// default Ŭ������ �ܺο��� ��� �Ұ���
		// Def d = new Def();
		
		Pub p = new Pub();
		
		//System.out.println("private : " + p.pri);
		//System.out.println("default : " + p.def);
		
		// private�� ���� �͵� ����
		// default�� ���� ��Ű�� ���ο����� ���� ����
		// ��, ��Ű���� �޶����� ������� ����
		
		System.out.println("public : " + p.pub);
		
		p.show();
		
	}

}


















