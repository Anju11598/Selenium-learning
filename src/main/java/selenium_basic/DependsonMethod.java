package selenium_basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethod {
	  @Test
	  public void TestCase1() {
		  System.out.println("TestCase1 will be execute");
	  }
	  @Test(dependsOnMethods="TestCase1")
	  public void TestCase2() {
		  System.out.println("TestCase2 will be execute");
		  Assert.assertEquals("abc", "xyz");
	  }
	  @Test(dependsOnMethods="TestCase2",alwaysRun=true)
	  public void TestCase3() {
		  System.out.println("TestCase3 will be execute"); 
	  }

}
