package pagetest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AdminPageTest extends BaseTest {
	
	@BeforeClass
	public void adminSetup()
	{
		adminObj= ologinPage.doLoginPage("Admin","admin123");
	}
	
	@Test
	void adminURLTest()
	{
		adminObj.adminURL();
	}
	
	@Test
	void admintitleTest()
	{
		adminObj.adminTitle();
	}
	

	@Test
	void doClickTest()
	{
		adminObj.doClick();
	}


}
