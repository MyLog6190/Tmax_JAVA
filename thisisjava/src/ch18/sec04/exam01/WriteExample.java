package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) {
		// 2byte단위 출력 스트링
		try {
			Writer writer = new FileWriter("c:/temp/test1.text");
			
			char a = 'A';
			writer.write(a);
			
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			writer.write("FGH");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
