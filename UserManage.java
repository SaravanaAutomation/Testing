package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserManage {
	
	
	 WebDriver odriver;
	
	//Locator
	
	By usermanage= By.xpath("//span[text()='User Management']");
	By user1= By.xpath("//a[text()='Users']");
	
	//page constant
	
	public UserManage(WebDriver odriver) {
	
	this.odriver= odriver;
	}
	
//Actions
	
	public String getCurrentURL()
	{
		String url1= odriver.getCurrentUrl();
		System.out.println(url1);
		return url1;
		
	}
	public String getTitle()
	{
		String title1= odriver.getTitle();
		System.out.println(title1);
		return title1;
		
	}
	public void doClickUser()
	{
		odriver.findElement(usermanage).click();
		odriver.findElement(user1).click();		
		
	}
}
