package com.ict.learning.learnsel.pages;

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
	
	//Actions
	public void clearSearchBox() {
		searchTextBox.clear();
	}
	
	public void enterSearchText() {
		searchTextBox.sendKeys("iphone");
	}
	
	public SearchResultsPage clickOnSearchButton() {
		searchButton.click();
		return new SearchResultsPage(driver);
	}
	
}
