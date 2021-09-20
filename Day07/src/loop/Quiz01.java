package loop;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. 정수를 입력 받아서 약수를 출력
		// 가능하면 개수까지 출력을 한다
		// ex) 입력 : 6 -> 출력 : 1 2 3 6 (4개)
		Scanner sc = new Scanner(System.in);
		int su1,count=0;
		
		System.out.print("1. 정수 입력 : ");
		su1 = sc.nextInt();
		
		for (int i=1;i<=su1;i++) {
			if(su1%i==0){
				System.out.printf("%d ",i);
				count++;
			}
		}
		System.out.printf("(%d개)\n",count);
		
		// 2. 정수를 입력 받아서 소수를 판별
		// ex) 입력 : 7 -> 출력 : 소수
		// ex) 입력 : 6 -> 출력 : 소수아님
		
		
		int su2;
		count = 0;
		
		System.out.print("2. 정수 입력 : ");
		su2 = sc.nextInt();
		
		for (int i=1;i<=su2;i++) {
			if(su2%i==0){
				count++;
			}
		}
		if(count==2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수 아님");
		}
		
		// 3-1. 1 ~ 1000까지의 합을 출력
		// 3-2. 1 ~ 1000까지의 합 중 3의 배수는 합에서 제외
		// 3-3. 1 ~ 1000까지의 합 중 3의 배수는 합에서 제외하되, 3과 5의 공배수는 합에 포함
		
		int sum=0;
		
		System.out.print("3-1. 1~1000까지 합을 출력 : ");
		for(int i=0;i<=1000;i++) {
			sum+=i;
			
			// 디버깅 코드
			// System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		System.out.println(sum);
		
		sum=0;
		System.out.print("3-2. 3의 배수는 합에서 제외 : ");
		for(int i=0;i<=1000;i++) {
			if(i%3==0) continue;
			sum+=i;
			// 디버깅 코드
			// System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		System.out.println(sum);
		
		sum=0;
		System.out.print("3-3. 3의 배수는 합에서 제외, 3과5의 공배수는 포함 : ");
		for(int i=0;i<=1000;i++) {
			if(i%3 == 0) {
				if(i%5 != 0) {
					continue;
				}
			}
			sum+=i;
			// 디버깅 코드
			// System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		System.out.println(sum);
		
		sc.close();
	}
}






















