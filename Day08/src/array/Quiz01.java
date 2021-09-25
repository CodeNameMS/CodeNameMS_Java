package array;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. �л� 5���� ����(= int)�� ������ �迭�� �����Ѵ�
		int[] arr1 = new int[5];
		
		// 2. 1���� ������ ������ �ݺ��� Ȱ���ؼ� ������ �Է� �޴´�.
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i+"."+"�л� ���� �Է� : ");
			arr1[i] = sc.nextInt();
		}
		
		// 3. �Է� �� �迭(= ����)�� �Ϸķ� ��ü�� ����Ѵ�.
		System.out.print("���� : ");
		
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// 4. �л� ������ �հ�� ����� ����Ѵ�.
		int sum = 0;
		double avg;
		
		for (int j=0; j<arr1.length; j++) {
			sum +=arr1[j];
		}
		avg = (double)sum/arr1.length;
		System.out.println("�հ� : " + sum +", "+ "��� : " + avg);
		
		// 5. 1��� �õ��� ������ ���(= �ִ밪, �ּҰ�)
		
		int max, min;
		
		max = arr1[0];
		for(int k=0; k<arr1.length; k++) {
			if (max < arr1[k]) {
				max = arr1[k];
			}
		}
		
		min = arr1[0];
		for(int l=0; l<arr1.length; l++) {
			if (min > arr1[l]) {
				min = arr1[l];
			}
		}
		
		System.out.println("1�� �л� ���� : " + max);
		System.out.println("�õ� �л� ���� : " + min);
		
		// Ex. ���� : �����͸� �����ְ� �����ϴ� ���
		// 1. �������� ���� : �����Ͱ� ���� ������ ū ������ ����
		// 2. �������� ���� : �����Ͱ� ū ������ ���� ������ ����
		
		for (int i=0; i<arr1.length - 1; i++) {			// �迭 ������ ������
			for (int j = i+1; j < arr1.length; j++) {	// i ���� ��ġ���� ������
				if (arr1[i] > arr1[j]) {	// ���� �����Ͱ� ���� �����ͺ��� ũ��
					
					// swap �˰��� : ������ ��ü �˰���
					int tmp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tmp;
				}
			}
		}
		
		// ���� �� ���
		System.out.println("\n���� �� ����) ");
		
		for (int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + "��");
		}
		System.out.println();
	
		sc.close();
	}
}






























