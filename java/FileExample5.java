package pkgAdv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Dec10_8_9\\src\\pkgAdv\\FileExample4.java");
		FileOutputStream fos=new FileOutputStream("copiedFile.txt");
		int i;
		while(true)
		{
			i=fis.read();
			if(i==-1)
				break;
			fos.write(i);
		}
		System.out.println("File copied");
		
	}

}
