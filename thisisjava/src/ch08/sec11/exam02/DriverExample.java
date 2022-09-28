package ch08.sec11.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver drive = new Driver();
		drive.drive(new Taxi());
		drive.drive(new Bus());
		System.out.println("-----------------------------");
		
		Vehicle[] vs = {new Taxi(), new Bus()};
		for(Vehicle v : vs) {
			v.run();
		}
	}
}

class Driver {
	void drive(Vehicle v) {
		v.run();
	}
}
