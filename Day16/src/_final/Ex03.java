package _final;

class A {
	
}

final class B extends A {
	
}

// final Ŭ������ �� �̻��� ����� �Ұ��� -> ��� Ȯ���� �ʿ� ���� �� ���
//class C extends B{
//	
//}


// �츮�� ���� ���� System Ŭ������ final Ŭ�����̴�.
//class MySystem extends System{
//	
//}

public class Ex03 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();	// final Ŭ������ ��ü�� ������� ���� �ƴ�!!!
	}
}
























