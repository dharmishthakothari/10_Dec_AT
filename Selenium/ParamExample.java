package pkgFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamExample {
	
 @Parameters({"username","password","browser"})
  @Test
  public void f(String username,String pass,String browser) {
	 System.out.println(username);
	 WebDriver driver;
	 if(browser.contains("chrome"))
	 {
		 driver=new ChromeDriver();
	 }else if(browser.contains("firefox"))
	 {
	 driver=new FirefoxDriver();
	 }
	 else
	 {
		 driver=new EdgeDriver();
	 }
	 
	 
  }
}
