package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.adminPage;

public class AddUserStepDefs {
    @When("Navigate to add user page")
    public void userPageNavigation() {
        adminPage.adminPageNavigation();
    }
    @And("Enter all of user required data")
    public void userCreationProcess() {
        adminPage.userCreation();
    }

    @Then("New admin user will be added successfully")
    public void createUserAssertion() {
        adminPage.createdUserAssertion();
    }

}
