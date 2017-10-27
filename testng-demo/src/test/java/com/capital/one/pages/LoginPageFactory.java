package com.capital.one.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFactory {
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement login;
	
	/*
	 * The above is creating something called an object repository
	 * which servers to the hub that offers a test script any element
	 * it needs to interact with. This makes the page class a 
	 * single point of access for any test script, thus decoupling the
	 * code entirely
	 */
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * Three kinds of selenium waits:
		 * - A wait is the duration of time selenium waits before determining a failed test case
		 * - Implicit, explicit, fluent
		 */
		
		//Explicit wiat
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//Populate our web elements
		PageFactory.initElements(driver, this);
	}
	
	public void inputUsername(String username) {
		this.username.sendKeys(username);
	}
	
	public void inputPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void submitLogin() {
		this.login.click();
	}
	
	//Full driver script
	public void driverLogin(String username, String password) {
		this.inputUsername(username);
		this.inputPassword(password);
		this.submitLogin();
	}

}
