package com.letzautomate.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test001 {

	@Test(groups={"smoke"})
	public void googleSearch() {

		WebDriverManager webDriverManager = WebDriverManager.chromedriver();
		webDriverManager.setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("HelloWorld");

	}

}
