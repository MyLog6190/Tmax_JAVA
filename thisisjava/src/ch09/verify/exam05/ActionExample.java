package ch09.verify.exam05;

/////////// 5
public class ActionExample {
	public static void main(String[] args) {
		Action action = () -> {System.out.println("복사합니다.");};
		action.work();
	}
}

interface Action {
	public void work();
}
