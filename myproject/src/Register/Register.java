package Register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Register {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

		@Test
		public void LoginwithValidCredential()
		{
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.id("name")).sendKeys("Rajnish");
		driver.findElement(By.id("email")).sendKeys("rajnish071199@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rajnish@123");
		
		// Xpath for SVG Tag webelement.
		driver.findElement(By.xpath("//*[@fill='currentColor'][1]")).click();

		}
		
		@AfterTest
		public void close() {
			driver.close();
		}
	
}
