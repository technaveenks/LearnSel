package com.ict.learning.learnsel.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ict.learning.learnsel.pages.HomePage;

public class Search_POM_TestNG {
	WebDriver driver;
	HomePage homePage;

	@BeforeTest
	public void openBrowser() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void verifySuccessfulSearchOfItem() {
		homePage = new HomePage(driver);
		//driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		homePage.clearSearchBox();
		//driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("iphone");
		homePage.enterSearchText();
		//driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		homePage.clickOnSearchButton();
		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/p[1]"))
				.getText();
		System.out.println(dressName);
	}

	@Test
	public void verifySuccessfulSearchOfMacBook() {
		driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("MacBook");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a"))
				.getText();
		System.out.println(dressName);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
