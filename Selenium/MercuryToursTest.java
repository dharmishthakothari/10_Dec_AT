package pkgFirst;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class MercuryToursTest {
  @Test
  public void validLogin() {
		WebElement eleuName=driver.findElement(By.name("userName"));
		eleuName.sendKeys("a");
		
		//enter password
		WebElement elePass=driver.findElement(By.name("password"));
		elePass.sendKeys("a");
		
		//click on sumbit
//		driver.findElement(By.name("submit")).click();
		WebElement eleSubmit=driver.findElement(By.name("submit"));
		eleSubmit.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains("login_sucess"));
		String expectedURL="https://demo.guru99.com/test/newtou/login_sucess.php";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL "+actualURL);
		//Assert.assertEquals(actualURL, expectedURL);
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(actualURL, expectedURL);
		System.out.println("END OF POSITIVE TESTING");
	  
  }
  
  @Test(enabled = false)
  public void invalidLogin()
  {
	  WebElement eleuName=driver.findElement(By.name("userName"));
		eleuName.sendKeys("fgfdgfdg");
		
		//enter password
		WebElement elePass=driver.findElement(By.name("password"));
		elePass.sendKeys("a");
		
		//click on sumbit
//		driver.findElement(By.name("submit")).click();
		WebElement eleSubmit=driver.findElement(By.name("submit"));
		eleSubmit.click();
  }
  @Test(enabled = false)
  public void blanckLogin()
  {
//	  WebElement eleuName=driver.findElement(By.name("userName"));
//		eleuName.sendKeys("");
//		
//		//enter password
//		WebElement elePass=driver.findElement(By.name("password"));
//		
		
		//click on sumbit
//		driver.findElement(By.name("submit")).click();
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
