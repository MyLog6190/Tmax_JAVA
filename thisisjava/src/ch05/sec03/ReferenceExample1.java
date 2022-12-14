package ch05.sec03;

public class ReferenceExample1 {
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");

		// 참조변수에서 ==과 !=는 주속값이 서로 같은지 다른지 비교하는 연산
		System.out.println((str1 == str2)?"동일객체를 참조합니다":"다른객체를 참조합니다." );
		System.out.println((str1 != str2)?"다른객체를 참조합니다.":"동일객체를 참조합니다" );
		
		//
		System.out.println("str1이 참조하는 객체 주소 : " + System.identityHashCode(str1) );
		System.out.println("str2이 참조하는 객체 주소 : " + System.identityHashCode(str2) );
		
		// 객체를 참조하는 변수끼리의 내용비교
		System.out.println(str1.equals(str2)?"str1과 str2가 내용이 같습니다.":"str1과 str2가 내용이 다릅니다.");
		System.out.println(!str1.equals(str2)?"str1과 str2가 내용이 다릅니다.":"str1과 str2가 내용이 같습니다.");
		
		//
		System.out.println("str1이 참조하는 객체 주소 : " + str1.hashCode() );
		System.out.println("str2이 참조하는 객체 주소 : " + str2.hashCode() );
		
		String str3 = str2;
		System.out.println((str2 == str3)?"동일객체를 참조합니다":"다른객체를 참조합니다." );
		System.out.println((str2 != str3)?"다른객체를 참조합니다.":"동일객체를 참조합니다" );;
	}
}
