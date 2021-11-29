package polymorphism;

// 다형성 : 다양한 형태를 띈다는 의미
// - 하나의 메서드를 가지고 서로 다른 형태를 띈다.

// 다형성 구현체
// 1. 상속 관계
// 2. 오버라이딩

class Figure {
	void Draw() {
		System.out.println("도형을 그린다");
	}
}

class Triangle extends Figure {
	@Override
	void Draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Square extends Figure {
	@Override
	void Draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle extends Figure {
	@Override
	void Draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		// 업캐스팅 : 하위 클래스를 묶어서 처리가능
		Figure[] fi = new Figure[] { tri, squ, cir};
		
		for (int i=0; i< fi.length; i++) {
			fi[i].Draw();
		}
		
	}
}





















