package _switch;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ÀÚ¹Ù´Â switchÀÇ °ªÀ¸·Î "¹®ÀÚ¿­"µµ ÁÙ ¼ö ÀÖ´Ù.
		
		Scanner sc = new Scanner(System.in);
		String menu;
		
		System.out.println("¸Ş´º)");
		System.out.println("1. Â¥Àå¸é");
		System.out.println("2. Â«»Í");
		System.out.println("3. ÅÁ¼öÀ°");
		System.out.println("4. ººÀ½¹ä");
		System.out.print(">>>");
		
		menu = sc.next();
		
		switch(menu) {
		case "1" :
		case "Â¥Àå¸é" :
			System.out.println("Â¥Àå¸é ÁÖ¹®~");
			break;
		case "2" :
		case "Â«»Í " :
			System.out.println("Â«»Í ÁÖ¹®");
			break;
		case "3" :
		case "ÅÁ¼öÀ°" :
			System.out.println("ÅÁ¼öÀ° ÁÖ¹®~");
			break;
		case "4" :
		case "ººÀ½¹ä" :
			System.out.println("ººÀ½¹ä ÁÖ¹®~");
			break;
		default :
			System.out.println("¾ø´Â ¸Ş´º ÀÔ´Ï´Ù.");
		}
		sc.close();
	}
}



















