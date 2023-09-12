package pagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserManageTest extends BaseTest {

	@BeforeClass
	public void userManagesetup()
	{
		adminObj= ologinPage.doLoginPage("Admin","admin123");
		usmObj= adminObj.doClick();
	}	
	@Test
	void urlTest()
	{
	 usmObj.getCurrentURL();
	}
	
	
	@Test
	void click()
	{
		usmObj.doClickUser();
	}
	
}
