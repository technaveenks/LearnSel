package com.ict.learning.learnsel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

	// Constructor
	public SearchResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='content']/div[3]/div/div/div[2]/div[1]/p[1]")
	private WebElement _itemDescription;

	public String getItemDescription() {
		return _itemDescription.getText();
	}

}
