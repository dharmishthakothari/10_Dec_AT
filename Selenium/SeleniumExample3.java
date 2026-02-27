package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//to maximize
		driver.manage().window().maximize();
		
		//enter username
		WebElement eleuName=driver.findElement(By.name("userName"));
		eleuName.sendKeys("a");
		
		//enter password
		WebElement elePass=driver.findElement(By.name("password"));
		elePass.sendKeys("a");
		
		//click on sumbit
//		driver.findElement(By.name("submit")).click();
		WebElement eleSubmit=driver.findElement(By.name("submit"));
		eleSubmit.click();
		
	}

}
