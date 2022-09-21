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
		
		//printItem()메소드 호출 - 같은 class애의 다른 메소드호출
		printItem(new int[] {83,90,87});
		
	}
	// 전달받은 배열의 각 요소를 출력해주는 메소드
	static void printItem(int[] scores) {
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
	}
}
