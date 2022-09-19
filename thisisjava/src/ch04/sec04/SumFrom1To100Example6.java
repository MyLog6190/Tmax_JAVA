package ch04.sec04;

public class SumFrom1To100Example6 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100;) {
			if(i> 100) { break; }
			sum += i;
			i++;
		}
		System.out.println("합 : " + sum);
	}
}
