package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
	/*
	 * 변수 선언 : 타입 변수명 = 리터럴;
	 * 
	 * 연산자(+,-,*,/,%,=,==,!=, >, <,..)를 기준으로 왼쪽과 오른쪽이 타입이 같아야 연산이 됨.
	 * 
	 * 자동 형변환
	 * 데이터 크기가 큰 type에 작은 type의 변수를 넣으면 자동으로
	   데이터가 크기가 큰 type으로 변환 된다. 
	  -> int i = (byte)b는 byte형인 b가 자동으로 int형으로 변환
	 *  반대의 경우는 불가능 하다
	   -> byte b = (int)i 불가 
	 *  
	 * 데이터 크키
	 * byte => short(char) => int => long 
	 * */	
	 
	  // long타입 변수를 선언하고 int타입의 리터럴을 대입, int타입이 long타입으로 자동변환되어서 대입연산.	
	  long var1 = 10;
	  
	  // 대입연산자(=)를 기준으로 왼쪽타입(long)과 오른쪽타입(long)이 같음.
	  long var2 = 20L;
	  
	  //오른쪽 int 리터럴 범위를 벗어나서 오류 발생
	  long var3 = 1000000000000;
	  
	  // long 리터럴, long 변수
	  long var4 = 1000000000000L;
	  
	  System.out.println(var1);
	  System.out.println(var2);
	  System.out.println(var4);

	}
}
