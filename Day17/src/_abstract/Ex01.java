package _abstract;

// �߻� Ŭ���� : �߻����� ������ ��ü�� ǥ��
// - ��ü(= �ν��Ͻ�)�� ���� �Ұ���
// - ��, ����� ���� Ŭ����
// - �߻� �޼��带 ���� �� �ִ�

// �߻� �޼��� : ���� �ڵ尡 ���� �޼���
// - �ܼ� ����(= ������)�� ������ �ִ�
// - �� ���� Ŭ�������� �ڵ带 �����ϰԲ� �����Ѵ�.

abstract class Figure {
	// �߻� �޼��� : ��üx, ����(= override)�� ����
	abstract void Draw();
	
	// �Ϲ� �޼��� : ��üo, ������ ����x
	void show() {
		System.out.println("���� ��ü�Դϴ�");
	}
}

class Triangle extends Figure {
	@Override
	void Draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
}

class Square extends Figure {
	@Override
	void Draw() {
		System.out.println("�簢���� �׸���.");
	}
}

class Circle extends Figure {
	@Override
	void Draw() {
		System.out.println("���� �׸���.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Figure fi = new Figure();
		// -> �߻� Ŭ������ ��ü ���� �Ұ���
		
		Triangle tr = new Triangle();
		Square sq = new Square();
		Circle ci = new Circle();
		
		// �߻�Ŭ������ ��ü�� �� ���� ��, ���� ������ ��� ����
		Figure[] fis = new Figure[] { tr, sq, ci };
		
		for (int i=0; i<fis.length; i++) {
			fis[i].Draw();
		}
	}
}





















