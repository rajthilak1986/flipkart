package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpom {
	
	public WebDriver driver;
	public loginpom(WebDriver driver) 
	{	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement UN;
	
	@FindBy(name="pwd")
	private WebElement PWD;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LOGIN;
	

	public void enterusername(String un) 
	{
		UN.sendKeys(un);
	}
	public void enterpassword(String pwd) {
		PWD.sendKeys(pwd);
	}
	public void login() {
		LOGIN.click();
	}
}
