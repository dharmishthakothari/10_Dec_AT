package pkgFirst;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@DataProvider(name = "login")
	public String[][] loginData()
	{
		String data[][]= {{"a","a"},{"abc","abc@123"},{"ggg","bbb"},{"ritesh","ritesh@123"}};
		return data;
	}
	
	
  @Test(dataProvider = "login")
  public void f(String username,String password) {
	  System.out.println(username+"\t"+password);
	  
  }
}
