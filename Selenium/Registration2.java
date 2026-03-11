package basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Registration2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> lstEle=driver.findElements(By.name("gender"));
		Iterator<WebElement> i=lstEle.iterator();
		while(i.hasNext())
		{
			WebElement ele=i.next();
			
			//System.out.println(ele.getAttribute("value"));
			if(ele.getAttribute("value").equals("male"))
			{
				ele.click();
				break;
			}
		}
		
//		driver.findElement(By.id("sunday")).click();
//		driver.findElement(By.id("monday")).click();
//		driver.findElement(By.id("friday")).click();
		List<WebElement> lstDays=driver.findElements(By.cssSelector("input[type='checkbox' class='form-check-input']"));
		System.out.println(lstDays.size());
		
		
		
	}

}
