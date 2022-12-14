package ch04.sec03;

public class SwicthValueExample {
	public static void main(String[] args) {
		String grade = "B";
		
		//Java 11 이전 버전 문법
		int score1 = 0;
		
		//Switch문 조건 char, int만 사용(1.7이전), String(1.7이후)
		switch(grade) {
		case "A" :
			score1 = 100;
			break;
		case "B" : 
			int result = 100 - 20;
			score1 = result;
			break;
		default :
				score1 = 60;
		}
		System.out.println("score1 : " + score1);
		
		// Java12부터
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" ->{
			int result = 100 - 20;
			//Java13부터 가능
			yield result;
		}
		default -> 60;
		};
		
		System.out.println("score2 : " + score2);
	}
}
