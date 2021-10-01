package constructor;

class Car{
	String name;
	int speed;
	
	Car(String name, int speed){
		this.name = name;
		this.speed = speed;
	}
	
	void showCar(){
		System.out.printf("%s (%dkm/s)\n\n",name,speed);
	}
	
	void accel(int up) {
		System.out.printf("%dkm/s��ŭ ���� !!!\n", up);
		this.speed = speed+up;
		System.out.printf("%s (%dkm/s)\n\n", name, speed);
	}
	
	void _break(int down) {
		System.out.printf("%dkm/s��ŭ ���� !!!\n", down);
		this.speed = speed-down;
		System.out.printf("%s (%dkm/s)\n\n", name, speed);
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		Car car = new Car("���", 50);
		
		car.showCar();	// ��� (50km/s)
		
		car.accel(20);	// 20km/s��ŭ ���� !!!
						// ��� (70km/s)
		
		car._break(50);	// 50km/s ��ŭ ����!!!
						// ���(50km/s)
	}
}

























