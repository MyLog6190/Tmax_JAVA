package ch04;

import java.util.Scanner;

public class check {
	public static void main(String[] args) {
		String grade = "B";
		int score1 = 0;
		switch(grade) {
		case "A" -> {score1 = 100; break;}
		case "B" -> {int result = 100 - 20; score1 = result; break;}
		default -> score1 = 60;
		}
		
		score1=grade=="A"?100:(grade=="B")?80:60;
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if((i % 3) == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		while(true) {
			int random1 = (int)(Math.random() * 6) + 1;
			int random2 = (int)(Math.random() * 6) + 1;
			if((random1 + random2) == 5) {
				System.out.println(random1 + random2);
				break;
			}
		}
		
		
		int x;
		int y;
		for(x = 1; x <= 10; x++) {
			for(y = 1; y <= 10; y++) {
				if((x*4) + (y*5) == 60) {
					System.out.println("X : " + x + " Y : " + y);
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int money = 0;
		String inputStr = null;
		while(inputStr.equals("4")) {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택 : ");
			inputStr = sc.nextLine(); 
			
			switch(inputStr) {
			case "1" : 
				System.out.print("예금액> ");
				int amount = Integer.parseInt(sc.nextLine());
				money += amount; 
				continue;
			case "2" :
				System.out.print("출금액> ");
				int meaning = Integer.parseInt(sc.nextLine());
				if (money - meaning >= 0)
					money = money - meaning; 
				else
					System.out.println("잔액부족");
				continue;
			case "3" :
				System.out.println("잔고> " + money);
				continue;
			case "4" :
				System.out.println("종료");
				break;
			}
		}
	}
}

