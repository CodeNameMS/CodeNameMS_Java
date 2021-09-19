package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 1. 정수를 입력 받아서 1 ~ 입력받은 수까지 출력
		// ex) 입력 : 5 -> 출력 : 1 2 3 4 5
		Scanner sc = new Scanner(System.in);
		int su1;
		
		System.out.print("1. 정수 입력 : ");
		su1 = sc.nextInt();
		
		for(int i=1; i<=su1; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 2. 정수를 입력 받아서 1 ~ 입력받은 수 까지의 합을 출력
		// ex) 입력 : 5 -> 출력 15
		System.out.print("2. 정수 입력 : ");
		su1 = sc.nextInt();
		int sum=0;
		
		for(int j=0; j<=su1; j++) {
			sum += j;
		}
		System.out.print("출력 : " + sum);
		System.out.println();
		
		
		// 3. 0을 입력받을때까지 입력을 받고, 입력받았던 수의 합을 출력
		// ex) 입력 : 1
		// ex) 입력 : 5
		// ex) 입력 : 0 -> 출력 : 6
		System.out.print("3. 정수 입력(0이면 정지) : ");
		sum = 0;
		
		for(;;) {
			su1 = sc.nextInt();
			sum += su1;
			System.out.println("입력값 : " + su1);
			
			if (su1 == 0) break;
		}
		System.out.print("출력 : " + sum);
		System.out.println();
		
		// 4. 정수를 입력 받아서, 거꾸로 수를 출력한다.
		// ex) 입력 : 1234 -> 출력 : 4321
		
		System.out.print("정수 입력 : ");
		su1 = sc.nextInt();
		
		int result = 0;
		
		while(su1 != 0) {
			result = result * 10 + su1%10;
			su1 /= 10;
		}
		System.out.println("출력 : " + result);
	}
}






























