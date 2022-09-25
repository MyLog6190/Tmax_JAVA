package ch06.verify;

import java.util.Scanner;

/////////// 20
public class BankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account2[] accounts = new Account2[100];
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1": 
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				
				System.out.print("계좌번호> ");
				String accountNumber = sc.nextLine();
				
				System.out.print("계좌주> ");
				String accountOwn = sc.nextLine();
				
				System.out.print("초기입금액> ");
				int accountAmount = 0;
				try {
					accountAmount = Integer.parseInt(sc.nextLine());
				}catch(NumberFormatException e) {
					System.out.println("입금액은 숫자로만 입력해주세요");
					continue;
				}
				
				Account2 account = new Account2(accountNumber, accountOwn, accountAmount);
				
				for(int i = 0; i < accounts.length; i++) {
					if(accounts[i] == null) {
						accounts[i] = account;
						System.out.println("결과 : 계좌가 생성되었습니다.");
						break;
					}
				}
				
				break;
			case "2": 
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				for(Account2 account2 : accounts) {
					if(account2 == null) {
						System.out.println("등록된 계좌가 없습니다.");
						break;
					}
					System.out.print(account2.getAccountNumber() + "  "
									+ account2.getAccountOwn() + "  "
									+ account2.getAccountAmount() + "  ");
					System.out.println();
				}
				break;
			case "3": 
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				
				System.out.print("계좌번호> ");
				accountNumber = sc.nextLine();
				
				System.out.print("예금액> ");
				accountAmount = Integer.parseInt(sc.nextLine());
				
				for(Account2 account2 : accounts) {
					try {
						if(accountNumber.equals(account2.getAccountNumber())) {
							account2.setAccountAmount(accountAmount + account2.getAccountAmount());
							break;
						}
					}catch(NullPointerException e) {
						System.out.println("없는 계좌번호입니다.");
						break;
					}
				}
				break;
			case "4": 
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호> ");
				accountNumber = sc.nextLine();
				
				System.out.print("출금액> ");
				accountAmount = Integer.parseInt(sc.nextLine());
				
				for(Account2 account2 : accounts) {
					try {
						if(accountNumber.equals(account2.getAccountNumber())) {
							if(account2.getAccountAmount()-accountAmount >= 0){
								account2.setAccountAmount(account2.getAccountAmount()-accountAmount);
							}else {
								System.out.println("잔액 부족");
							}
							break;
						}
					}catch(NullPointerException e) {
						System.out.println("없는 계좌번호입니다.");
						break;
					}
				}
				break;
			case "5": run = !run; break;
			}
		}
	}
}

class Account2 {
	private String accountNumber;
	private String accountOwn;
	private int accountAmount;
	
	public Account2(String accountNumber, String accountOwn, int accountAmount) {
		this.accountNumber = accountNumber;
		this.accountOwn = accountOwn;
		this.accountAmount = accountAmount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwn() {
		return accountOwn;
	}

	public void setAccountOwn(String accountOwn) {
		this.accountOwn = accountOwn;
	}

	public int getAccountAmount() {
		return accountAmount;
	}

	public void setAccountAmount(int accountAmount) {
		this.accountAmount = accountAmount;
	}
	
	
}
