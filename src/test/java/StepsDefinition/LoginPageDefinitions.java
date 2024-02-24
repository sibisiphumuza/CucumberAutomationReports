package StepsDefinition;

import java.time.Duration;

import org.junit.Assert;

import PageActions.HomePageActions;
import PageActions.LoginPageActions;
import Utilities.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {

	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHomePage = new HomePageActions();

	@Given("User is on E-CommerceSite page {string}")
	public void loginTest(String url) {
		HelperClass.openPage(url);
	}

	@When("User enters valid email as {string} and password as {string} and url as {string}")
	public void LoginValidCredentials(String email, String passWord, String url) throws InterruptedException {
		// login to application
		objLogin.login(email, passWord);
		// go the next page
		HelperClass.openPage(url);
		
	}

	@When("User enters invalid email as {string} and password as {string}")
	public void LoginInvalidCredentials(String email, String passWord) throws InterruptedException {
		// login to application
		objLogin.login(email, passWord);
		//HelperClass.realoadPage();
	}
	
	@Then("User should be able to login successfully and new page open")
	public void verifyLogin() {
		// Verify home page
		Assert.assertTrue(objHomePage.getHomePageText().contains("Hot Sellers"));
	}

	@Then("User should be able to see error message")
	public void verifyErrorMessage() {
		// Verify home page
		Assert.assertTrue(objLogin.getErrorMessage().contains("Customer Login"));
	}

}