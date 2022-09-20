package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종려하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String  inputString;
		
		// do{ 실행문; } while(조건);
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("q"));
	}
	
}
