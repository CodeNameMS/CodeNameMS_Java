package api;

public class Ex02 {
	public static void main(String[] args) {
		// 문자열 -> 정수
		String str1 = "10";
		
		System.out.println("str1 + 20 = " + (str1 + 20));
		
		// int n1 = (int)str1;
		// ㄴ> 클래스와 일반자료형 간에는 형변환이 불가능
		
		int n1 = Integer.parseInt(str1);
		
		System.out.println("n1 + 20 = " +  (n1 + 20));
		
		// 연습. 아래 문자열을 실수, 정수로 변환 후 원넓이를 구한다
		String str2 = "3.14";
		String r = "3";
		
		double pi = Double.parseDouble(str2);
		int n3 = Integer.parseInt(r);
		
		System.out.println("원 넓이 : " + (pi*n3*n3));
				
	}
}



















