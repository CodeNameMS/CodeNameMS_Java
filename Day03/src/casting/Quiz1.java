package casting;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 이름, 국 영 수 점수를 저장할 변수를 선언한다.
		// 단, 국 영 수는 정수형으로 선언한다.
		
		String name = "홍길동";
		int kor, mat, eng;
		
		// 2. 1번에 선언한 변수에 값을 채운다
		kor = 70;
		mat = 98;
		eng = 80;
		// 3. 채운 값은 아래와 같이 출력된다.
		// 단, 소수점 제어는 할 필요 없음
		
		// 결과)
		// 이름 : 홍길동
		// 국 영 수 : 70 80 98
		// 합계 : 248
		// 평균 : 82.66666666667
		System.out.println("이름 : " + name);
		System.out.println("국 영 수 : " + kor + eng + mat);
		System.out.println("합계 : "+ (kor+eng+mat));
		System.out.println("평균 : "+ (double)(kor+eng+mat)/3);
	}
}









































