package ch04.sec07;

// 두개의 주사위를 던저서 두 눈의 합이 6이 될깨 반복문을 빠져나가도록 수정하시오.
public class BreakExample2 {
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			
			if((num1 + num2) == 6) {
				System.out.println("num1 : " + num1 + " num2 : " + num2 );
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
