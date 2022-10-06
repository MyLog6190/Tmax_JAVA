package ch18.verify.exam10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyExample {
	public static void main(String[] args) {
		String filePath = "/home/202134-365787/Downloads/test.txt";
		String copyFilePath = "/home/202134-365787/Downloads/dir/copy_test.txt";
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			FileOutputStream fos = new File(copyFilePath);
			if(fos.sist) {
				
			}
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				int data = fis.read();
				if(data == -1) break;
				fos.write(data);
			}
			
			System.out.println();
			fis.close();
			fos.close();
			bis.close();
			bos.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("원본파일이 존재하지 않습니다.");
		} catch (IOException e) {
			
		}
	}
}
