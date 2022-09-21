package ch05.sec07;

public class MultiDimenstionalArrayByNweExample2 {
	public static void main(String[] args) {
		// 배열 항목 값 변경
		int[][] mathScores = new int[2][3];
		
		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		// 합과 평균 구하기
		int mathSum = 0;
		for(int i = 0; i < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				mathSum += mathScores[i][j];
			}
		}
		
		String[] names = {"홍길동","일지매","임꺽정"};
		int[][] scores = {{80,83,85},{86,90,92},{88,87,95}};
		System.out.println("------------------성적표--------------");
		System.out.print("|이름\t|국영\t|영어\t|수학\t|총점");
		System.out.println("\n-------------------------------------");

		for(int i=0;i<scores.length;i++) {
			int sum=0;
			System.out.print("|"+names[i]+"\t|");
			System.out.print(scores[i][0]+"\t|");
			sum+=scores[i][0];
		    System.out.print(scores[i][1]+"\t|");
		    sum+=scores[i][1];
		    System.out.print(scores[i][2]+"\t|");
		    sum+=scores[i][2];
		    System.out.println(sum);
		}
		System.out.println("-------------------------------------");
		
		
		System.out.println("------------------성적표--------------");
		System.out.print("|이름\t|국영\t|영어\t|수학\t|총점");
		System.out.println("\n-------------------------------------");
		
		
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			System.out.print("|"+names[i]+"\t|");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t|");
				sum+=scores[i][j];
			}
			System.out.println(sum);

		}
		System.out.println("-------------------------------------");
	}	
}
