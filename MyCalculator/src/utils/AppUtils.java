package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtils 
{
	public static WebDriver driver;
	public static String url = "http://calc.qedgetech.com/";
	
	@BeforeTest
	public static void launchApp()
	{
		System.setProperty("WebDriver.chrome.driver", "chrome.driver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	}
	@AfterTest
	public static void closeApp()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
}
