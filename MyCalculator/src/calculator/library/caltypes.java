package calculator.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class caltypes 
{

	
	public static  void adding() 
	{
		System.setProperty("WebDriver.chrome.driver", "chrome.driver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/input")).click();
		driver.findElement(By.xpath("//tbody/tr[3]/td[4]/input")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[5]/input")).click();
		
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input")).click();
		driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input")).click();
		driver.findElement(By.xpath("//tbody/tr[5]/td[4]/input")).click();
		driver.findElement(By.name("display")).getAttribute("value");
		
	}
	
	
	
	
	
	
	
	
	
	
}
