package ch08.verify.exam05;

/////////// 5
public class TV implements Remocon{
	@Override
	public void powerOn() {
		System.out.println("TV 켰습니다.");
	}
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}

}

interface Remocon {
	public void powerOn();
}