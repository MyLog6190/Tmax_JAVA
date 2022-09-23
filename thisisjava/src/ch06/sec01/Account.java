package ch06.sec01;

public class Account {
	// 필드(속성-global변수)
	private String owner; // 소유자
	private int balance;  // 잔고
	private String sno;	  // 계좌번호
	
	
	// 생성자
	public Account(String owner, int balance, String sno) {
		this.owner = owner;
		this.balance = balance;
		this.sno = sno;
	}
	
	// 메소드
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public String getSno() {
		return sno;
	}
	
	public int withdraw(int amount) {
		if(balance - amount < 0) System.out.println("잔고 부족");
		else balance -= amount;
		return getBalance();
	}
	
	public int saveMoney(int amount) {
		balance += amount;
		return getBalance();
	}
}
