package pageObjects;

import helpers.PageHelpers;
import org.openqa.selenium.By;

public class infoPage extends PageHelpers {
    private final static By infoMenuItem = By.cssSelector(" div.oxd-sidepanel-body   li:nth-child(6) a");
    private final static By attachmentButton = By.cssSelector(" div.orangehrm-attachment  div.orangehrm-horizontal-padding.orangehrm-vertical-padding  button");
    private final static By uploadFileButton = By.cssSelector(" div.orangehrm-attachment  div:nth-child(1)  div:nth-child(2) input");
    private final static By saveButton = By.cssSelector("div.orangehrm-attachment  button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space");
    private final static By descriptionTxt = By.cssSelector("textarea");

    static String description = "test description" + RandomNumber();

    public static void infoPageNavigation() {
        click(infoMenuItem);

    }


    public static void uploadingAttachment() {
        explicitlyWaitForWebElement("Presence", attachmentButton);
        scrollTo(attachmentButton);
        click(attachmentButton);
        explicitlyWaitForWebElement("Presence", uploadFileButton);
        uploadFile(uploadFileButton);
        sendKeys(descriptionTxt , description);
        click(saveButton);

    }

    public static void uploadedAttachmentAssertion() {

       implicitlyWaitBySeconds(5);
        FindElementByText(description).isDisplayed();

    }
}
