package accessModifier;

class Driver {
	// �Ʒ��ڵ�� �������� �ʰ� Access �޼��尡 �ʿ��ϴٸ� �ۼ��ؼ� ����Ѵ�.
	private String name;
	
	Driver(String name){
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

}

class Car {
	private String model;
	private int speed;
	private Driver driver;
	
	Car(String model){
		this.model = model;
	}
	
	
	void showCar() {
		String name = driver == null ? "����" : driver.getName();
		System.out.printf("%s (%dkm/s, %s)\n", model,speed,name);
	}
	
	void takeOn(Driver driver) {
		System.out.printf("%s���� ž�� !\n", driver.getName());
		this.driver = driver;
		
		showCar();
	}
	
	void accel(int speed) {
		System.out.printf("%dkm/s��ŭ ���� !!!\n", speed);
		this.speed += speed;
		showCar();
	}
	
	void _break(int speed) {
		System.out.printf("%dkm/s��ŭ ���� !!!\n", speed);
		this.speed -= speed;
		showCar();
	}
	
	void takeOff() {
		if(speed !=0) {
			System.out.println("���� �� �����ּ��� !~");
			return;
		}
		System.out.printf("%s���� ���� !\n", driver.getName());
		driver = null;
		showCar();
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		// �Ʒ� �ڵ尡 ����ǰ� �϶�.
		Driver driver = new Driver("ȫ�浿");
		Car car = new Car("���");		// ����� �𵨸�, �ӵ�, ������
		
		
		car.showCar();		// ��� (0km/s, ����);
		
		car.takeOn(driver);	// ȫ�浿���� ž��
							// ��� (0km/s, ȫ�浿)

		car.accel(20);		// 20km/s��ŭ ����!!
		
		car.takeOff();
		
		car._break(10);
		
		car.takeOff();
		
		car._break(10);
		
		car.takeOff();

	}

}























