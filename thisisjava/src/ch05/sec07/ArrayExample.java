package ch05.sec07;

public class ArrayExample {
	public static void main(String[] args) {
		int arr[] = new int[3];
		arr[0] = 10;
		arr[0] += 20; 
		arr[0] += 30;
		
		arr[2] += 30;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int result = arr[0] + arr[2]; // 첫번재 요소에 저장된 값 + 세번째 요소에 저장된 값의 결과물 result에 저장
		System.out.println(result);
		
		int[][][][] dim3Arr = new int[2][3][3][3];
	}
}
