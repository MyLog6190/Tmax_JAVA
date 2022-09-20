package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		// 배열 선언
		// [] 변수;
		// int타입의 값만 저장하는 1차원 배열 선언
		// 배열 선언시 stack에 저장된다.
		int[] arr1; // stack
		int[] arr2; // stack
		
		// 배열 객체 생성
		// new 타입[저장길이];
		// 길이가 3인 (int타입의 값 3개 저장할수 있는 공간) 배열 객체 생성
		// 배열 선언만 할 떄는 stack에 저장되지만 
		// new을 통해 객체 생성하면 heap에 저장된다
		arr1 = new int[3];
		
		// 생성된 int타입 배열에 각 인덱스에 해당하는 요소에 int타입 값을 저장
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		// 초기값으로 배열 객체 만들기
		arr2 = new int[] {1, 2, 3};
		
		// 초기값으로 배열 생성(베열 선언과 동시에 생성)
		int[] arr3 = {1, 2, 3};
		
		int[] arr4 = arr3;
		
		// 주소값 비교
		// 참조변수의 == 연산은 변수에 저장된 주소 값 비교
		System.out.println(arr1 == arr2);
		System.out.println(arr3 == arr4);
		System.out.println(arr2 != arr3);
	}
}
