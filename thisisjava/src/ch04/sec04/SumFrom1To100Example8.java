package ch04.sec04;

public class SumFrom1To100Example8 {
	public static void main(String[] args) {
		int sum = 0;
		
		
		for(int i = 1; ; i++) {
			if(i> 100) { break; }
			sum += i;
		}
		System.out.println("합 : " + sum);
	}
}
