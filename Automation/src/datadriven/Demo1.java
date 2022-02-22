package datadriven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
	Properties p= new Properties();
	FileInputStream fis=new FileInputStream("");
	p.load(fis);
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebElement dropdown=driver.findElement(By.id("gh-cat"));
		
		
		driver.findElement(By.id("").sendkeys();

	}

}
