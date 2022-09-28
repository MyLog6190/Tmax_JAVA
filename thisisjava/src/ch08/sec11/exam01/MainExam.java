package ch08.sec11.exam01;

public class MainExam {
	public static void main(String[] args) {
		// 필드의 다형성
		Car myCar = new Car();
		myCar.run();
		
		
		myCar.tire1 = new kumhoTire();
		myCar.run();
	}
}
