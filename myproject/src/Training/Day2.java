package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public void testbrowser()
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("hello");
	driver.close();
	driver.quit();

	}
}
