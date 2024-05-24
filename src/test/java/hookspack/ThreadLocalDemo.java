package hookspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadLocalDemo {
	public static WebDriver driver;
//	public static URI uri;

	public static ThreadLocal<WebDriver> tl=new ThreadLocal<WebDriver>();
	public static WebDriver getdriver()
	{
		return tl.get();
	}
	
	public static WebDriver setDriver()
	{  /*try {
		uri=new URI("http://localhost:4444");
		ChromeOptions options=new ChromeOptions();
		driver=new RemoteWebDriver(uri.toURL(),options);
	} catch (URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		
		driver=new ChromeDriver();
		
		tl.set(driver);
		return driver;
	}
	

}
