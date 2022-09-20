package ch04.sec06;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		do {
			System.out.println("======================");
			System.out.println("1. 종속 | 2. 감속 | 3. 중지");
			System.out.println("======================");
			System.out.print("선택 : ");
			String strNum = scanner.nextLine();
			
			if("1".equals(strNum)) {
				speed++;
			} else if(strNum.equals("2")) {
				if(speed-- == 0) speed = 0;
			} else if(strNum.equals("3")) {
				run = !run;
			}
			
			System.out.println("현재 속도 : " + speed);
		}while(run);
		System.out.println("프로그램 종료");
	}
}
