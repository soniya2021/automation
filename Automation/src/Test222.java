import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 
 driver.manage().window().maximize();
 driver.get("https://www.instagram.com/accounts/login/");
 
 driver.navigate().to("https://www.facebook.com/");
 
 driver.navigate().back();
 
 driver.navigate().forward();
 
 driver.navigate().refresh();
 
 driver.close();
	}

}
