package input;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 이름, 나이, 키, 주소, 성별을 저장할 변수 선언
		String name;
		int age;
		float height;
		String adress;
		char gender;
		
		// 2. 1번에 선언한 변수에 값을 입력받는다.
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("키 입력 : ");
		height = sc.nextFloat();
		System.out.print("주소 입력 : ");
		adress = sc.nextLine();
		System.out.print("성별 입력 : ");
		gender = sc.next().charAt(0);
		
		// 3. 입력받은 값은 아래와 같이 출력된다.
		
		// 결과 )
		// 이름 : 홍길동 (17세, 176.1cm)
		// 주소 : 부산 광역시 해운대구 센텀로
		// 성별 : 여
		System.out.println("이름 : "+ name + "("+age+"세, " + height + "cm)");
		System.out.println("주소 : " + adress);
		System.out.println("성별 : " + gender);
		
		sc.close();
	}

}

















