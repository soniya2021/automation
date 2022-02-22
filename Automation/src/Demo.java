import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
		 d.navigate().back();
		 Thread.sleep(2000);
		 d.get("https://www.instagram.com/accounts/login/"); 
		 Thread.sleep(3000);
		d.navigate().refresh();
		d.close();

	}

}
