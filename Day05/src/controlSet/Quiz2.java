package controlSet;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// 1. ������ �� ������ ������ �Է¹޾� �հ�� ����� ���ϰ� ������� ���
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat;
		int sum;
		double avg;
		char rank;
		System.out.print("���� ���� ���� ���ʴ�� ���� �Է� : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sum = kor + eng + mat;
		avg = sum/3.0;
		
		
		// ���ӹ����� �����̸� {} ���� ����
		System.out.println("�� ���� �� : "+sum);
		if(avg>=90) rank = 'A';
		else if(avg>=80) rank = 'B';
		else if(avg>=70) rank = 'C';
		else if(avg>=60) rank = 'D';
		else rank = 'F';
		
		System.out.println("��� : "+rank);
		
		// 2. usb �Ѱ��� 5õ��. �ѹ��� 10�� �̻��� �����ϸ� 10%�� ����. 100�� �̻��� ��ü 12%����
		//	  N���� usb�� ����� �󸶰� �־�� �ϴ°�
		int usb = 5000,n;
		double hap=0;
		System.out.print("������ usb ���� : ");
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
		System.out.printf("�� ���Ű��� %.0f�Դϴ�.\n", hap);
			
		// 3. ������ 10������ �̸��� ��� �� �� ��� �̵��ð� 2�мҿ�, 10������ ������ 4�нð� �ҿ�
		//    ������ ���� �Է��ϸ� �ҿ�ð��� ����Ͽ� ���
		//	  (�����ϰ� 10�̻��̸� ����*4, 10�̸��̸� ����*2)
		//	   ���>
		// 	   ������ �� : 8
		//	   �� �ҿ� �ð��� 16�� �Դϴ�.
		
		int time, station;
		System.out.println("������ �� �Է� : ");
		station = sc.nextInt();
		if(station>=10) {
			time = station*4;
		}
		else {
			time = station*2;
			
			if(time >= 60) {
				int hour = time / 60;
				int miniute = time % 60;
				
				System.out.println("�� �ҿ� �ð�" + hour + "�ð�" + miniute + "��");
			}
			
			else {
				System.out.println("�� �ҿ� �ð�" + time + "��");
			}
		}
		sc.close();
		
	}

}




























