package selenium_basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	  @Test
	  public void TestCase1() {
		  System.out.println("TestCase1 will be execute");
	  }
	  @Test
	  public void TestCase2() {
		  System.out.println("TestCase2 will be execute");
	  }
	  @Test
	  public void TestCase3() {
		  System.out.println("TestCase3 will be execute");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Launch the Application");
	  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Close the Application");
	  }
}