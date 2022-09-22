package ch05.sec08;

public class ArrayReferenceObject {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[1]);
		// 참조하고있는 객체의 내용 비교(equivalence)
		System.out.println(strArray[0].equals(strArray[2])); 
		
	}
}