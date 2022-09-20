package ch05.sec03;

public class ReferenceValueExample {
	public static void main(String[] args) {
		// 참조타입 변수명 = new 참조타입 생성자();
		String name1 = new String("홍길동");
		System.out.println(System.identityHashCode(name1));
		
		// name2 name3은 같은 주소값을 가진다.
		// name2와 name3은 같은 주소에서 값을 가져오고
		// name1 hashCode값은 같지만 참조하는 주소가 다르다.
		// hashCode는 실제 값 "홍길동"
		// identityHashCode는 참조하고 있는 주소 값
		String name2 = new String("홍길동");
		System.out.println(System.identityHashCode(name2));
		String name3 = name2; 
		System.out.println(System.identityHashCode(name3));
		
		// == 변수 name1의 값과 name2의 값이 같은지(참조하는 주소가 같은지) 물어봄
		if(name1 == name2) {
			System.out.println("name1과 name2가 참조하는 주소 값이 같습니다");
			System.out.println("name1 주소 값 : " + System.identityHashCode(name1));
			System.out.println("name2 주소 값 : " + System.identityHashCode(name2));
		} else {
			System.out.println("name1과 name2가 참조하는 주소 값이 다릅니다.");
			System.out.println("name1 주소 값 : " + System.identityHashCode(name1));
			System.out.println("name2 주소 값 : " + System.identityHashCode(name2));
		}
		
		// hashCode는 실제 값
		// 비교하는 객체가 동등한지 비교(equivalent)
		// 참조하는 주소 값이 달라도 실제 값이 같은지 비교
		System.out.println("--------------------");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
	}
}
