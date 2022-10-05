package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) {
		
		try {
			Reader reader = null;
			
			reader = new FileReader("c:/temp/test1.text");
			
			while(true) {
				int data = reader.read();
				if(data == -1) {
					break;
				}
				System.out.println((char)data);
			}
			
			reader.close();
			System.out.println("----------------");
			
			reader = new FileReader("c:/temp/test1.text");
			// 버퍼
			char[] arr = new char[100];
			while(true) {
				int num = reader.read(arr);
				if(num == -1) break;
				
				for(int i=0; i<num; i++) {
					System.out.println(arr[i]);
				}
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
