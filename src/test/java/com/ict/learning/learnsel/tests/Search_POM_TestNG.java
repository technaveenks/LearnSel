package com.ict.learning.learnsel.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ict.learning.learnsel.pages.HomePage;
import com.ict.learning.learnsel.pages.SearchResultsPage;
import com.ict.learning.learnsel.utils.BaseTest;

public class Search_POM_TestNG extends BaseTest {

	HomePage homePage;
	SearchResultsPage searchResultsPage;
	
	@BeforeTest
	public void setup() {
		homePage = new HomePage(getDriver());
	}

	@Test(groups = { "smoke" })
	public void verifySuccessfulSearchOfItem() {
		// driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		homePage.clearSearchBox();
		// driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("iphone");
		homePage.enterSearchText();
		// driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		searchResultsPage = homePage.clickOnSearchButton();
		System.out.println(searchResultsPage.getItemDescription());

	}

	@Test(groups = { "smoke" })
	public void verifySuccessfulSearchOfMacBook() {
		/*
		 * driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		 * driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("MacBook");
		 * driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		 * 
		 * String dressName = driver.findElement(By.xpath(
		 * "//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")) .getText();
		 * System.out.println(dressName);
		 */
	}

}
