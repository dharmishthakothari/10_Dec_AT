package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationMerTours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
//		if(driver.getTitle().contains("register"))
//		{
			driver.findElement(By.name("firstName")).sendKeys("User2");
			driver.findElement(By.name("lastName")).sendKeys("User1");
			driver.findElement(By.name("phone")).sendKeys("1234567890");
			driver.findElement(By.id("userName")).sendKeys("user2@gmail.com");
			WebElement eleCountry=driver.findElement(By.name("country"));
			Select selCountry=new Select(eleCountry);
			// index , visibletext , value
			selCountry.selectByValue("AUSTRIA");
			driver.findElement(By.id("email")).sendKeys("user2@gmail.com");
			driver.findElement(By.name("password")).sendKeys("user2@123");
			driver.findElement(By.name("confirmPassword")).sendKeys("user2@123");
			driver.findElement(By.name("submit")).click();
//		}else
//		{
//			System.out.println("Registration page not loaded");
//		}
			driver.quit();
		}
	}


