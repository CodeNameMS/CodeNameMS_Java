package object;

import java.util.Scanner;

class Account {
	private String id, pw, name;
	
	Account(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	Account(String id, String pw){
		this.id = id;
		this.pw = pw;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}
	
	String getName() {
		return name;
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		// �α��� ���μ����� ����
		Account[] accs = new Account[] {
				new Account("test1", "1", "�׽�Ʈ1"),
				new Account("root", "qwe@123", "������"),
				new Account("itbank", "it", "����Ƽ��ũ")

		};
		
		Scanner sc = new Scanner(System.in);
		String userid, userpw;
		
		System.out.print("ID : ");
		userid = sc.next();
		
		System.out.print("PW : ");
		userpw = sc.next();
		
		Account login = new Account(userid, userpw);
		boolean isLogin = true;
		
		// ������ �Է¹޾Ƽ� �迭 ���� ID, PW�� ��ġ�ϸ�, �г����� ����ϰ� �Ѵ�.
		for(int i=0; i<accs.length; i++) {
			if(login.equals(accs[i])) {
				System.out.println(accs[i].getName()+"�� �α���");
				isLogin = false;
				break;
			}
		}
		if (isLogin) {
			System.out.println("��ġ�ϴ� ���� ���� !");
		}
		sc.close();
	}
}






























