package ch05;

public class chack {
	public static void main(String[] args) {
		
		String[] names = {"홍길동","일지매","임꺽정"};
		int[][] scores = {{80,83,85},{86,90,92},{88,87,95}};
		
		
		System.out.println("------------------성적표--------------");
		System.out.print("|이름\t|국영\t|영어\t|수학\t|총점");
		System.out.println("\n-------------------------------------");
		
		int guc = 0;
		int eng = 0;
		int math = 0;
		int total[] = new int[4];
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			System.out.print("|"+names[i]+"\t|");

			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t|");
				if(j == 0)
					guc += scores[i][j];
				else if(j == 1)
					eng += scores[i][j];
				else
					math += scores[i][j];
				subSum = scores[j][3];
				sum+=scores[i][j];
			}
			System.out.println(sum);
		}
		
		total[0] = guc;
		total[1] = eng;
		total[2] = math; 
		System.out.println("-------------------------------------");
		
		int sum = 0;
		System.out.print("|총점\t|");
		for(int i = 0; i < total.length; i++) {
			System.out.print(total[i]+"\t|");
			sum += total[i];
		}
		System.out.println(sum);
	}
}
