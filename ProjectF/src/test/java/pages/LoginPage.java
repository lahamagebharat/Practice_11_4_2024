package pages;

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

	public void logintobrowser() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginbutton.click();
	}

}
