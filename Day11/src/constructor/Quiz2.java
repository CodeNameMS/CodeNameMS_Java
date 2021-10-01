package constructor;

class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point(){}
	
	Point adder(Point p) {	// this = p1, p = p2
		Point tmp = new Point();
		tmp.x = this.x + p.x;
		tmp.y = this.y + p.y;
		return tmp;
	}
	
	Point sub(Point p) {
		Point tmp = new Point();
		tmp.x = this.x - p.x;
		tmp.y = this.y - p.y;
		return tmp;
	}
	
	void showPo() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}


public class Quiz2 {
	public static void main(String[] args) {
		// 좌표를 표현할 클래스를 작성한다.
		Point p1 = new Point(1, 7);
		Point p2 = new Point(5, 2);
		
		p1.showPo();		// (1, 7)
		p2.showPo();		// (5, 2);
		
		Point p3 = p1.adder(p2);
		p3.showPo();
		
		p3 = p2.sub(p1);	// 빼기
		p3.showPo();
	}
}















