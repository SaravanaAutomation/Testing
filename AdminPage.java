package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
	
	private WebDriver odriver;
	
	//Locators
	By adminPage= By.xpath("//span[text()='Admin']");
	
	//Page Constant
	
	public AdminPage (WebDriver odriver) {
		this.odriver=odriver;
	}
	
	//Action
	
	public String adminURL()
	{
		String url= odriver.getCurrentUrl();
		System.out.println(url);
		return url;
		
	}
	public String adminTitle()
	{
		String title= odriver.getTitle();
		System.out.println(title);
		return title;
	
	}
		public UserManage doClick()
		{
			odriver.findElement(adminPage).click();
			return new UserManage(odriver);
		}

}
