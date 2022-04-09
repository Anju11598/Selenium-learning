package selenium_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarTest {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://m.redbus.in/");
		driver.manage().window().maximize();
		  
	}
	
	 @Test()
	  public void Redbusdetails() throws InterruptedException {
		 WebElement source=driver.findElement(By.xpath("//div[@id='sourceCity']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(source).click().perform();
		 Thread.sleep(3000);
		 action.sendKeys("Koyambedu").perform();
		 Thread.sleep(3000);
		 action.moveToElement(driver.findElement(By.xpath("(//span[@class='recent_sd'])[1]"))).click().perform();
		 Thread.sleep(3000);
		 WebElement destination=driver.findElement(By.xpath("//div[@id='destinationCity']"));
		 action.moveToElement(destination).click().perform();
		 
		 action.sendKeys("Bangalore").perform();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 action.moveToElement(driver.findElement(By.xpath("//span[text()='Bangalore']"))).click().perform();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 WebElement date=driver.findElement(By.xpath("//div[text()='Mar']"));
		 action.moveToElement(date).click().perform();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 //action.moveToElement(driver.findElement(By.xpath("//span[text()='30']"))).click().perform();		 
		 action.moveToElement(driver.findElement(By.id("Layer_1"))).click().perform();
		 action.moveToElement(driver.findElement(By.xpath("//span[text()='5']"))).click().perform();
		 driver.findElement(By.xpath("//button[text()='Search Buses']")).click();		 
		 
	 }
	 
	 }
	 
	
	
	


