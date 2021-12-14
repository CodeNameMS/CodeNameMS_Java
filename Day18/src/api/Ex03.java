package api;

public class Ex03 {
	public static void main(String[] args) {
		// 정수 -> 문자열
		int n1 = 10;
		
		// String str1 = (String)n1;
		// ㄴ> 기본 자료형과 클래스 간의 변환은 안됨
		
		String str1 = Integer.toString(10);
		
		System.out.println("str1 + 20 = " + (str1 + 20));
		
		// 하지만, 자동 형변환을 이용하면 좀 더 수월하게 변환 가능
		str1 = n1 + "";
		System.out.println("str1 + 20 = " + (str1 + 20));
		
		String str2 = 10 + n1 + "";
		String str3 = "" + 10 + n1;
		
		System.out.println("str2 : " + str2 + ", str3 = " + str3);
		
	}
}

















