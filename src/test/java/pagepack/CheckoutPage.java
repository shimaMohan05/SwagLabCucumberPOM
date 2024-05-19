package pagepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	private WebDriver driver;
	public CheckoutPage (WebDriver driver)
	{
		this.driver=driver;
	}
	private By fname =By.id("first-name");
	private By lname =By.id("last-name");
	private By zip =By.id("postal-code");
	private By remove=By.xpath("//button[text()='Cancel']");
	private By cont=By.id("continue");
	
	public void toEnterDetails(String fn,String ln,String zp)
	{
		driver.findElement(fname).sendKeys(fn);
		driver.findElement(lname).sendKeys(ln);
		driver.findElement(zip).sendKeys(zp);
	}
	
	public void toCont()
	{
		driver.findElement(cont).click();
	}
	

}
