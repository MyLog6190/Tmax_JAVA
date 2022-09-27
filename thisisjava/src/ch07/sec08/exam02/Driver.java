package ch07.sec08.exam02;

// 참조변수 instanceof
// 참조변수가 해당 타입으로 바꿀수 있으면 true 아니면 false

public class Driver {
	// Vehicle 타입만 매개변수로 받음
	public void drive(Vehicle vehicle) {
		vehicle.run();
		// 원래 Taxi객체로 만들어져서 Vehicle로 반환되어서 넘어왔는지 true / false
		if( vehicle instanceof Taxi) {
			Taxi taxi = (Taxi)vehicle;
		
		//원래 Bus객체로 만들어져서 Vehicle로 변환되어서 넘어왔는지 true / false 	
		}else if( vehicle instanceof Bus){
			Bus bus = (Bus)vehicle;
		}
	}
}
