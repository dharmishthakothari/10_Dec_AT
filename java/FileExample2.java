package pkgAdv;

import java.io.FileInputStream;

public class FileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Dec10_8_9\\src\\pkgAdv\\Example1.java");
//			int i=fis.read();
//			//reading whole file
//			while(i!=-1)
//			{
//				i=fis.read();
//				System.out.print((char)i);
//			}
			//read 100 letters
			int i=0;
			for(int j=0;j<10;j++)
			{
				i=fis.read();
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
