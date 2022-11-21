package com.ict.learning.learnsel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Element Locators / Identifier
	@FindBy(xpath="//*[@id='search']/input")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//*[@id='search']/span/buttons")
	private WebElement searchButton;
	
	//Actions
	public void clearSearchBox() {
		searchTextBox.clear();
	}
	
	public void enterSearchText() {
		searchTextBox.sendKeys("iphone");
	}
	
	public SearchResultsPage clickOnSearchButton() {
		searchButton.click();
		return new SearchResultsPage(getDriver());
	}
	
}
