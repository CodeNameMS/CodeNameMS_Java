package input;

import java.util.Scanner;

// nextLine()은 버퍼를 비우는 용도로 사용되기도 하지만
// 한 줄 전체를 끌고 오기 때문에, 한 줄 입력받는 용도로 사용도 된다.

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word;
		
		System.out.print("문장을 입력 : ");
		// word = sc.next();
		word = sc.nextLine();
		
		System.out.println("word = " + word);
		sc.close();
		
	}
}













