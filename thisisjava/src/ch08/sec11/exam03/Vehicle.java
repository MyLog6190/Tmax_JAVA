package ch08.sec11.exam03;

public interface Vehicle {
	void run();
}

class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+ "가 달립니다");
	}
	
	// 추가된 메소드
	void checkFare() {
		System.out.println("승차표 검사합니다.");
	}
	
}

class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+ "가 달립니다");
	}
	
}
