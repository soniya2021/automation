import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebElement dropdown=driver.findElement(By.id("gh-cat"));
		
	WebElement ele =driver.findElement(By.id("gh-cat"));
	Select s =new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("625");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		Thread.sleep(3000);
		
		s.deselectByIndex(1);
Thread.sleep(3000);
		s.deselectByValue("14339");
Thread.sleep(3000);
		s.deselectByVisibleText("Music");
		
		driver.close();
			}
	}
