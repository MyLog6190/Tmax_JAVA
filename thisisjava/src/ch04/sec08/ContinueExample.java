package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				/*
				 continue
				 - continue문이 실행되면 continue 뒷부분은 실행 하지 않고
				   for문 처음으로 돌아가서 증감문이 실행된다.
				 */
				continue; 
			}
			System.out.print(i + " ");
		}
	}
}
