package ch05;

import java.util.Scanner;

public class chack05 {
	public static void main(String[] args) {
		
		////////// 7
		int[] array = {1, 5, 3, 8, 2};
		int temp = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length - 1; j++) {
				if(array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(array[0]);
		
		
		//////// 8
		int[][] array1 = {
			{85, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int length = 0;
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				sum += array1[i][j];
			}
			length += array1[i].length;
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum/length );
		
		/////// 9
		Scanner sc = new Scanner(System.in);
		int countStudent = 0;;
		int score[] = null;
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			int temp2 = 0;
			
			switch(menu) {
			case 1:
				System.out.print("학생수> ");
				countStudent  = Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.print("점수입력> ");
				score = new int[countStudent];
				for(int i = 0; i < score.length; i++) {
					System.out.print("score["+i+"] : ");
					score[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 3:
				for(int i : score) {
					System.out.println(i);
				}
			case 4:
				for(int i = 0; i < score.length; i++) {
					for(int j = i+1; j < score.length - 1; j++) {
						if(score[i] < score[j]) {
							temp2 = array[i];
							score[i] = score[j];
							score[j] = temp2;
						}
					}
				}
				System.out.println("최고 점수 : " + score[0]);
				int sum2 = 0;
				for(int i : score) {
					sum2 += i;
					System.out.println(i);
				}
			case 5:   break;
			}
		}
		
	}
}
