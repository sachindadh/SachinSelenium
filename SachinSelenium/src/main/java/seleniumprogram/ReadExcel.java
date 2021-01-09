package seleniumprogram;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static  void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//FileInputStream file=new FileInputStream("D:\SACHIN\sheet1.xlsx");
		//org.apache.poi.ss.usermodel.Sheet sheet1 =WorkbookFactory.create(file).getSheet("sheet1");
		
		//Row row0=sheet1.getRow(0);
		//String email=row0.getCell(0).getStringCellValue();
		//Row row1=sheet1.getRow(1);
		
		//int password=(int) row1.getCell(1).getNumericCellValue();
		
	}

}

