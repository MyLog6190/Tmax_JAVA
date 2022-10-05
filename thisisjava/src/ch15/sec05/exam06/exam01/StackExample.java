package ch15.sec05.exam06.exam01;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 꺼내기 pop()
		while(!coinBox.isEmpty()) {
			// 제일 위에 있는 객체 보여주기
			System.out.println(coinBox.peek());
			
			// 제일 위에 있는 객체 꺼내고 삭제하기
			coinBox.pop();
		}
	}
}
