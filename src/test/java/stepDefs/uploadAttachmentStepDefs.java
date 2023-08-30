package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.infoPage;


public class uploadAttachmentStepDefs {

    @When("Navigate to the info page")
    public void infoPageNavigation() {
        infoPage.infoPageNavigation();
    }

    @And("Upload attachment")
    public void uploadingAttachment() {
        infoPage.uploadingAttachment();

    }

    @Then("Document will be uploaded successfully")
    public void uploadingAssertion() {
        infoPage.uploadedAttachmentAssertion();


    }
}