package com.makemytrip.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.makemytrip.qa.base.TestBase;
import com.makemytrip.qa.pages.Home_Page;
import com.makemytrip.qa.pages.Login_Page;
public class Login_Page_Test extends TestBase {

	Login_Page loginpage;
	Home_Page homepage;

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();

		homepage = new Home_Page();
		loginpage = new Login_Page();

	}

	@Test
	public void loginTest() throws InterruptedException {
		homepage.navloginPage().loginMakeMyTrip(prop.getProperty("username"), prop.getProperty("password"));

	}

	
	  @AfterMethod public void tearDown() { driver.quit(); }
	 

}
