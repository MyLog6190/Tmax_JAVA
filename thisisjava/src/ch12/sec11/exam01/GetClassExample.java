package ch12.sec11.exam01;


public class GetClassExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Car.class;
		
		System.out.println("패키지: " + clazz.getPackageName());
		System.out.println("클래스이름: " + clazz.getSimpleName());
		System.out.println("클래스경로이름: " + clazz.getName());
		
		Class clazz2 = Class.forName("ch12.sec11.exam01.Car");
		System.out.println("패키지: " + clazz2.getPackageName());
		System.out.println("클래스이름: " + clazz2.getSimpleName());
		System.out.println("클래스경로이름: " + clazz2.getName());
		
		Car car2 = (Car)clazz2.newInstance();
		
		Car car = new Car();
		Class clazz3 = car.getClass();//인스턴스 참조변수에서 정보얻기
		System.out.println("패키지: "+clazz3.getPackageName());
		System.out.println("클래스이름: "+clazz3.getSimpleName());
		System.out.println("클래스경로및이름: "+clazz3.getName());
	}
}
