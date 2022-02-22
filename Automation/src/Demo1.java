import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

		static{
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
			// d.findElement(By.id("email")).sendKeys("asdfghjksdfghj");
			 	// d.findElement(By.name("pass")).sendKeys("asdfghjkl");
	//d.findElement(By.id("")).click();
			//d.close();
		d.findElement(By.id("email")).sendKeys("abcd");
	}

}