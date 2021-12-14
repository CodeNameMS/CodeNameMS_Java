package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws InterruptedException {
		// �ζ� ��÷�� �ۼ��غ���
		
		// 1. 1 ~ 45 ������ ������ ���� �̴´�.
		// 2. �ߺ� ���� 6���� �� ������ �̴´�.
		// 3. ��� ��ǥ�� �׻� ���� �� ���� ����Ѵ�
		Scanner sc = new Scanner(System.in);
		int lotto;
		
		System.out.print("�ζ� ���� ���� : ");
		lotto = sc.nextInt();
		
		for (int i =1; i<=lotto; i++) {
		
			Random rand = new Random();	// ���� �Լ� ����
			HashSet<Integer> hs = new HashSet<Integer>();	// �ߺ��� ������ set ����
			
			while(hs.size() != 6) {			// �̱�
				int n = rand.nextInt(45)+1;
			
				hs.add(n);		// set ä���
			}		
		
			ArrayList<Integer> list = new ArrayList<Integer>();	// set�� ���� ���� ����Ʈ ����
			
			list = new ArrayList<Integer>(hs);	// set -> List
	
			// List�� �������� ����
			list.sort(null);
			
			System.out.println(i + "ȸ�� �ζ� ��÷ ��ȣ :  " + list);
			
			Thread.sleep(1000);
		}
		
		sc.close();
		
	}
}




















