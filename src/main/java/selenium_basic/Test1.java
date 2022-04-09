package selenium_basic;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	WebDriver driver;
	 
	  @BeforeTest
	  public void beforeTest() {
		  
		  WebDriverManager.chromedriver().setup();	
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
		  
	  }

	  @Test()
	  public void Login() {
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		  
	  }
	  @Test
	  public void TestCase2() throws InterruptedException {
		  Thread.sleep(3000);
		  WebElement Admin=driver.findElement(By.xpath("//b[text()='Admin']"));
		  Actions action=new Actions(driver);
		  action.moveToElement(Admin).click().perform();
	  }
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	}
}


