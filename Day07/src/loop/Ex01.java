package loop;

// ���� ��� : ����� �����ϴ� ����
// ���� : break, continue, return

public class Ex01 {
	public static void main(String[] args) {
		// 1. break : ����� '���' Ż��(=����)
		
		System.out.print("break) ");
		
		for(int i =1; i<=10;i++) {
			
			if(i==5) break;
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		// 2. continue : ����� '���' �������� �ø�(= ����)
		
		System.out.print("continue) ");
		
		for(int i =1; i<=10;i++) {
			
			if(i==5) continue;
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		// 3. return : �Լ��� '���' Ż��(= ����)
		
		System.out.print("return) ");
		
		for(int i =1; i<=10;i++) {
			
			if(i==5) return;
			
			System.out.print(i+" ");
		}
		System.out.println();
	}
}









































