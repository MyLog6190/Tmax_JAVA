package ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);
		try {
			// throws로 선언된 메소드를 호출하는 곳에서 반드시 예외처리해줘야 함
			account.withdraw(5000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
