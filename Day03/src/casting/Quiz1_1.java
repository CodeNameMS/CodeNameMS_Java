package casting;

public class Quiz1_1 {
	public static void main(String[] args) {
		//Quiz1���� ���� ����� �Ҽ��� ��� �غ���
		double avg = 82.666666666667;
		
		System.out.println("avg = " + avg);
		
		// 1. printf()�� ����Ѵ�.
		System.out.printf("avg = %f\n", avg);
		System.out.printf("avg = %.2f\n\n", avg);
		
		// 2. �� ��ȯ�� ����Ѵ�. (��, �ݿø� �ȵ�)
		avg = (int)(avg * 100) / 100.0;
		
		System.out.println("avg = " + avg + "\n");
		
		// 3. Math��� �ϴ� Ŭ������ �Լ��� Ȱ���Ѵ�. (�ݿø� �Ͼ)
		avg = 82.6666666666666666666667;
		
		System.out.println("avg = " + avg);
		
		avg = Math.round(avg*100) / 100.0;
		System.out.println("avg = " + avg);
	}
}






























