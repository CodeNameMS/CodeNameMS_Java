package _abstract;

import java.util.Arrays;

class Car implements Comparable<Car>{
	private String model;
	private int sits;
	
	Car(String model, int sits){
		this.model = model;
		this.sits = sits;
	}
	
	@Override
	public String toString() {
		return model + ", " + sits + "��";
	}
	
	@Override
	public int compareTo(Car o) {
		return sits - o.sits;
	}
}

public class Ex04 {
	public static void printArr(Car[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Car car1 = new Car("���", 4);
		Car car2 = new Car("����", 20);
		Car car3 = new Car("������", 8);
		
		// �ڵ����� �¼����� �������� ���ϰ� �ʹ�
		// ��> �ٵ� ��ü�� �񱳿����� �Ұ���
		// System.out.println(car1 > car2);
		
		int result = car1.compareTo(car2);			// compareTo()�� ������ ���� ���� ū ���
		System.out.println("result = " + result);	// ����� ���� ���� ū ���
													// �̴�, ���߿� �����ϴ� �������� ���Ǳ� ������ ����ص���
		
		Car[] cars = new Car[] { car1, car2, car3 };
		
		printArr(cars);
		
		Arrays.sort(cars);		// sort()�� compareTo() �޼��带 �̿��ؼ� ������ ����
		printArr(cars);			// ����� ����� �������� ����, ������ ���������� �ȴ�
		
		
		
		
		
		
		
		
	}
}



















