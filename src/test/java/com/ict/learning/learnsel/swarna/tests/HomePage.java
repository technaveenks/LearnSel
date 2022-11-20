package com.ict.learning.learnsel.swarna.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Element Locators / Identifier
	@FindBy(xpath="//*[@id='search']/input")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//*[@id='search']/span/button")
	private WebElement searchButton;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")
	private WebElement addToCartButton;
	
	//Actions
	public void clearSearchBox() {
		searchTextBox.clear();
	}
	
	public void enterSearchText() {
		searchTextBox.sendKeys("Samsung Galaxy Tab 10.1");
	}
	
	public SearchResultsPage clickOnSearchButton() {
		searchButton.click();
		return new SearchResultsPage(driver);
	}
	
	public SearchResultsPage clickOnAddCartButton() {
		addToCartButton.click();
		return new SearchResultsPage(driver);
	}
	
}
