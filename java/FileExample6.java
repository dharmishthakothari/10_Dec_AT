package pkgAdv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Dec10_8_9\\src\\pkgAdv\\Example1.java");
		int i;
		do {
			i=reader.read();
			System.out.print((char)i);
		}while(i!=-1);
		
	}

}
