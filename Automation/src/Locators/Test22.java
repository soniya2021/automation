package Locators;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test22{

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


WebElement dropdown=driver.findElement(By.id("twotabsearchtextbox"));

Select s =new Select(dropdown);
s.selectByIndex(0);
s.selectByValue("5");
s.selectByVisibleText("Deals");
driver.close();

	}

}
