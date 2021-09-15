package controlSet;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// 1. 국영수 세 과목의 성적을 입력받아 합계와 평균을 구하고 등급컷을 출력
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat;
		int sum;
		double avg;
		char rank;
		System.out.print("국어 영어 수학 차례대로 점수 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sum = kor + eng + mat;
		avg = sum/3.0;
		
		
		// 종속문장은 한줄이면 {} 생략 가능
		System.out.println("세 점수 합 : "+sum);
		if(avg>=90) rank = 'A';
		else if(avg>=80) rank = 'B';
		else if(avg>=70) rank = 'C';
		else if(avg>=60) rank = 'D';
		else rank = 'F';
		
		System.out.println("등급 : "+rank);
		
		// 2. usb 한개에 5천원. 한번에 10개 이상을 구매하면 10%를 할인. 100개 이상은 전체 12%할인
		//	  N개의 usb를 사려면 얼마가 있어야 하는가
		int usb = 5000,n;
		double hap=0;
		System.out.print("구입할 usb 갯수 : ");
		n = sc.nextInt();
		if(n>=100) {
			hap = (n*5000)*0.88;
		}
		else if(n>=10) {
			hap = (n*5000)*0.9;
		}
		else {
			hap = n*5000;
		}
		System.out.printf("총 구매가는 %.0f입니다.\n", hap);
			
		// 3. 버스는 10정거장 미만일 경우 각 역 평균 이동시간 2분소요, 10정거장 넘으면 4분시간 소요
		//    정거장 수를 입력하면 소요시간을 계산하여 출력
		//	  (간단하게 10이상이면 전역*4, 10미만이면 전역*2)
		//	   출력>
		// 	   정거장 수 : 8
		//	   총 소요 시간은 16분 입니다.
		
		int time, station;
		System.out.println("정거장 수 입력 : ");
		station = sc.nextInt();
		if(station>=10) {
			time = station*4;
		}
		else {
			time = station*2;
			
			if(time >= 60) {
				int hour = time / 60;
				int miniute = time % 60;
				
				System.out.println("총 소요 시간" + hour + "시간" + miniute + "분");
			}
			
			else {
				System.out.println("총 소요 시간" + time + "분");
			}
		}
		sc.close();
		
	}

}




























