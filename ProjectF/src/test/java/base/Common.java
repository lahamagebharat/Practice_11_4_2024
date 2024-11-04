package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
	public WebDriver d;

	@BeforeMethod
	public void launchBrowser() {
		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(chromeoptions);
		d.get("https://www.saucedemo.com/");

	}

	@AfterMethod
	public void closebrowser() {
		d.quit();

	}

}
