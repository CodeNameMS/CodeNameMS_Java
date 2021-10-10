package accessModifier;

class Unit {
	// 필드는 모두 private로 설정한다!!!
	private String name;
	private int hp, atk;
	
	Unit(String name, int hp, int atk){
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	String getName() {
		return name;
	}
	
	int getHp() {
		return hp;
	}
	
	int getAtk() {
		return atk;
	}


	void setHp(int hp) {
		this.hp = hp;
	}


	void show(){
		System.out.printf("%s(hp : %d, atk : %d)\n", name, hp, atk);
	}
	
	void attack(Unit unit) {	// this = wizard, unit = warrior
		if(unit.hp > 0) {
			unit.setHp(unit.hp-this.atk);
			
			System.out.println(this.name + "(이)가 " + unit.getName() +"(을)를 공격 !!!");
			System.out.println(this.getAtk()+"만큼의 피해를 입혔다");
			System.out.println();
		
			unit.show();
			//System.out.printf("%s (hp : %d, atk : %d)\n", unit.getName(), unit.getHp(), unit.atk);
		}
		else {
			System.out.println(unit.getName()+"의 패배 !!!");
			System.out.println("더 이상 공격이 불가능 !!!");
		}
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Unit warrior = new Unit("전사", 100, 10);		// 이름, 체력, 공격력
		Unit wizard = new Unit("마법사", 70, 13);	
		
		warrior.show();		// 전사(hp : 100, atk : 10)
		wizard.show();		
		System.out.println("==========================");
		
		wizard.attack(warrior);		// 마법사가 전사를 공격!!!		(체력에서 공격력만큼 차감)
									// 13만큼의 피해를 입혔다
		
									// 전사 (hp : 87, atk : 10)
		System.out.println("==========================");
		
		warrior.attack(wizard);
		warrior.attack(wizard);
		warrior.attack(wizard);
		warrior.attack(wizard);
		warrior.attack(wizard);
		warrior.attack(wizard);
		warrior.attack(wizard);
		warrior.attack(wizard);
		warrior.attack(wizard);
	}
}



























