import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		 Thread.sleep(2000);
			List<WebElement>ele1 = driver.findElements(By.xpath("//span['selenium']"));
			System.out.println(ele1.size());
			
			 for(WebElement b:ele1) {
				 System.out.println(b.getText());
			 }
		driver.close();
		

	}

}
