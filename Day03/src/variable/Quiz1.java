package variable;

public class Quiz1 {
	// 1. main 함수를 작성한다.
	public static void main(String[] args) {
	// 2. 이름, 나이, 키, 주소, 성별을 저장할 변수를 선언한다.
	// 단, 변수의 자료형은 직접 적합하다고 느끼는 자료형을 사용한다.
	
	// 3. 2번에 선언한 변수에 값을 채운다.
	
	// 4. 채운 값은 아래와 같이 출력된다.
		
	// 이름 : 홍길동
	// 나이 : 30세
	// 신장 : 176.6cm
	// 주소 : 부산 광역시 해운대구 센텀로
	// 성별 : 여
		String name = "홍길동";
		int age = 30;
		float height = 176.6F;
		String adress = "부산 광역시 해운대구 센텀로";
		char sex = '여';		// 문자는 ' ' (홑따옴표)
		
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age + "세");
		System.out.printf("신장 : %.1fcm\n",height);
		System.out.println("주소 : "+ adress);
		System.out.println("성별 : "+ sex);
	}
}			











































