package ch07.verify.exam11;

public class MainActivity extends Activity{
	@Override
	public void onCreate(){
		System.out.println("추가적인 실행내용");
	}
	
	public static void main(String[] args) {
		MainActivity ma = new MainActivity();
		
	}
}

class Activity {
	public void onCreate() {
		System.out.println("기본적인 실행 내용");
	}
}