package other;

// default 클래스
// - 같은 패키지 내에서만 사용 가능
// - 파일의 이름(.java)과 클래스명이 같지 않아도 됨
// - 따라서, 한 페이지 내에서 여러개 작성 가능

class A {}

class Def {
	private int pri = 10;
	int def = 20;
	public int pub = 30;
	
	public void show() {
		System.out.printf("%d, %d, %d\n", pri, def, pub); 
	}
}





















