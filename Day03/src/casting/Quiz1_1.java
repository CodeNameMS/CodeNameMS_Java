package casting;

public class Quiz1_1 {
	public static void main(String[] args) {
		//Quiz1에서 구한 평균의 소수점 제어를 해보자
		double avg = 82.666666666667;
		
		System.out.println("avg = " + avg);
		
		// 1. printf()를 사용한다.
		System.out.printf("avg = %f\n", avg);
		System.out.printf("avg = %.2f\n\n", avg);
		
		// 2. 형 변환을 사용한다. (단, 반올림 안됨)
		avg = (int)(avg * 100) / 100.0;
		
		System.out.println("avg = " + avg + "\n");
		
		// 3. Math라고 하는 클래스의 함수를 활용한다. (반올림 일어남)
		avg = 82.6666666666666666666667;
		
		System.out.println("avg = " + avg);
		
		avg = Math.round(avg*100) / 100.0;
		System.out.println("avg = " + avg);
	}
}






























