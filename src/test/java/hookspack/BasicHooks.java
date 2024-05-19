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
		String url=UtilityClass.getConfigDetails("url");
		driver.get(url);
		
		
	}
	
	
	
	@After
	public void tearDown()
	{
		driver.quit();
		
	}

}
