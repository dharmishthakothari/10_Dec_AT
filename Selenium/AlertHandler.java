package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("alertBtn")).click();
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		driver.findElement(By.id("confirmBtn")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		driver.findElement(By.id("promptBtn")).click();
		alert=driver.switchTo().alert();
		alert.sendKeys("Sangini");
		alert.accept();
		
	}

}
