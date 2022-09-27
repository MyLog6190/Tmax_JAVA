package ch07.sec08.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		// 매개변수의 다형성
		Bus bus = new Bus();
		
		// Vehicle타입으로 변환(Promotion)
		driver.drive(bus); 
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		// new Bus()객체가 Vehicle로 변환되어서 전달
		driver.drive(new Bus());
	}
}
