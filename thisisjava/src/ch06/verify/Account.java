package ch06.verify;

public class Account {
	/////// 19
	private int balance;
	
	public Account() {}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(0 <= balance && balance <= 1000000) {
			this.balance = balance;
		}else {
			return;
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