package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		
		// seed가 같으면 반복할때마다 똑같은 난수 결과 발생
		// seed가 없거나 다르면 반복할때마다 다른 난수 결과 발생
		Random random = new Random(3);
		System.out.print("선택번호 : ");
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(selectNumber));
		
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random(3);
		System.out.print("당첨번호 : ");
		for(int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(winningNumber));
		System.out.println();
		
		// 배열오름차순 정렬
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		System.out.println("정렬 후 비교");
		System.out.println(Arrays.toString(selectNumber));
		System.out.println(Arrays.toString(winningNumber));
		
		System.out.println(Arrays.equals(selectNumber, winningNumber)?"1등 당첨" : "안 당첨");
	}
}
