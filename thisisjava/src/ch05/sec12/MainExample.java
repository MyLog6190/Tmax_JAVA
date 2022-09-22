package ch05.sec12;

public class MainExample {
	public static void main(String[] args) {
		MySingleTon ms = null;
		ms = MySingleTon.getInstance();
		ms.greet();
		
		// new로 객체를 생성한게 아니기 때문에
		// 객체는 1개만 생성된다.
		// new를 통해 만들어지는 객체는 멀티톤
		// 1개의 객체만 사용하게 만든 것이 싱글톤
		MySingleTon ms1 = MySingleTon.getInstance();
		MySingleTon ms2 = MySingleTon.getInstance();
		MySingleTon ms3 = MySingleTon.getInstance();
	}
}
