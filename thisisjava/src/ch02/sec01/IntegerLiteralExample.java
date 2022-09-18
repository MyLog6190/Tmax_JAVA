package ch02.sec01;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		/*
		 * 2진수
		 * 0B를 앞에 붙이면 2진수로 값을 넣을 수 있다.
		 * 2진수(binary)표기법 : 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0 => 8+0+2+1=>15
		 * */
		int var1 = 0b1011;
		
		/*
		 * 8진수
		 * 앞에 0을 붙이면 8진수로 값을 넣을 수 있다
		 * 8진수표기법:2*8^2 + 0*8^1 + 6*8^0=2*64 + 0+6 =>134 
		 * */
		int var2 = 0206;
		
		// 10진수
		int var3 = 365;
		
		/*
		 * 16진수
		 * 0x앞에 붙이면 16진수로 값을 넣을 수 있다.
		 * 16진수표기법:11*16^1 + 3*16^0 => 11*16 + 3*1 =>176+3=179
		 * */
		int var4 = 0xB3;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	
	}
}
