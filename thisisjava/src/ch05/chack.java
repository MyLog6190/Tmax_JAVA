package ch05;

public class chack {
	public static void main(String[] args) {
		
		String[] names = {"홍길동","일지매","임꺽정","김길동"};
		int[][] scores = {{80,83,85},{86,90,92},{88,87,95},{80,87,90}};
		
		
		System.out.println("------------------성적표--------------");
		System.out.print("|이름\t|국영\t|영어\t|수학\t|총점");
		System.out.println("\n-------------------------------------");
		
		
		int total[] = new int[scores.length];
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			int subSum = 0;
			System.out.print("|"+names[i]+"\t|");

			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t|");
				subSum = scores[j][0];
				subSum = scores[j][1];
				subSum = scores[j][2];
				sum+=scores[i][j];
			}
			if(i != scores.length)
				total[i] = subSum;
			System.out.println(subSum);
		}
		System.out.println("-------------------------------------");
		
		int sum = 0;
		int avg = 0;
		System.out.print("|총점\t|");
		for(int i = 0; i < total.length; i++) {
			System.out.print(total[i]+"\t|");
			sum += total[i];
		}
		System.out.println(sum);
		
		sum = 0;
		System.out.print("|평균\t|");
		for(int i = 0; i < total.length; i++) {
			System.out.print((total[i]/names.length)+"\t|");
			sum += total[i];
		}
		System.out.println(sum/names.length);
	}
}
