package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Ce%7Cfacebook%7C&placement=&creative=550525804944&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMInuLln8nb9gIVvJhmAh10kAiXEAAYASAAEgJ0RfD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Anju");
		driver.findElement(By.name("lastname")).sendKeys("Siva");
		driver.findElement(By.name("reg_email__")).sendKeys("7395946094");
		driver.findElement(By.id("password_step_input")).sendKeys("Anju@123");
		Select date=new Select(driver.findElement(By.id("day")));
		Select month=new Select(driver.findElement(By.id("month")));
		Select year=new Select(driver.findElement(By.id("year")));
		date.selectByValue("11");
		month.selectByIndex(4);
		year.selectByVisibleText("1998");

				
	}

}
