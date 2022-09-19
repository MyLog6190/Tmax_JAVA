package ch03.sec07;

public class LogicaIOperationExample {
	public static void main(String[] args) {
		int x = -1;
		int y = 1;
		
		
		// &은 양쪽을 다 계산 후 논리비교
		// && 왼쪽이 false인 경우 오른쪽은 계산없이 넘긴다
		if(y != 1 && (10 / ++x) == 1) {
			System.out.println(true);
		}
		System.out.println("x : " + x);
		
		x = -1;
		
		// |은 양쪽을 다 계산 후 논리비교
		// ||은 왼쪽이 true인 경우 오른쪽은 계산 하지 않는다.
		if( y == 1 || (10 / ++x) == 1) {
			System.out.println(true);
		}
		
		System.out.println("x : " + x);
	}
}
