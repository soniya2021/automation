package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel {

	public WebDriver driver;
	
	@Test
	public void demo(String browser) {
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
			
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("asdfghjkl");
        driver.findElement(By.id("pass")).sendKeys("asdfghjk");
        driver.findElement(By.name("login")).click();
        String title = driver.getTitle();
        Reporter.log(title,true);
        String url = driver .getCurrentUrl();
        Reporter.log(url,true);
	}

}