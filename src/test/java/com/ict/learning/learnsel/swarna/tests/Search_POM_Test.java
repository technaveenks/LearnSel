package com.ict.learning.learnsel.swarna.tests;

import org.testng.annotations.Test;

import com.ict.learning.learnsel.pages.HomePage;
import com.ict.learning.learnsel.pages.SearchResultsPage;
import com.ict.learning.learnsel.utils.BaseTest;

public class Search_POM_Test extends BaseTest {

	HomePage homePage;
	SearchResultsPage searchResultsPage;

	@Test
	public void verifySuccessfulSearchOfItem() {
		homePage = new HomePage(getDriver());
		// driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		homePage.clearSearchBox();
		// driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("iphone");
		homePage.enterSearchText();
		// driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		searchResultsPage = homePage.clickOnSearchButton();
		System.out.println(searchResultsPage.getItemDescription());

	}

	@Test
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
	
	@Test
	public void verifySuccessfulAddToCart() {
		homePage = new HomePage(getDriver());
		homePage.clearSearchBox();
		homePage.enterSearchText();
		searchResultsPage = homePage.clickOnSearchButton();

		
	}

}
