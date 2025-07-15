package com.letzautomate.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test001 {

	@Test(groups={"smoke"})
	public void googleSearch() throws MalformedURLException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
		WebDriver driver = new RemoteWebDriver(new URL("http://chrome:4444/wd/hub"), options);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("HelloWorld");

	}

}
