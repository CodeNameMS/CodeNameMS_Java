package array;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. 학생 5명의 점수(= int)를 저장할 배열을 선언한다
		int[] arr1 = new int[5];
		
		// 2. 1번에 선언한 변수에 반복을 활용해서 점수를 입력 받는다.
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i+"."+"학생 점수 입력 : ");
			arr1[i] = sc.nextInt();
		}
		
		// 3. 입력 후 배열(= 점수)를 일렬로 전체를 출력한다.
		System.out.print("점수 : ");
		
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// 4. 학생 점수의 합계와 평균을 출력한다.
		int sum = 0;
		double avg;
		
		for (int j=0; j<arr1.length; j++) {
			sum +=arr1[j];
		}
		avg = (double)sum/arr1.length;
		System.out.println("합계 : " + sum +", "+ "평균 : " + avg);
		
		// 5. 1등과 꼴등의 점수를 출력(= 최대값, 최소값)
		
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
		
		System.out.println("1등 학생 점수 : " + max);
		System.out.println("꼴등 학생 점수 : " + min);
		
		// Ex. 정렬 : 데이터를 순서있게 정리하는 방식
		// 1. 오름차순 정렬 : 데이터가 낮은 순에서 큰 순으로 정렬
		// 2. 내림차순 정렬 : 데이터가 큰 순에서 낮은 순으로 정렬
		
		for (int i=0; i<arr1.length - 1; i++) {			// 배열 마지막 전까지
			for (int j = i+1; j < arr1.length; j++) {	// i 다음 위치부터 끝까지
				if (arr1[i] > arr1[j]) {	// 앞의 데이터가 뒤의 데이터보다 크면
					
					// swap 알고리즘 : 데이터 교체 알고리즘
					int tmp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tmp;
				}
			}
		}
		
		// 정렬 후 출력
		System.out.println("\n정렬 후 점수) ");
		
		for (int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + "점");
		}
		System.out.println();
	
		sc.close();
	}
}






























