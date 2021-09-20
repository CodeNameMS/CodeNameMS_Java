package loop;

// 보조 제어문 : 제어문을 보조하는 구문
// 종류 : break, continue, return

public class Ex01 {
	public static void main(String[] args) {
		// 1. break : 제어문을 '즉시' 탈출(=종료)
		
		System.out.print("break) ");
		
		for(int i =1; i<=10;i++) {
			
			if(i==5) break;
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		// 2. continue : 제어문을 '즉시' 조건으로 올림(= 제외)
		
		System.out.print("continue) ");
		
		for(int i =1; i<=10;i++) {
			
			if(i==5) continue;
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		// 3. return : 함수를 '즉시' 탈출(= 종료)
		
		System.out.print("return) ");
		
		for(int i =1; i<=10;i++) {
			
			if(i==5) return;
			
			System.out.print(i+" ");
		}
		System.out.println();
	}
}









































