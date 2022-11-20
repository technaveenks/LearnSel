 package com.ict.learning.learnsel.swarna.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search_TestNG_Test {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/mac-lib/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void verifySuccessfulSearchOfCamera() {
		driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Canon EOS 5D");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span"))
				.getText();
		System.out.println(dressName);
	}
	
	

	@Test
	public void verifySuccessfulSearchOfAppleCinema() {
		driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Apple Cinema 30\"");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[2]"))
				.getText();
		System.out.println(dressName);
	}
	
	@Test
	public void verifySuccessfulNikonD300() {
		driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Nikon D300");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img"))
				.getText();
		System.out.println(dressName);
	}

	@Test
	public void verifySuccessfulImageLoad() {
		driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Samsung Galaxy Tab 10.1");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img"))
				.getText();
		System.out.println(dressName);
	}
	
	@Test
	public void verifySuccessfulHTCTouchHD() {
		driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("HTC Touch HD");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img"))
				.getText();
		System.out.println(dressName);
	}
	@Test
	public void verifySuccessfulPalmTeroPro() {
		driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Palm Treo Pro");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img"))
				.getText();
		System.out.println(dressName);
	}
	@Test
	public void verifySuccessfuliMac() {
		driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("iMac");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

		String dressName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/i"))
				.getText();
		System.out.println(dressName);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
