package ch07.sec06.package2;
import ch07.sec06.package1.A;

public class C {
	void m1() {
		// protected로 선언된 생성자는 다른 패키지에서 접근 불가
		// 다른 패키지(protected)에서 접근불가
		A a = new A(); 		
		// 다른 패키지(protected) 접근 불가
		a.fleid = "A";
		
	}
}
