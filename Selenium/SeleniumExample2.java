package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. open browser
		WebDriver driver=new FirefoxDriver();
		
		//2. url open
		driver.get("https://www.selenium.dev/");
		
		System.out.println(driver.getTitle());
		
		//3. menu click
		WebElement eleDownload=driver.findElement(By.linkText("Downloads"));
		eleDownload.click();
		
		
//		4. get title
		
		String title=driver.getTitle();
		System.out.println(title);
		
//		5. menu click 
//		5. get title
//		6. quit
		
		
	}

}
