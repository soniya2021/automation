package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
   @Test
public class Test0 {
	static
	{
System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	
    @Test(priority= 1)
public void settings() {
	Reporter.log("settings",true);
    }
	@Test(priority=-1)
	public void chats() {
	Reporter.log("chats",true);
	}
	@Test
	public void calls() {
	Reporter.log("calls",true);
}
}
