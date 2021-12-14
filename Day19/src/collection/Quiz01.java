package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws InterruptedException {
		// 로또 추첨을 작성해보자
		
		// 1. 1 ~ 45 사이의 무작위 수를 뽑는다.
		// 2. 중복 없이 6개가 될 때까지 뽑는다.
		// 3. 결과 발표는 항상 작은 수 부터 출력한다
		Scanner sc = new Scanner(System.in);
		int lotto;
		
		System.out.print("로또 구매 갯수 : ");
		lotto = sc.nextInt();
		
		for (int i =1; i<=lotto; i++) {
		
			Random rand = new Random();	// 랜덤 함수 선언
			HashSet<Integer> hs = new HashSet<Integer>();	// 중복이 없도록 set 선언
			
			while(hs.size() != 6) {			// 뽑기
				int n = rand.nextInt(45)+1;
			
				hs.add(n);		// set 채우기
			}		
		
			ArrayList<Integer> list = new ArrayList<Integer>();	// set의 값을 넣을 리스트 선언
			
			list = new ArrayList<Integer>(hs);	// set -> List
	
			// List를 오름차순 정렬
			list.sort(null);
			
			System.out.println(i + "회차 로또 당첨 번호 :  " + list);
			
			Thread.sleep(1000);
		}
		
		sc.close();
		
	}
}




















