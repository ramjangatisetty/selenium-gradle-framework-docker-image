package com.letzautomate.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test001 {

	@Test(groups={"smoke"})
	public void googleSearch() {

		WebDriverManager webDriverManager = WebDriverManager.chromedriver();
		webDriverManager.setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("HelloWorld");

	}

}
