package Button;

import java.time.Duration;
import java.util.PriorityQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DefaultClickButton {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test (priority=1)
	public void ClickYesButton() {

		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.findElement(By.id("btn")).click();
		WebElement E1=driver.findElement(By.xpath("//span[@class=\"text-green-600 p-1 px-2 ms-2 rounded-md\"]"));
		String E2 = E1.getText();
		System.out.println(E2);
	}
	
	@Test (priority=2)
	public void ClickNoButton() {
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.findElement(By.id("btn_two")).click();
		WebElement s1=driver.findElement(By.xpath("//span[@class=\"text-green-600 p-1 px-2 ms-2 rounded-md\"]"));
		String s2=s1.getText();
		System.out.println(s2);
	}
	
	@AfterTest
	void closethewindow() {
		driver.quit();
	}
}
