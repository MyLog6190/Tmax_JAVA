package ch06.verify;

public class Account {
	/////// 19
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public Account() {}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
		
	}
}


class Main2 {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(10000);
		System.out.println("현재 잔고 : " + a.getBalance());
		
		a.setBalance(-100);
		System.out.println("현재 잔고 : " + a.getBalance());
		
		a.setBalance(20000000);
		System.out.println("현재 잔고 : " + a.getBalance());
		
		a.setBalance(300000);
		System.out.println("현재 잔고 : " + a.getBalance());
	}
}