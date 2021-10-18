package inherited2;

import other.Point2D;

class Point3D extends Point2D {
	private int z;
	
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	@Override
	public void showPo() {
		System.out.printf("(%d, %d, %d)\n", x, y, z);
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		// other의 Point2D를 상속받아서 아래 코드를 실행
		Point3D p1 = new Point3D(1, 3, 5);
		Point3D p2 = new Point3D(7, 1, 2);
	
		p1.showPo();
		p2.showPo();
	}
}










