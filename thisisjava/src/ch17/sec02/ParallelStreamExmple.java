package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExmple {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 내부반복자
		Stream<String> paralleStream = list.parallelStream();
		paralleStream.forEach(t -> 
		System.out.println(t + ":" + Thread.currentThread().getName()));
	}
}
