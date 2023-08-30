package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.leavePage;

public class AddLeaveStepDefs {
    @When("Navigate to the leave page")
    public void leavePageNavigation() {
        leavePage.leaveNavigation();
    }
    @And("Enter the leave mandatory fields")
    public void leaveDataFilling() {
        leavePage.leaveCreation();
    }
    @Then("Leave will be created successfully")
    public void createdLeaveAssertion() {
        leavePage.leaveAssertion();

    }

}
