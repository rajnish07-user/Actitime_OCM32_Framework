package Button;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;

public class DoubleClickOnButton extends BaseClass{

	WebDriver driver;
	
	@BeforeTest
	void setup() {
		
	}
	
	@Test
	void DoubleClick() {
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		WebElement E1=driver.findElement(By.xpath("//button[contains(text(),\'Yes\')]"));
	
		Actions action = new Actions(driver);
		action.doubleClick(E1).perform();
		
		WebElement E2=driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md\']"));
		System.out.println(E2.getText());
	}
	
	
}
