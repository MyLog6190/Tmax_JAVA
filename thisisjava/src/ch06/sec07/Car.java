package ch06.sec07;

public class Car {
	
	// static영역에는 동일한 이름의 변수, 메소드, 쿨래스는 하나만 로드됨
	// 생성자 오버로딩(overloading)
	// 생성자 선언부 <- signature가 다르면 생성자로 인식(jvm)
	// 생성자 이름이 같아도 매개변수가 다르면 Static다른 생성자로 인식
	Car(){}
	Car(String model, String color){}
	Car(String model, int maxSpeed){}
	Car(int maxSpeed, String model){}
	Car(String model, String color, int maxSpeed){}
}
