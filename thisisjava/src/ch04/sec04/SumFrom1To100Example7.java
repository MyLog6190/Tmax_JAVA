package ch04.sec04;

public class SumFrom1To100Example7 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		for(; true ;) {
			if(i> 100) { break; }
			sum += i;
			i++;
		}
		System.out.println("합 : " + sum);
	}
}
