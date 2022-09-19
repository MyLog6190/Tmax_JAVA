package ch03.sec08;

public class BitLogicExample {
	public static void main(String[] args) {
		
		/* 
		   AND 연산  
		   101101
		 & 011001
		   ------
		   001001
		*/   
		System.out.println("45 & 25 = " + (45 & 25));
		
		/* 
		   OR 연산  
		   101101
		 | 011001
		   ------
		   111101
		*/  
		System.out.println("45 | 25 = " + (45 | 25));
		/* 
		   XOR 연산  
		   101101
		 ^ 011001
		   ------
		   110100
		*/  
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		/*
		   NOT 연산
		 ~ 00101101
		   --------
		   11010011
		   
		   1의 보수법
		   - 1->0, 0->1
		  
		   2의 보수법
		   - 1의 보수법 값 + 1
		  
		   00101101
		   -> 1의 보수법 11010010
		   -> 2의 보수법 11010011
		 */
		System.out.println("~45 = " + ~45);
		System.out.println(Integer.toBinaryString(45));
		System.out.println(Integer.toBinaryString(25));
		
		System.out.println("----------------------------");
		
	}
}
