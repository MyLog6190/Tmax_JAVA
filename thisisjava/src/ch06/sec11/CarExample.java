package ch06.sec11;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car[] cars = {car1, car2, car3};
		
		for(Car car : cars) {
			System.out.println(car); // toString 자동실행
		}
		
	}
}

class Car {
	final String model = "소나타";
	static int sno = 1;
	
	String info;
	
	public Car() {
		info = model + sno++;
	}

	@Override
	public String toString() {
		return "Car [info=" + info + "]";
	}
}
