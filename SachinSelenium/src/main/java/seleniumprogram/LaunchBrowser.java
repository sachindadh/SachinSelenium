package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver & Sellinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sachin.dadhe.5");
		
		Thread.sleep(2000);
		
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7709668321");
	 
	 
	 driver.findElement(By.xpath("//button[@value='1']")).click();
	 
	 
	 
	 Thread.sleep(3000);
	 
	
		
	}
	

}
