package ch08.sec10.exam02;

public class MainExample {
	public static void main(String[] args) {
 
		A[] arr = new A[5];	//[null][null][null][null][null]
		arr[0] = new B();	// A()
		arr[1] = new B();	//A()
		arr[2] = new C();	//A()
		arr[3] = new D();	//A()
		arr[4] = new E();	//A()
 
		for(A a : arr)
			a.action();
 
  
	}
}
