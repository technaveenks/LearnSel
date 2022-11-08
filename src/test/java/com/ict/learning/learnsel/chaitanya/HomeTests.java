package com.ict.learning.learnsel.chaitanya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTests {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("search_query_top")).sendKeys("T Shirts");
		driver.findElement(By.name("submit_search")).click();
		
		String dressName = driver.findElement
				(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a")).getText();
		System.out.println(dressName);
		/*
		 * String data = driver.findElement(By
		 * .xpath("//*[@id='best-sellers_block_right']/div/ul/li[4]/div/h5/a"))
		 * .getText();
		 */
		String data = driver.findElement(By
				.partialLinkText("Printed Summer Dress")).getText();
		System.out.println(data);
		driver.close();
		driver.quit();
	}

}
