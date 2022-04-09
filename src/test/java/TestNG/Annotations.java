package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void Testcase1() {
	  System.out.println("Testcase1");
  }
  @Test
  public void Testcase2() {
	  System.out.println("Testcase2");
  }
  @Test
  public void Testcase3() {
	  System.out.println("Testcase3");
  }


  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod:Launch Application");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod:Close the Application");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass:Setup Testdata");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass:Clear Testdata");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest:Open DB");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest:Close DB");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite:Do Smoke Testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite:Generate Reports");
  }

}
