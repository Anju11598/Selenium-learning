package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame lazyloaded")));
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement accept=driver.findElement(By.xpath("//li[text()='Accepted Elements']"));
		Actions action=new Actions(driver);
		action.moveToElement(accept).click().perform();
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).perform();	

	}

}
