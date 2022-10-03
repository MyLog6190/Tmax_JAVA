package ch11.verify.exam07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
				
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password)throws NotExistIDException, WrongPasswordException{
		if(!id.equals("blue")) {
			throw new NotExistIDException("존재하지 않는 아이디");		
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("잘못된 패스워드");
		}
	}
}	
	
class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}

class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}

