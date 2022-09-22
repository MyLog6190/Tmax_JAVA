package ch05;

public class chack {
	public static void main(String[] args) {
		
		String[] names = {"홍길동","일지매","임꺽정","김길동"};
		int[][] scores = {{80,83,85},{86,90,92},{88,87,95},{80,87,90}};
		
		
		System.out.println("------------------성적표---------------------------");
		System.out.print("|이름\t|국영\t|영어\t|수학\t|총점\t|평균");
		System.out.println("\n----------------------------------------------");
		
		int total[] = new int[scores[0].length];
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			System.out.print("|"+names[i]+"\t|");
			
			// 향상된 for문
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t|");
				total[j] += scores[i][j];
				sum+=scores[i][j];
			}
			System.out.print(sum + "\t|");
			System.out.printf("%5.2f \n",(double)sum/scores[i].length);
		}
		
		System.out.println("-------------------------------------------------");
		
		int sum = 0;
		System.out.print("|총합\t|");
		for(int i = 0; i < total.length; i++) {
			System.out.print(total[i]+"\t|");
			sum += total[i];
		}
		System.out.print(sum  );
		System.out.printf("\t|%5.2f \n",((double)sum / (scores.length*scores[0].length)));
		System.out.println("-------------------------------------------------");
	}
}
