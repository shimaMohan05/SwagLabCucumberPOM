package pagepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		
	}
	private By uname=By.id("user-name");
	private By pword=By.id("password");
	private By btn=By.id("login-button");
	
	
	
public void  toEnterCredentials(String un,String pw)
{
	driver.findElement(uname).sendKeys(un);
	driver.findElement(pword).sendKeys(pw);
	
	}
public void toLogin()
{driver.findElement(btn).click();
	}
}
