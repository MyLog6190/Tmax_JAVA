package ch06.verify;
///////// 15
public class MamberService {
//	boolean login(String id, String password) {
//		if(id.equals("hong") && "12345".equals(password)) {
//			return true;
//		}
//		return false;
//	}
	
	boolean login(String id, String password) {
		return id.equals("hong") && "12345".equals(password)?true:false;
	}
	
	void logout(String id) {
		System.out.println( id + "님이 로그아웃 되었습니다");
		return;
	}
	
	public static void main(String[] args) {
		MamberService ms = new MamberService();
		boolean result = ms.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
