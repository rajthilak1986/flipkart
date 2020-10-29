package TEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.loginpom;

public class logintest {

	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
		loginpom log = new loginpom(driver);
		log.enterusername("admin");
		log.enterpassword("manager");
		log.login();
	}
}
