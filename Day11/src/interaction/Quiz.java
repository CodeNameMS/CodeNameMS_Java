package interaction;

// 상호작용 : 객체 간의 협력관계를 구성

// 객체 지향 프로그래밍(OOP) : 객체를 정의하고 객체 간의 상호작용으로 프로그램을 완성하는 기법

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
}

class Car{
	String model;
	int speed;
	Person driver;
	
	Car(String model){
		this.model = model;
	}
	
	void showCar() {
		String name = driver == null ? "없음" : driver.name;
		
		System.out.printf("%s (%dkm/s, 운전자 : %s)\n",
				model, speed, name);
	}
	
	void takeOn(Person p) {
		driver = p;		// 매개변수로 받은 사람 정보를
						// 맴버변수에 저장 -> 자동차에 사람을 탑승
		System.out.printf("%s(이)가 탑승 !!!\n", p.name);
		showCar();
	}
	
	void accel(int speed) {
		
		if  (driver == null) {
			System.out.println("운전자가 없습니다 !!!");
			return;
		}
		System.out.printf("%dkm/s 가속!!!\n", speed);
		this.speed += speed;
		showCar();
	}
	
	void _break(int speed) {
		if(driver == null) {
			System.out.println("운전자가 없습니다 !!!");
			return;
		}
		System.out.println(speed +"km/s 감속!!!");
		this.speed -= speed;
		showCar();
	}
	
	void takeOff() {
		if(this.speed != 0) {
			System.out.println("정차 후 하차해 주세요~");
			return;
		}
		System.out.println(driver.name + "(이)가 하차!!!");
		driver = null;
		showCar();
	}
}
public class Quiz {
	public static void main(String[] args) {
		Person p = new Person("홍길동");
		Car car = new Car("모닝");
		
		car.showCar();	// 모닝 (0km/s, 운전자 : 없음)
		
		// 아직 운전자가 없는 상태 -> 가속하면 안됨
		car.accel(20);	// 운전자가 없습니다 !!!
		
		car.takeOn(p);	// 홍길동(이)가 탑승!!!
						// 모닝 (0km/s, 운전자 : 홍길동);
		
		car.accel(20);	// 20km/s 가속!!!
						// 모닝 (20km/s, 운전자 : 홍길동);
		
		car._break(10); // 10km/s 감속!!!
						// 모닝(10km/s, 운전자 : 홍길동);
		
		car.takeOff();	// 정차 후 하차해 주세요~
		
		car._break(10);
		
		car.takeOff();	// 홍길동(이)가 하차
						// 모닝(0km/s, 운전자 : 없음);
	
	}
}































