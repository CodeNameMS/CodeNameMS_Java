package polymorphism;

// ������ : �پ��� ���¸� ��ٴ� �ǹ�
// - �ϳ��� �޼��带 ������ ���� �ٸ� ���¸� ���.

// ������ ����ü
// 1. ��� ����
// 2. �������̵�

class Figure {
	void Draw() {
		System.out.println("������ �׸���");
	}
}

class Triangle extends Figure {
	@Override
	void Draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}

class Square extends Figure {
	@Override
	void Draw() {
		System.out.println("�簢���� �׸���");
	}
}

class Circle extends Figure {
	@Override
	void Draw() {
		System.out.println("���� �׸���");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		// ��ĳ���� : ���� Ŭ������ ��� ó������
		Figure[] fi = new Figure[] { tri, squ, cir};
		
		for (int i=0; i< fi.length; i++) {
			fi[i].Draw();
		}
		
	}
}





















