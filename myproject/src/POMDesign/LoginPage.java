package POMDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);;
		
	}
	
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;

	public WebElement getUser() {
		return user;
	}
	public void setUser(String arg)
	{
		user.sendKeys(arg);
		
	}
	public void setUser(WebElement user) {
		this.user = user;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public void setPass(String arg)
	{
		pass.sendKeys(arg);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	

}
