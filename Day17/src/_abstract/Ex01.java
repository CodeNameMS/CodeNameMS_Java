package _abstract;

// 추상 클래스 : 추상적인 개념의 객체를 표현
// - 객체(= 인스턴스)를 생성 불가능
// - 즉, 상속을 위한 클래스
// - 추상 메서드를 가질 수 있다

// 추상 메서드 : 실행 코드가 없는 메서드
// - 단순 형태(= 껍데기)만 가지고 있다
// - ★ 하위 클래스에서 코드를 구현하게끔 강제한다.

abstract class Figure {
	// 추상 메서드 : 몸체x, 구현(= override)을 강제
	abstract void Draw();
	
	// 일반 메서드 : 몸체o, 구현을 강제x
	void show() {
		System.out.println("도형 객체입니다");
	}
}

class Triangle extends Figure {
	@Override
	void Draw() {
		System.out.println("삼각형을 그린다.");
	}
}

class Square extends Figure {
	@Override
	void Draw() {
		System.out.println("사각형을 그린다.");
	}
}

class Circle extends Figure {
	@Override
	void Draw() {
		System.out.println("원을 그린다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Figure fi = new Figure();
		// -> 추상 클래스는 객체 생성 불가능
		
		Triangle tr = new Triangle();
		Square sq = new Square();
		Circle ci = new Circle();
		
		// 추상클래스는 객체를 못 만들 뿐, 참조 변수는 사용 가능
		Figure[] fis = new Figure[] { tr, sq, ci };
		
		for (int i=0; i<fis.length; i++) {
			fis[i].Draw();
		}
	}
}





















