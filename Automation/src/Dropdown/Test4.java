package Dropdown;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElements(By.xpath("//a[text=Create New Account]"));
		Thread.sleep(2000);
	WebElement ele=driver.findElement(By.name("firstname"));
	ele.sendKeys("asdfghjk");
		
		driver.findElements(By.xpath("//a[text=Create New Account]"));
		WebElement ele1=driver.findElement(By.id("Month"));
		
		Select s = new Select(ele1);
		s.selectByIndex(0);
		
		System.out.println(s.isMultiple());
		ArrayList a=new ArrayList();
		
		List<WebElement>option = s.getOptions();
		System.out.println(option.size());
		
		 for(WebElement allOption: option) {
			 String text = allOption.getText();
			// WebElement b = null;
			System.out.println(text());
			 a.add(text);
			 
		 }
		 System.out.println("**************** after sorting**************");
		 Collections.sort(a);
		 
		 for (Object all:a) {
			 System.out.println(all);
			 
		 }
		 driver.close();
		 
	}


	private static char[] text() {
		// TODO Auto-generated method stub
		return null;
	}



	}

