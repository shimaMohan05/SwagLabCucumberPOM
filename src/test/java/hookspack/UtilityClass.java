package hookspack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	public static String getConfigDetails(String key)
	{
		Properties p=new Properties();
		File f=new File("C:\\StaragileCodes\\eclipse-workspace-staragile\\SwagLabPOMCucum\\src\\test\\resources\\config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			p.load(fis);
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 	p.getProperty(key);
	    
	}
	public static void toTakeScreenShot(WebDriver driver)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./"+"\\screenshots\\"+System.currentTimeMillis()+"output.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void getWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
