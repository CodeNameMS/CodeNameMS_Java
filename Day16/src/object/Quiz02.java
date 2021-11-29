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
		// 로그인 프로세스를 구현
		Account[] accs = new Account[] {
				new Account("test1", "1", "테스트1"),
				new Account("root", "qwe@123", "관리자"),
				new Account("itbank", "it", "아이티뱅크")

		};
		
		Scanner sc = new Scanner(System.in);
		String userid, userpw;
		
		System.out.print("ID : ");
		userid = sc.next();
		
		System.out.print("PW : ");
		userpw = sc.next();
		
		Account login = new Account(userid, userpw);
		boolean isLogin = true;
		
		// 계정을 입력받아서 배열 내의 ID, PW가 일치하면, 닉네임을 출력하게 한다.
		for(int i=0; i<accs.length; i++) {
			if(login.equals(accs[i])) {
				System.out.println(accs[i].getName()+"님 로그인");
				isLogin = false;
				break;
			}
		}
		if (isLogin) {
			System.out.println("일치하는 정보 없음 !");
		}
		sc.close();
	}
}






























