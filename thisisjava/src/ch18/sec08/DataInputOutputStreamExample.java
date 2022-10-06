package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/primitive.db");
		
		// 보조스트림 new 보조스트림(기본스트림)
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 기본타입출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("c:/temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		String name = dis.readUTF();
		double score = dis.readDouble();
		int order = dis.readInt();
		
		System.out.println(name + score + order);
		
		dis.close();
		dis.close();
	}
}
