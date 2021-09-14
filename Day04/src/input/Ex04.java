package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word1 = "apple";
		
		System.out.println("word1 = " + word1);
		
		System.out.println("word1[0] = " + word1.charAt(0));
		System.out.println("word1[3] = " + word1.charAt(3) + "\n");
		
		char gender;
		
		System.out.print("당신의 성별은? ");
		gender = sc.next().charAt(0);
		
		System.out.println(gender);
		
		sc.close();
	}
}
























