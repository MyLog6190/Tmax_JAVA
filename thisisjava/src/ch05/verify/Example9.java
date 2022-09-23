package ch05.verify;

import java.util.Scanner;

public class Example9 {
	// 필드(global) 선언 후 명시적으로 초기화하지 않더라도 JVM이 자동으로 자동화 해줌 
	static int scores[]; // null로 초기화
	static Scanner sc = new Scanner(System.in); // 스캐너 객체로 초기화
	public static void main(String[] args) {
		// 메소드안에서 선언된 local변수는 선언 후 초기화를 해줘야 사용가능
		boolean run = true;
		
		// 반복문
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.print("학생수> ");
				try {
					int length  = Integer.parseInt(sc.nextLine());
					scores = new int[length];
					System.out.println("생성된 배열의 길이 : " + scores.length);
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
				
			case "2":
				if(scores == null) {
					System.out.println("배열을 먼저 생성하세요.");
					continue;
				}
				
				System.out.println("점수입력> ");
				for(int i = 0; i < scores.length; i++) {
					System.out.print("score["+i+"] : ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				break;
				
			case "3":
				if(scores == null) {
					System.out.println("배열을 먼저 생성하세요.");
					continue;
				}
				
				int index = 0;
				for(int score : scores) {
					System.out.println("score["+index+"] : " + score);
					index++;
				}
				break;
				
			case "4":
				if(scores == null) {
					System.out.println("배열을 먼저 생성하세요.");
					continue;
				}
				
				int sum = 0;
				int max = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 : " + ((double)sum) / scores.length);
				break;
				
			case "5": 
				System.out.println("종료");
				run = !run; 
				break;
			default: 
				System.out.println("숫자를 입력해 주세요");
			}
		}
	}
}
