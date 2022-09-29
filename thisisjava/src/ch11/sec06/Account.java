package ch11.sec06;

public class Account {
	private long balance;

	public Account() {
		super();
	}

	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	// 예외 떠넘기기
	public void withdraw(int money) throws Exception {
		if(balance < money) {
			throw new Exception("잔고가 부족합니다."); // 강제 예외발생
		}
		balance -= money;
	}
}
