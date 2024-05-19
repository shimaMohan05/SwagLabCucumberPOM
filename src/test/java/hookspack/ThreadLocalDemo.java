package hookspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadLocalDemo {
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tl=new ThreadLocal<>();
	public static WebDriver getdriver()
	{
		return tl.get();
	}
	public static WebDriver setDriver()
	{
		driver=new ChromeDriver();
		tl.set(driver);
		return driver;
	}
	

}
