package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		
		Set <String>child=  driver.getWindowHandles();
		System.out.println(child);
		

	    System.out.println(child.size()); 
       
       for(String ch:child) {
	   driver.switchTo().window(ch);
	   System.out.println(driver.getTitle());
	   
       }
driver.quit();
	}

}
