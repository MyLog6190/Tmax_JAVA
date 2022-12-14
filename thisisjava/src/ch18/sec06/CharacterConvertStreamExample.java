package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		writer("문자 변환 스트림 사용합니다");
		String data = read();
		System.out.println(data);
	}
	
	public static void writer(String str) throws Exception{
		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception{
		InputStream is = new FileInputStream("c:/temp/test.txt");
		Reader reader = new InputStreamReader(is,"UTF-8");
		char[] arr = new char[100];
		int num = reader.read(arr);
		reader.close();
		String str = new String(arr, 0, num);
		return str;
	}
}
