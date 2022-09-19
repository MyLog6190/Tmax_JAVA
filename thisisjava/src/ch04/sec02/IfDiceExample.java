package ch04.sec02;

public class IfDiceExample {
	public static void main(String[] args) {
		// Math.random() 메소드 0.0부터 1.0미만의 핸덤 실수 값 출력해주는 메소드, 실핼할때마다 다른값(난수) 출력
		// 0.0 <= Math.random() < 1.0
		// (0.0 * 6) <= (Math.random() * 6) < (1.0 * 6)
		// 0 <= (Math.random() * 6) < 6
		// 0 + 1 <= (Math.random() * 6) + 1 < 6 + 1
		// 1 <= (Math.random() * 6) + 1 < 7
		int num = (int)(Math.random()*6) + 1;
		
		if(num == 1) {
			System.out.println("1");
		}else if(num == 2) {
			System.out.println("2");
		}else if(num == 3) {
			System.out.println("3");
		}else if(num == 4) {
			System.out.println("4");
		}else if(num == 5) {
			System.out.println("5");
		}else {
			System.out.println("6");
		}
	}
}
