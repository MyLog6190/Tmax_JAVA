package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		// 배열 변수 선언
		int[] scores;
		
		// 배열 변수에 배열 대입
		scores = new int[] {83,90,87};
		
		// 배열 항목 총합 구하고출력
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum1 = sum1 + scores[i];// sum1 += scores[i]
		}
		System.out.println("총합 : " + sum1);
		
		// printItem()메소드 호출 - 같은 class애의 다른 메소드호출
		printItem(new int[] {83,90,87});
		
	}
	
	// main메소드가 stack메모리 공간에 있기 때문에 메소드 앞에 stack를 붙여준다.
	// 메모리 공간에 있어야 바로 사용이 가능함
	// 전달받은 배열의 각 요소를 출력해주는 메소드
	static void printItem(int[] scores) {
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
	}
}
