package _switch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// PDF 9p ������ switch ~ case������ Ǯ�����
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum;
		double avg;
		char rank;
		System.out.print("������ �Է��ϼ��� : ");
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
		System.out.println("��� : " + avg);
		System.out.println("��� : " + rank);

		sc.close();
	}

}













