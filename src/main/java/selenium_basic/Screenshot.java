package selenium_basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				//driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.get("https://us02web.zoom.us/postattendee?mn=LNR6fw_OlG0sW8gxQZEUDhKPVU3XHrEk0ESU.zBqwWMGjlXsFR5X4&id=39");
				//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				//driver.findElement(By.id("txtPassword")).sendKeys("admin123");				
				//driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.manage().window().maximize();
				WebElement meeting=driver.findElement(By.id("content-wrapper"));
				File source=meeting.getScreenshotAs(OutputType.FILE);
				File target=new File("./Screenshotsaver/Meetingpage.png");
				FileUtils.copyFile(source, target);
			
		// TODO Auto-generated method stub

	}

}
