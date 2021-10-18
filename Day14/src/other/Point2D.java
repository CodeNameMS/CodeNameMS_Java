package other;

public class Point2D {
	protected int x, y;
	
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void showPo() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}
