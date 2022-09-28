package ch08.sec05;

public class Audio implements RemoCon {

	@Override
	public void turnOn() {
		System.out.println(this.getClass().getSimpleName() + 
						   "를 켭니다.");
	}

}
