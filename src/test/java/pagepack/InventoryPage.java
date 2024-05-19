package pagepack;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	

	
		private WebDriver driver;
		public InventoryPage (WebDriver driver)
		{
			this.driver=driver;
		}
		private By items= By.xpath("//div[@class='inventory_item_label']//a");
		private By btn=By.xpath("//button[text()='Add to cart']");
		private By cart=By.xpath("//a[@class='shopping_cart_link']");
		public void toSelectItem(String prod)
		{
			List<WebElement>item=driver.findElements(items);
			System.out.println("number of items in inventory page"+item.size());
			for(WebElement i:item)
			{
				if(i.getText().contains(prod))
				{
					i.click();
					break;
				}
			}
		}
		public void toCart()
		{
			driver.findElement(btn).click();
		}
		public void toclickCart()
		{
			driver.findElement(cart).click();
		}
		
	}



