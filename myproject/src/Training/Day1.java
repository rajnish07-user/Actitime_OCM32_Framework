package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Day1 {

		
		
		@Test
		public void testbrowser()
		{
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("hello");
		driver.quit();

		}
		
	
	
}
