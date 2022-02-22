import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test8 {

		private static final WebElement WebElement = null;
		private static Object ele;


		static{
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		}
		
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			 driver.findElements(By.name("munit testing "));
		  Actions a = new Actions(driver);
		  
		a.click(WebElement).perform();
			Thread.sleep(2000);
			 
			WebElement ele=driver.findElement(By.id("add"));
		Actions a1= new Actions(driver);
			a1.doubleClick(ele).perform();
	}

}
