package com.ict.learning.learnsel.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTests {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\Projects\\LearnSel\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().fullscreen();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
