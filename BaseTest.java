package pagetest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import initialsetup.Driversetup;
import pageobject.AdminPage;
import pageobject.LoginPage;
import pageobject.UserManage;

public class BaseTest {
	
	 Driversetup dsObj;
	 WebDriver odriver;
	public LoginPage ologinPage;
	public AdminPage adminObj;
	public UserManage usmObj;
	
	
	@BeforeTest
	void setUp(){
		dsObj=new Driversetup();
		odriver=dsObj.initDriverSetUp("chrome");
		ologinPage=new LoginPage(odriver);	
		}
	

	
	@AfterTest
	void close()
	{
		odriver.close();
	}
	
	
}