package pkgAdv;

import java.io.FileWriter;
import java.io.IOException;

public class FileExample7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter("test1.txt");
		String str="This is my new String that i want to write in file";
		
		char[] arr=str.toCharArray();
		writer.write(arr);
		//writer.write(str);
		writer.flush();
		System.out.println("data Writen");
		
		
	}

}
