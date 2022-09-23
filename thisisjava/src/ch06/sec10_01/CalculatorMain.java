package ch06.sec10_01;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.pi);
		System.out.println(calc.plus(10, 20));
		System.out.println(calc.minus(10, 20));
	}
}
