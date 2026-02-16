package pkgAdv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("test.txt",true);
		String data="Hello Have a great week";
		byte[] arrB=data.getBytes();
		
		//fos.write(arrB);
		fos.write(arrB, 5, 17);
		System.out.println("Data Written successfully");
		fos.close();
	}

}
