package ch09.verify.exam04;

/////////// 4
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Engine engine = new Car.Engine(); 
		Car.Tire tire = myCar.new Tire();
	}
}

class Car {
	class Tire {}
	static class Engine {}
}