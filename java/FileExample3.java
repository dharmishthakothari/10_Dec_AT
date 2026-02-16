package pkgAdv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Dec10_8_9\\src\\pkgAdv\\Example1.java");
		byte[] arrB=new byte[50];
		
		fis.read(arrB);
		
		for(byte b:arrB)
		{
			System.out.print((char)b);
		}
		
	}

}
