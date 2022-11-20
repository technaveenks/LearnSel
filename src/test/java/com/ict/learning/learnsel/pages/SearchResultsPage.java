package com.ict.learning.learnsel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{

	// Constructor
	public SearchResultsPage(WebDriver driver) {
		super(driver);	
	}

	@FindBy(xpath = "//*[@id='content']/div[3]/div/div/div[2]/div[1]/p[1]")
	private WebElement _itemDescription;

	public String getItemDescription() {
		return _itemDescription.getText();
	}

}
