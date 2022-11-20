package com.ict.learning.learnsel.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeSuite
	public void openBrowser() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/lib/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
