package stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginStepDefs {
	
	@Given("The user navigate to login page")
	public void loginNavigation() {	
		

	}
	
	@When("Enter creds")
	public void enterUsrNameAndEmail() {
		loginPage.assignCreds();
	}
	@And("Click Login")
	public void loginButton() {
		loginPage.login();
	}
	@Then("User should see the dashboard page")
	public void validateIfUserLoggedIn() {

	}
	@And("Logout")
	public void logout() {
		loginPage.logout();
	}
	
}
