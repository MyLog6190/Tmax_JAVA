package ch11.sec07_01;

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
	public void withdraw(int money) {
		try {
			if(balance < money) {
				throw new MyException("잔고가 부족합니다."); // 강제 예외발생
			}
			balance -= money;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
