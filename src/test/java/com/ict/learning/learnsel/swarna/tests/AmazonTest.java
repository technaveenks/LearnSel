package com.ict.learning.learnsel.swarna.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/Users/spenumallu/Documents/GitHub/LearnSel/lib/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/Users/spenumallu/java/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().fullscreen();
		String title = driver.getTitle();
		System.out.println(title);
	}

	}
