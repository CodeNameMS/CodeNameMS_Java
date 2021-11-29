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
		// 아래의 코드를 보고 클래스를 작성
		
		Point p1 = new Point(1, 3);
		Point p2 = new Point(1, 3);
		Point p3 = p1;
		
		System.out.println("p1 = " + p1);	// p1 = (1, 3)
		System.out.println("p2 = " + p2);	// p2 = (1, 3)
		System.out.println("p3 = " + p3 + "\n");
		
		
		// 참조 변수의 == 비교연산은 같은 대상을 '바라보는지' 비교
		System.out.println("p1 == p2 결과 : " + (p1 == p2));
		System.out.println("p1 == p3 결과 : " + (p1 == p3));
		System.out.println();
		
		// 객체의 실제 데이터를 비교하기 위해서는 equals() 매서드를 사용한다.
		// equals()는 Object로부터 상속받은 메서드. 즉, object의 기준으로 작성되어 있다.
		// 따라서, 이를 올바르게 동작하게 하려면 오버라이딩을 해야한다 !!!
		System.out.println("p1.equals(p2) 결과 : " + p1.equals(p2));
		
	}
}


































