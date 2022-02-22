package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
	 driver.findElement(By.xpath("//input[@value=addtocart()")).click();
		  // WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Alert al = driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(al.getText());
	al.accept();
	 
	Thread.sleep(5000);
	driver.close();
	}

}
