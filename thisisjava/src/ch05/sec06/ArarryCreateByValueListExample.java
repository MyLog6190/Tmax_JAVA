package ch05.sec06;

public class ArarryCreateByValueListExample {
	public static void main(String[] args) {
		// 배열 선언과 동시에 초기값으로 객체 생성
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		// 배열의 항목값 읽기
		int i = 0;
		System.out.println("season["+i+"] : " + season[i++] );
		System.out.println("season["+i+"] : " + season[i++] );
		System.out.println("season["+i+"] : " + season[i++] );
		System.out.println("season["+i+"] : " + season[i++] );

		// 인덱스 번호 1번의 항목 값
		// 배열의 값 변경 => 베열참조변수[index] = 바꿀값
		season[i] = "여름";
		System.out.println("seasom[1] : " + season[1]);
		
		// 배열 변수 선언과 배열 생성
		int[] scores = {83, 90, 87};
		
		// 총합과 평균
		int sum = 0;
		for(int j = 0; j < scores.length; j++) {
			sum += scores[j];
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / (double)scores.length);
	}
}
