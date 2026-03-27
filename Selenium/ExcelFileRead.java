package pkgFirst;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {

	public String[][] getData()
	{
	// TODO Auto-generated method stub
		String[][] data=null;
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\login_data.xlsx");
			XSSFWorkbook wBook=new XSSFWorkbook(fis);
			XSSFSheet sheet=wBook.getSheet("Sheet1");
			int no_of_rows=sheet.getPhysicalNumberOfRows();
			data=new String[no_of_rows][2];
			for(int i=0;i<no_of_rows;i++)
			{
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(0);
				XSSFCell cell1=row.getCell(1);
				System.out.println(cell.getStringCellValue()+"\t"+cell1.getStringCellValue());
				data[i][0]=cell.getStringCellValue();
				data[i][1]=cell1.getStringCellValue();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

}
