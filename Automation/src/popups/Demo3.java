import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
	 driver.findElement(By.xpath("")).click();

	 
	 Robot r =new Robot();
	 r.Keypress(keyEvent.VK_CONTROL);
	 r.Keypress(keyEvent.VK_TAB);
	 r.Keypress(keyEvent.VK_TAB);
	 r.Keypress(keyEvent.VK_CANCEL);
	 
	 
	 r.Keypress(keyEvent.VK_CONTROL);
	 r.Keypress(keyEvent.VK_TAB);
	 r.Keypress(keyEvent.VK_TAB);
	 r.Keypress(keyEvent.VK_CANCEL);
	}

}
