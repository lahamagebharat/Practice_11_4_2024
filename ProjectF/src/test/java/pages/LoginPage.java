package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginbutton;

	@FindBy(className = "app_logo")
	WebElement applogo;

	@FindBy(className = "product_sort_container")
	WebElement product_sort_container_drop;

	public void logintobrowser() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginbutton.click();
	}

}
