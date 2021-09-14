package input;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 변수에 값을 입력받아서 아래처럼 출력
		String name, adress;
		int age;
		
		// 이름 : 홍길동
		// 나이 : 25
		// 주소 : 부산 광역시 해운대구 센텀로
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 입력 : ");
		adress = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + adress);
		
		
	}
}



















