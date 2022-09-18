package ch03.verify01;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
	   //초를 입력받고 입력받은 초를 시 분 초로 나눠서 출력하는 p/g
	   //예) 5000초 = 1시간 23분 
	   //반복문으로 계속 할지여부 확인 후 "q"를 입력받으면 종료하도록 작성
	   Scanner sc = new Scanner(System.in);
	   String inputStr = null;
	   
	   while(true) {
		   System.out.print("초를 입력하세요.(종료 q) : ");
		   inputStr = sc.nextLine();
		   
		   if(inputStr.equals(inputStr)) {
			   System.out.println("종료");
			   break;
		   }
		   
		   int time = Integer.parseInt(inputStr);
		   int hour = time / (60 * 60);
		   int min = (time % (60 * 60)) / 60;
		   int sec = time % 60;
		   
		   System.out.println(hour + "시 " + min + "분 " + sec + "초");
	   }
	}
}
