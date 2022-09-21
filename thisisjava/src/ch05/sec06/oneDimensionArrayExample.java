package ch05.sec06;

public class oneDimensionArrayExample {
	public static void main(String[] args) {
		
		// 배열의 인덱스 번호는 0부터 시작
		int[] intArr = {1, 2, 3, 4};
		String[] strArr = {"hello", "h1", "bye"};
		boolean[] bArr = {false, true, true, false};
		float[] fArr = {3.14f, 2.4f, 5.5f};
		
		for(int i=0; i<fArr.length; i++)
			System.out.println(fArr[i] + " ");
		
		intArr[1] = 9;
		for(int i = 0; i < intArr.length; i++)
			System.out.println(intArr[i] +  " ");
		
		
	}
}
