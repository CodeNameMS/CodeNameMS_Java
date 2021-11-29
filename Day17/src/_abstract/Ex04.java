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
		return model + ", " + sits + "석";
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
		Car car1 = new Car("모닝", 4);
		Car car2 = new Car("버스", 20);
		Car car3 = new Car("리무진", 8);
		
		// 자동차의 좌석수를 기준으로 비교하고 싶다
		// ㄴ> 근데 객체는 비교연산이 불가능
		// System.out.println(car1 > car2);
		
		int result = car1.compareTo(car2);			// compareTo()는 음수면 뒤의 값이 큰 경우
		System.out.println("result = " + result);	// 양수면 앞의 값이 큰 경우
													// 이는, 나중에 정렬하는 기준으로 사용되기 때문에 기억해두자
		
		Car[] cars = new Car[] { car1, car2, car3 };
		
		printArr(cars);
		
		Arrays.sort(cars);		// sort()는 compareTo() 메서드를 이용해서 정렬을 수행
		printArr(cars);			// 결과가 양수면 오름차순 정렬, 음수면 내림차순이 된다
		
		
		
		
		
		
		
		
	}
}



















