package other;

// public 클래스
// - 어디서든 사용 가능
// - 단, 파일 이름과 클래스명과 동일해야 한다.
// - 따라서, 한 페이지 내에서 딱 한 개만 작성 가능



public class Pub {
	private int pri = 10;
	int def = 20;
	public int pub = 30;
	
	public void show() {
		System.out.printf("%d, %d, %d\n", pri, def, pub); 
	}
}



























