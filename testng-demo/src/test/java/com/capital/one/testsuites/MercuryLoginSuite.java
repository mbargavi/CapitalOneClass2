package com.capital.one.testsuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.capital.one.pages.LoginPageFactory;

public class MercuryLoginSuite {
	
	private WebDriver driver;
	
	@Test(priority=0)
	@Parameters({"homepage"})
	public void validateLandingPage(String homepage) {
		Assert.assertEquals(driver.getTitle(), homepage);
	}
	
	@Test(priority=1)
	@Parameters({"username", "password", "findFlightPage"})
	public void loginMercury(String username, String password, String findFlightPage) {
		LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.driverLogin(username, password);
		Assert.assertEquals(driver.getTitle(), findFlightPage);
	}
	
	@BeforeTest
	@Parameters({"url"})
	public void beforeTest(String url) {
		System.setProperty("webdriver.chrome.driver",  "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
