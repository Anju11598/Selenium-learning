package selenium_basic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Program {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//using xpath for password
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		//using xpath for enter the login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.findElement(By.id("btnLogin")).click();
		
		//using linkText to click on forgot your password link-->need to use whole black words
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//using PartiallinkText to click on forgot your password link-->need to use partial black letters
		//driver.findElement(By.partialLinkText("Forgot ")).click();
		
		//Using Actions method-Mouse
		//WebElement leave=driver.findElement(By.xpath("//b[text()='Leave']"));
		//WebElement configure=driver.findElement(By.xpath("//a[@id='menu_leave_Configure']"));
		//WebElement leavetype=driver.findElement(By.xpath("//a[text()='Leave Types']"));
		
		//Performing Actions:
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//b[text()='Leave']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@id='menu_leave_Configure']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Leave Types']"))).click().perform();
		
		//Using Keyboard actions method:
		//action.sendKeys(Keys.TAB).perform();
		//action.sendKeys("admin123").perform();
		//action.sendKeys(Keys.ENTER).perform();
		
		

		
		

	}

}
