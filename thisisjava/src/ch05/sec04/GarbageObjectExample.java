package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		// String타입 객체는 리터럴로 생성기 new String으로 자동생성
		String hobby = "여행"; 
		System.out.println(hobby.hashCode());
		
		// null은 기본타입에서는 사용불가, 참조타입의 초기화로 사용됨
		// hobby가 null로 바뀌면서 더이상 참조 되지 않는 "여행"값은 가비지콜렉터가 
		// 자동으로 삭제시킨다.
		hobby = null;
		// null pointer 예외발생 java.lang.NullPointerException
		System.out.println(hobby.hashCode());
		
//		char c = '여';
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2 : " + kind2 );
	}
}
