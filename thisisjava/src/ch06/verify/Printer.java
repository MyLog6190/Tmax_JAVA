package ch06.verify;
/////// 16
public class Printer {
	public void println(int i) {
		System.out.println(i);
	}
	
	public void println(boolean b) {
		System.out.println(b);
	}
	
	public void println(double d) {
		System.out.println(d);
	}
	
	public void println(String str) {
		System.out.println(str);
	}
	
	
}

//////17
class Printer2 {
	static public void println2(int i) {
		System.out.println(i);
	}
	
	static public void println2(boolean b) {
		System.out.println(b);
	}
	
	static public void println2(double d) {
		System.out.println(d);
	}
	
	static public void println2(String str) {
		System.out.println(str);
	}
}

class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길");
		
		Printer2.println2(10);
		Printer2.println2(true);
		Printer2.println2(5.7);
		Printer2.println2("홍길");
	}
}