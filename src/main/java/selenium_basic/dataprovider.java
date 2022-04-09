package selenium_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider="Testdata")
	public void Testcase1(String username, String password) {
		//driver.findElement(By.id("txtUsername")).sendKeys(username);
		  //driver.findElement(By.id("txtPassword")).sendKeys(password);
		  //driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}
	
	@DataProvider(name="Testdata")
	public Object[][] Getdata()
	{
		Object[][] data=new Object[2][2];
				
				data[0][0]="annsiva143@gmail.com";//github-pwd-Aju2022$
				data[0][1]="Aju2021$";
				data[1][0]="Anjusivachandran@gmail.com";
				data[1][1]="Anjusiva@123";
		
		
		return data;		
		
		
	}
	
	//@AfterMethod
	//public void closemethod() {
		//driver.close();
	}


