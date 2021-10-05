package accessModifier;

class Driver {
	// 아래코드는 수정하지 않고 Access 메서드가 필요하다면 작성해서 사용한다.
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
		String name = driver == null ? "없음" : driver.getName();
		System.out.printf("%s (%dkm/s, %s)\n", model,speed,name);
	}
	
	void takeOn(Driver driver) {
		System.out.printf("%s님이 탑승 !\n", driver.getName());
		this.driver = driver;
		
		showCar();
	}
	
	void accel(int speed) {
		System.out.printf("%dkm/s만큼 가속 !!!\n", speed);
		this.speed += speed;
		showCar();
	}
	
	void _break(int speed) {
		System.out.printf("%dkm/s만큼 감속 !!!\n", speed);
		this.speed -= speed;
		showCar();
	}
	
	void takeOff() {
		if(speed !=0) {
			System.out.println("정차 후 내려주세요 !~");
			return;
		}
		System.out.printf("%s님이 하차 !\n", driver.getName());
		driver = null;
		showCar();
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		// 아래 코드가 실행되게 하라.
		Driver driver = new Driver("홍길동");
		Car car = new Car("모닝");		// 멤버는 모델명, 속도, 운전자
		
		
		car.showCar();		// 모닝 (0km/s, 없음);
		
		car.takeOn(driver);	// 홍길동님이 탑승
							// 모닝 (0km/s, 홍길동)

		car.accel(20);		// 20km/s만큼 가속!!
		
		car.takeOff();
		
		car._break(10);
		
		car.takeOff();
		
		car._break(10);
		
		car.takeOff();

	}

}























