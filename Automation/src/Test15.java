import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Test15 {


	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//step:1 Typecasting
		TakesScreenshot ts = (TakesScreenshot)driver;
		//step:2 access the method
		File src = ts.getScreenshotAs(OutputType.FILE);
	   //Step3: specify the location
	   File dest = new File("./ScreenShot/ss.png");
	   //copy paste from src to dest
	
	   FileUtils.copyFile(src,dest);
	
	   driver.close();
		
	}

}
