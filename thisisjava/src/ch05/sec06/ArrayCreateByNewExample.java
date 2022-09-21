package ch05.sec06;

import java.util.Iterator;

public class ArrayCreateByNewExample
{
	public static void main(String[] args) {
		byte[] bArray = new byte[3];
		for(int i=0; i<bArray.length; i++)
			System.out.println(bArray[i]);
		System.out.println("\n==================");
		
		short[] sArray = new short[3];
		for(int i=0; i<sArray.length; i++) 
			System.out.println(sArray[i]);
		System.out.println("\n==================");
		
		char[] cArray = new char[3];
		for(int i=0; i<cArray.length; i++) 
			System.out.println(cArray[i]);
		System.out.println("\n==================");
		
		int[] iArray = new int[3];
		for(int i=0; i<sArray.length; i++) 
			System.out.println(iArray[i]);
		System.out.println("\n==================");
		
		float[] fArray = new float[3];
		for(int i=0; i<fArray.length; i++) 
			System.out.println(fArray[i]);
		System.out.println("\n==================");
		
		double[] dArray = new double[3];
		for(int i=0; i<dArray.length; i++) 
			System.out.println(dArray[i]);
		System.out.println("\n==================");
		
		boolean[] boolArray = new boolean[3];
		for(int i=0; i<boolArray.length; i++) 
			System.out.println(boolArray[i]);
		System.out.println("\n==================");
		
		String[] sArray1 = new String[3];
		for(int i=0; i<sArray1.length; i++) 
			System.out.println(sArray1[i]);
		System.out.println("\n==================");
	}
}
