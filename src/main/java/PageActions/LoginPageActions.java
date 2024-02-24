package PageActions;

import org.openqa.selenium.support.PageFactory;
import PageLocators.LoginPageLocators;
import Utilities.HelperClass;

public class LoginPageActions {

	LoginPageLocators loginPageLocators = null;

	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);	}

	// Set user name in textbox
	public void setEmail(String strUserName) {
		loginPageLocators.email.sendKeys(strUserName);
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		loginPageLocators.password.sendKeys(strPassword);
	}

	// Click on login button
	public void clickLogin() {
		loginPageLocators.login.click();
	}

	// Get the error message when username is blank
	public String getMissingUsernameText() {
		return loginPageLocators.missingUsernameErrorMessage.getText();
	}

	// Get the Error Message
	public String getErrorMessage() {
		return loginPageLocators.errorMessage.getText();
	}

	public void login(String email, String strPassword) {

		// Fill user name
		this.setEmail(email);

		// Fill password
		this.setPassword(strPassword);

		// Click Login button
		this.clickLogin();

	}
}
