package ch04.sec02;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 80보다 작니다.");
			System.out.println("등급은 B입니다.");
		}
		
		score = 55;
		// 합격자에게만 합격 메세지 출력 
		if(score >=60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		System.out.println("지원해 주셔셔 감사합니다.");
	}
}
