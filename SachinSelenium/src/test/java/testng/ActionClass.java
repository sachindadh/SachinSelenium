package testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ActionClass 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.get("https://www.rediff.com/");
		
		Actions a=new Actions (driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']"))).click().build().perform();
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	File dest = new File("D:\\SSD\\rediffmail.jpg");
		//FileHandler.copy(src, dest);
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr, new File("D:\\SACHIN.jpg"));
		
		
	}

}
