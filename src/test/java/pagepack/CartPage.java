package pagepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	private WebDriver driver;
	public CartPage (WebDriver driver)
	{
		this.driver=driver;
	}
	private By remove=By.xpath("//button[text()='Remove']");
	private By conti=By.xpath("//button[text()='Continue Shopping']");
	private By checkout=By.xpath("//button[text()='Checkout']");
	public void toRemove()
	{
		driver.findElement(remove).click();
	}
	public void toContinue()
	{
		driver.findElement(conti).click();
	}
	public void toCheckOut()
	{
		driver.findElement(checkout).click();
	}

}
