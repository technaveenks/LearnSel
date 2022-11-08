package com.ict.learning.learnsel.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTests {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		
		String dressName = driver.findElement
				(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/p[1]")).getText();
		System.out.println(dressName);
		
		driver.close();
		driver.quit();
	}

}
