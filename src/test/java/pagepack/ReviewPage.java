package pagepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewPage {
	private WebDriver driver;
	public ReviewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By summary=By.xpath("//div[@class='summary_info']//div");
	//
	private By can=By.id("cancel");
	private By fin=By.id("finish");
	
	public void getSummary()
	{
		List<WebElement>report=driver.findElements(summary);
		for(WebElement i: report)
		{
			System.out.println(i.getText());
		}
	}
	public void toFinish()
	{
		driver.findElement(fin).click();
	}

}
