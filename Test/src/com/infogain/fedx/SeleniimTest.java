package com.infogain.fedx;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniimTest {

	@Test
	public void testing() {

		File file = new File("drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-extensions");
		// options.addArguments("--test-type");
		// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		// chromeDriver = new C hromeDriver(capabilities);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");

		// driver.findElement(By.linkText("Chatter"));
	}
	// public void createDriver()
	// {
	// WebDriver driver;
	// File file = new File("drivers\\chromedriver.exe");
	// System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	//
	// // DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	// // ChromeOptions options = new ChromeOptions();
	// // options.addArguments("--disable-extensions");
	// // options.addArguments("--test-type");
	// // capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	// // chromeDriver = new C hromeDriver(capabilities);
	// driver = new ChromeDriver();
	// }

}
