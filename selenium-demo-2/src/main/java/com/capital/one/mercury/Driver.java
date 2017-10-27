package com.capital.one.mercury;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	static WebDriver driver;
	static String url = "http://newtours.demoaut.com";
	static int testCount = 0;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("bobbert");
		//driver.findElement(By.name("userName"))
		driver.findElement(By.name("password")).sendKeys("bobbert");
		driver.findElement(By.name("login")).click();
		
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals("Find a Flight: Mercury Tours:")) {
			System.out.println("TEST PASSED");
		} else {
			System.out.println("TEST FAILED");
		}
		
		driver.quit();
	}

}
