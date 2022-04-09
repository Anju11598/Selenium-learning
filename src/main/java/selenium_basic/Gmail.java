package selenium_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Gmail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("annsiva143@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aju2021$");
		//driver.findElement(By.name("password")).sendKeys("Aju2021$");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();
	

	}

}
