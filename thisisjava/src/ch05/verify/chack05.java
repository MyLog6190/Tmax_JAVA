package ch05.verify;

import java.util.Arrays;
import java.util.Scanner;

public class chack05 {
	public static void main(String[] args) {
		////////// 7
		int[] array = {1, 5, 3, 8, 2};
		int temp = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(array[0]);
		
		// 최대값
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		// 최소값
		int min = 100;
		for(int i = 0; i < array.length; i++) {
			if(max > array[i]) {
				min = array[i];
			}
		}
		
		// 오름차순 정렬
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// arrays.toString(array)
		// array 출력
		System.out.println(Arrays.toString(array));
		
		
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
		int menu = 0;
		
		while(menu != 5) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			menu = Integer.parseInt(sc.nextLine());
			
			int temp2 = 0;
			
			switch(menu) {
			case 1:
				System.out.print("학생수> ");
				countStudent  = Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("점수입력> ");
				score = new int[countStudent];
				for(int i = 0; i < score.length; i++) {
					System.out.print("score["+i+"] : ");
					score[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 3:
				int sum2 = 0;
				for(int i : score) {
					System.out.println("score : "+i);
				}
				
				break;
			case 4:
				for(int i = 0; i < score.length; i++) {
					for(int j = i+1; j < score.length; j++) {
						if(score[i] < score[j]) {
							temp2 = array[i];
							score[i] = score[j];
							score[j] = temp2;
						}
					}
				}
				
				System.out.print("최고 점수 : " + score[0]);
				int sum3 = 0;
				for(int i : score) {
					sum3 += i;
				}
				System.out.println(" 평균 : " + ((double)sum3) / score.length);
				
				
			case 5: System.out.println("종료"); break;
			}
		}
		
	}
}
