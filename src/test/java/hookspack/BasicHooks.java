package hookspack;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class BasicHooks {
	public WebDriver driver;
	
	@Before
	public void basicSteps()
	{
		driver=ThreadLocalDemo.setDriver();
		driver.get("https://www.saucedemo.com/");
		
		
	}
	
	
	
	@After
	public void tearDown()
	{
		driver.quit();
		
	}

}
