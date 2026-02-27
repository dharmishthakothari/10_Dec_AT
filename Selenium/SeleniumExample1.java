package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser open
		WebDriver driver=new ChromeDriver();
		
		//url open
		driver.get("https://www.google.com");
		
		//browser close
		driver.quit();
		
		
	}

}
