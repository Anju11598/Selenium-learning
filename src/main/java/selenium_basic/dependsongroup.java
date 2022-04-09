package selenium_basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsongroup {
	  @Test(groups={"Regression Testing","retesting"})
	  public void TestCase1() {
		  System.out.println("TestCase1 will be execute");
	  }
	  @Test(groups={"Regression Testing","smoketesting"})
	  public void TestCase2() {
		  System.out.println("TestCase2 will be execute");
	  }
	  @Test(groups={"smoketesting","sanitytesting"})
	  public void TestCase3() {
		  System.out.println("TestCase3 will be execute"); 
	  }

}
