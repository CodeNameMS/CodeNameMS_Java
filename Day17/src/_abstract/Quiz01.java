package _abstract;

import other.Machine;
import other.USB;

class Phone extends Machine implements USB {
	@Override
	public void run() {
		System.out.println("휴대폰 연결됨. 충전중...");
	}
}

class Remocon extends Machine {
	@Override
	public void run() {
		System.out.println("리모컨 동작. OnOff");
	}
}

class PC extends Machine {
	@Override
	public void run() {
		System.out.println("전원 OnOff");
	}
	
	void connect(USB target) {
		target.run();
	}
}

class People {
	void use(Machine target) {
		target.run();
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		Phone phone = new Phone();
		Remocon remote = new Remocon();
		
		pc.connect(phone);
		// pc.connect(remote);
		System.out.println();
		
		People pe = new People();
		
		pe.use(phone);
		pe.use(remote);
		
		// ※ 인터페이스나, 추상클래스는
		// 익명 클래스라는 이름으로 객체를 생성할 수 있다.
		// - 일회용 클래스로써, 특정 객체 하나에만 적용
		
		Machine mac = new Machine() {
			
			@Override
			public void run() {
				System.out.println("기계 입니다");
			}
		};
		
		mac.run();
		
		// 얘는 인터페이스
		USB sub = new USB() {
			
			@Override
			public void run() {
				System.out.println("USB 객체입니다.");
			}
		};
		
		sub.run();
		
		// ※ 함수형 인터페이스는 람다식이라는 코드로
		// 간략하게 바로 객체 생성 가능
		
		USB usb2 = () -> {
			System.out.println("람다식으로 구현된 USB");
		};
		
		usb2.run();
		
	}
}































