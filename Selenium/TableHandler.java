package basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//#HTML1 > div.widget-content > table > tbody > tr:nth-child(2) > td:nth-child(1)
		
//		String data=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[2]/td[1]")).getText();
//		System.out.println(data);
//		data=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[2]/td[2]")).getText();
//		System.out.println(data);
//		data=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[2]/td[3]")).getText();
//		System.out.println(data);
//		
////second row		
//		data=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[3]/td[1]")).getText();
//		System.out.println(data);
//		data=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[3]/td[2]")).getText();
//		System.out.println(data);
//		data=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[3]/td[3]")).getText();
//		System.out.println(data);

		List<WebElement> lst=driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr"));
		System.out.println(lst.size());
		Iterator<WebElement> iter=lst.iterator();
		for(int i=2;i<=lst.size();i++)
		{
			WebElement eleBName=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+"]/td[1]"));
			if(eleBName.getText().contains("Selenium"))
			{
				WebElement eleAuth=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+"]/td[2]"));
				WebElement eleSub=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+"]/td[3]"));
				WebElement elePrice=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+"]/td[4]"));
				System.out.println(eleBName.getText()+"\t"+eleAuth.getText()+"\t"+eleSub.getText()+"\t"+elePrice.getText());
			}
		}
		
	}

}
