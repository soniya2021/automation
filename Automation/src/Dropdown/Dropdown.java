package Dropdown;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));


Select s =new Select(dropdown);
s.selectByIndex(2);
s.selectByValue("search-alias=todays-deals");
s.selectByVisibleText("Amazon Fresh");
driver.close();

	}

}