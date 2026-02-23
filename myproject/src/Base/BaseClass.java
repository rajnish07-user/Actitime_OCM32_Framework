package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	@BeforeMethod 
	public void configBM()
	{
		 driver=new ChromeDriver();
		 driver.get("https://demoapps.qspiders.com/ui/login");		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	/*@AfterMethod 
	public void configAM()
	{

    driver.quit();
		
	}*/
}

