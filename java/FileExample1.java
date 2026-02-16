package pkgAdv;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\Admin\\Documents");
		System.out.println(file.canRead()+"\t"+file.canWrite());
		System.out.println(file.isDirectory()+"\t"+file.isFile());
		
		String[] str=file.list();
		//for each loop
		for(String s:str)
		{
			// check s is directory or file
			System.out.println(s);
			
			
		}
		
	}

}
