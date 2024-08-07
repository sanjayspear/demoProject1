package com.automationTalks.demoProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class TestClass1 {

	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@Test
	public void test1() {
		String title = driver.getTitle();
		System.out.println("Title 1: "+title);
	}

	@Test
	public void test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Title 2: "+driver.getTitle());
	}

	@Test
	public void test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Title 3: "+driver.getTitle());
	}

	@AfterMethod
	public void test4() {
		driver.quit();
	}
}
