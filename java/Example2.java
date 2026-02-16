package pkgAdv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Example2
{
	public static void main(String[] args) {
		try {
		//FileInputStream fis=new FileInputStream("C:\\Downloads\\fsdfdsf");
		System.out.println(10/2);
		System.out.println("End of Program");
		}
//		catch(FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Bye");
		}
		
	}
}