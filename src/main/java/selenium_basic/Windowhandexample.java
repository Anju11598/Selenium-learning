package selenium_basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Windowhandexample {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		String title2=driver.getTitle();
		System.out.println(title2);
		
		String Firstwindow=driver.getWindowHandle();
		System.out.println(Firstwindow);
		
		
		Set<String> all=driver.getWindowHandles();
		{
			for(String eachall: all)
				System.out.println(eachall);
		}
		
		driver.switchTo().window(Firstwindow);

}
}
