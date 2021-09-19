package _switch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// PDF 9p 문제를 switch ~ case문으로 풀어보세요
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum;
		double avg;
		char rank;
		System.out.print("점수를 입력하세요 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor +eng + mat;
		avg = sum / 3.0;
		
		int tmpAvg = (int)avg / 10;
		
		switch(tmpAvg) {
		case 10 : case 9 :	rank = 'A'; break;
		case 8 :			rank = 'B';	break;
		case 7 :			rank = 'C';	break;
		case 6 :			rank = 'D';	break;
		default :			rank = 'F';
		
		}
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + rank);

		sc.close();
	}

}













