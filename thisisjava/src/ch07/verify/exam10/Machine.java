package ch07.verify.exam10;

public abstract class Machine {
	public void powerOn() {}
	public void powerOff() {}
	public abstract void work();
}

class Computer extends Machine {
	@Override
	public void work() {}
}

