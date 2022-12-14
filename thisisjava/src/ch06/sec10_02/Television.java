package ch06.sec10_02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	// static 초기화 블럭
	static {
		info = company + "-" + model; // static블럭에 non-static맴버 올수 없음. + sno
	}
	
	static int seq;
	
	// 인스턴스 맴버
	String sno;
	
	// 인스턴스 초기화 블럭
	{
		sno = info + ++seq; // 인스턴스 블럭에 static맴버 가능
	}
	
	public static void main(String[] args) {
		
		Television tv1 = new Television();
		Television tv2 = new Television();
		Television tv3 = new Television();
		Television tv4 = new Television();
		
		Television[] tvs = {tv1, tv2, tv3, tv4};
		
		for(Television tv : tvs) {
			System.out.println(tv.sno);
		}
	}
}
