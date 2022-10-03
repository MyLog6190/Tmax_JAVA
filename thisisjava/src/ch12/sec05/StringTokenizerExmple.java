package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExmple {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		
		// split 문자열을 특정기준으로 잘라서 배열로 리턴해주는 메소드
		String[] arr = data1.split("&|,");
		
		for(String token : arr) {
			System.out.println(token);
		}
		
		System.out.println("--------");
		StringTokenizer st = new StringTokenizer("홍길동/이수홍/박연수", "/");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
