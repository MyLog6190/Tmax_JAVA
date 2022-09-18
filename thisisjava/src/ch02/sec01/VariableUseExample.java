package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
	  int hour = 3;
	  int minute = 5;
	  
	  // 정수+문자열=>문자열=>문자열+정수=>문자열 +문자열
	  System.out.println(hour + "시간" + minute+"분");
	  
	  //문자열 +정수 =>문자열:"자바10", =>"자바10"+7 =>"자바10"+"7" =>"자바107" 
	  System.out.println("자바"+10+7);
	  
	  //"자바"+(17) => "자바"+"17" => "자바17"
	  System.out.println("자바"+(10+7));
	  
	}
}
