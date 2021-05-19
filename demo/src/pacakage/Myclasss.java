package pacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclasss {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/input")).click();
		driver.findElement(By.xpath("//tbody/tr[3]/td[4]/input")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[5]/input")).click();
		
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input")).click();
		driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input")).click();
		driver.findElement(By.xpath("//tbody/tr[5]/td[4]/input")).click();
		String resvalue = driver.findElement(By.name("display")).getAttribute("value");
		int resnum = Integer.parseInt(resvalue);
		int expval = 64;
		if (resvalue.equals(expval)) 
		{
			System.out.println("true");
		}else 
		{
			System.out.println("false");
		}
		
		
		
		
		
		
	} 

}
