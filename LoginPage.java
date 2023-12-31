package pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	


	public WebDriver odriver;//import WebDriver
	
	
	//1.page constructor
	
	public LoginPage(WebDriver odriver){
		this.odriver=odriver;
	}
	
		
		//2.By locators
		
		private	By userName=By.xpath("//input[@name='username']");
		private	By passWord=By.xpath("//input[@name='password']");
		private By loginButton=By.xpath("//button[@type='submit']");
		
	
		
		//3.PageActions/implemented methods	
		public String getLoginPageTitle(){
			String title=odriver.getTitle();
			System.out.println("Login page tiltle is -->" + title );
			return title;	
		}
			
		public String getCurrentUrlLoginPage()
		{
			String currentUrl=odriver.getCurrentUrl();
			System.out.println("Current Url of the page--->"+ currentUrl);
			return currentUrl;
		}
		
		//TestDataDriven
	public AdminPage doLoginPage(String username,String password) {
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		odriver.findElement(userName).sendKeys(username);
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		odriver.findElement(passWord).sendKeys(password);
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		odriver.findElement(loginButton).click();
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return new AdminPage(odriver);
	}
	
	
	
	

}
