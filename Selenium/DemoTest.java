package pkgFirst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {

	@AfterClass
	public void afterClass()
	{
		System.out.println("in after class");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("in before class");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("in After method ");
	}
	
  @Test(groups = {"math"})
  public void f() {
	  
	  System.out.println("Hello World");
	  
  }
  
  @Test(groups = {"statstics"},invocationCount = 3)
  public void testMethod()
  {
	  System.out.println("in test method");
  }
  
  @Test(groups = {"math"})
  public void testMethod1()
  {
	  System.out.println("Welcome in testng");
  }
  
}
