package seleniumprogram;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomIn_ZoomOut {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.javatpoint.com/");
		
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='50%'");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%'");
	}

}
