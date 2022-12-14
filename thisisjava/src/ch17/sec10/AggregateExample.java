package ch17.sec10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		long count = Arrays.stream(arr)
				.filter(value -> (value % 2) == 0)
				.count();
		System.out.println("2의 배수 : " + count);
		
		int max = Arrays.stream(arr).filter(n -> n%2 == 0).max().getAsInt();
		System.out.println(max);
 	}
}
