package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook {

	//static{
		//System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");

		@FindBy(id = "email")
		private WebElement emailtb;
		
		
		@FindBy(name = "pass")
		private WebElement passtb;
		
		
		@FindBy(xpath="//div[text()='login']")
		private WebElement loginbtn;
		
		public facebook(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		public void username(String name) {
			emailtb.sendKeys(name);
			}
		public void password(String pwd) {
			passtb.sendKeys(pwd);
		}
		public void loginButton() {
			loginbtn.click();
	}

	//	public void search(String string) {
			// TODO Auto-generated method stub
			
		}


