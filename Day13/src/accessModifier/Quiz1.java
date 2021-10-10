package accessModifier;

class Unit {
	// �ʵ�� ��� private�� �����Ѵ�!!!
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
			
			System.out.println(this.name + "(��)�� " + unit.getName() +"(��)�� ���� !!!");
			System.out.println(this.getAtk()+"��ŭ�� ���ظ� ������");
			System.out.println();
		
			unit.show();
			//System.out.printf("%s (hp : %d, atk : %d)\n", unit.getName(), unit.getHp(), unit.atk);
		}
		else {
			System.out.println(unit.getName()+"�� �й� !!!");
			System.out.println("�� �̻� ������ �Ұ��� !!!");
		}
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Unit warrior = new Unit("����", 100, 10);		// �̸�, ü��, ���ݷ�
		Unit wizard = new Unit("������", 70, 13);	
		
		warrior.show();		// ����(hp : 100, atk : 10)
		wizard.show();		
		System.out.println("==========================");
		
		wizard.attack(warrior);		// �����簡 ���縦 ����!!!		(ü�¿��� ���ݷ¸�ŭ ����)
									// 13��ŭ�� ���ظ� ������
		
									// ���� (hp : 87, atk : 10)
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



























