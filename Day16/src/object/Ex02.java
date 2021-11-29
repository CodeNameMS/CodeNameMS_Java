package object;

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	@Override
//	public String toString() {
//		return "(" + x +", "+ y + ")";
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Point target = (Point) obj;
		
		if(x == target.x && y== target.y) {
			return true;
		}
		
		return false;
	}


}

public class Ex02 {
	public static void main(String[] args) {
		// �Ʒ��� �ڵ带 ���� Ŭ������ �ۼ�
		
		Point p1 = new Point(1, 3);
		Point p2 = new Point(1, 3);
		Point p3 = p1;
		
		System.out.println("p1 = " + p1);	// p1 = (1, 3)
		System.out.println("p2 = " + p2);	// p2 = (1, 3)
		System.out.println("p3 = " + p3 + "\n");
		
		
		// ���� ������ == �񱳿����� ���� ����� '�ٶ󺸴���' ��
		System.out.println("p1 == p2 ��� : " + (p1 == p2));
		System.out.println("p1 == p3 ��� : " + (p1 == p3));
		System.out.println();
		
		// ��ü�� ���� �����͸� ���ϱ� ���ؼ��� equals() �ż��带 ����Ѵ�.
		// equals()�� Object�κ��� ��ӹ��� �޼���. ��, object�� �������� �ۼ��Ǿ� �ִ�.
		// ����, �̸� �ùٸ��� �����ϰ� �Ϸ��� �������̵��� �ؾ��Ѵ� !!!
		System.out.println("p1.equals(p2) ��� : " + p1.equals(p2));
		
	}
}


































