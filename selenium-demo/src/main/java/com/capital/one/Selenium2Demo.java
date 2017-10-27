package com.capital.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2Demo {

	public static void main(String[] args) {
		//Set webdriver.chrome.driver property to directory location of chromedriver.exe (for Windows, chromedriver for Unix)
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		//Create a new instance of a Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Test get on Google
		driver.get("http://www.google.com");
		
		//Find text element by name
		WebElement searchbar = driver.findElement(By.name("q"));
		
		//Enter something into the form
		searchbar.sendKeys("Selenium");
		
		//Submit form
		searchbar.submit();
		
		//Test for title
		System.out.println("Page title is: " + driver.getTitle());
		
		//Wait the page for 10 seconds
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().startsWith("Selenium");
			}
		});

		//Test for title again
		System.out.println("Page title is: " + driver.getTitle());

		//Close the browser
		driver.quit();
	}

}
