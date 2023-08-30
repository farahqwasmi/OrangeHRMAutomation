package stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.buzzPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.loginPage;

public class BuzzPostStepDefs {

    @Given("Logged in user")
    public void login() {
        loginPage.assignCreds();
        loginPage.login();
    }
    @When("User navigate to buzz")
    public void buzzNavigation() {
        buzzPage.buzzNavigation();
    }
    @Then("User can add post there")
    public void addBuzzPost() {
        buzzPage.addPost();
    }
}
