package pkgFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@DataProvider(name = "login")
	public String[][] loginData()
	{
		//String data[][]= {{"a","a"},{"abc","abc@123"},{"ggg","bbb"},{"ritesh","ritesh@123"}};
		ExcelFileRead obj=new ExcelFileRead();
		String data[][]=obj.getData();
		return data;
	}
	
	
//  @Test(dataProvider = "login")
//  public void f(String username,String password) {
//	  System.out.println(username+"\t"+password);
//	  
//  }
	@Test(dataProvider = "login")
	  public void validLogin(String username,String password) {
			WebElement eleuName=driver.findElement(By.name("userName"));
			eleuName.sendKeys(username);
			
			//enter password
			WebElement elePass=driver.findElement(By.name("password"));
			elePass.sendKeys(password);
			
			//click on sumbit
//			driver.findElement(By.name("submit")).click();
			WebElement eleSubmit=driver.findElement(By.name("submit"));
			eleSubmit.click();
	}
	 WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		  driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");

		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
		  
	  }
  
  
  
}
