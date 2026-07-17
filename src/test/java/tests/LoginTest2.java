package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	public void test1() {

		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);

		test.info("Navigating to login Page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding Username");
		loginpage.addUsername("Admin");
		test.info("Adding Password");
		loginpage.addPassword("admin123");
		test.info("Clicking on Login Button");
		loginpage.clickLoginButton();
		test.info("Checking Homepage");
		homepage.clickTimeLink();
		test.info("All Tests are completed");
	}

	@Test
	public void test2() {

		test.skip("skipping this test");
		throw new SkipException("Skipping this test");
	}
	@Test
	public void test3() {

		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);

		test.info("Navigating to login Page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding Username");
		loginpage.addUsername("Admin");
		test.info("Adding Password");
		loginpage.addPassword("admin123");
		test.info("Clicking on Login Button");
		loginpage.clickLoginButton();
		test.info("Checking Homepage");
		homepage.clickTimeLink();
		test.info("All Tests are completed");
	}

}