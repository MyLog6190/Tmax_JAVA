package ch06.sec02;

public class Calculator {
	
	static double calc(int x, int y, String op) {
		double  result = 0.0;
		switch(op) {
		case "+" : result = x + y; break;
		case "-" : result = x - y; break;
		case "x" : result = x * y; break;
		case "/" : result = x / y; break;
		}
		
		return 1.0;
	}
}
