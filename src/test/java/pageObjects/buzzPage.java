package pageObjects;

import helpers.PageHelpers;
import org.openqa.selenium.By;

import static org.testng.Assert.assertEquals;

public class buzzPage extends PageHelpers {

    private final static By buzzMenuItem = By.cssSelector(" div.oxd-sidepanel-body   li:nth-child(12) a");
    private final static By postTextArea = By.cssSelector("textarea");
    private final static By postButton = By.xpath("//*[@type='submit']");
    private final static By postBody = By.cssSelector("div.oxd-grid-1.orangehrm-buzz-newsfeed-posts > div:nth-child(1) > div > div.orangehrm-buzz-post-body");

    public static void buzzNavigation() {

        click(buzzMenuItem);
    }

    public static void addPost() {
        explicitlyWaitForWebElement("Presence", postTextArea);
        click(postTextArea);
        sendKeys(postTextArea, "testBuzz post");
        click(postButton);
        explicitlyWaitForWebElement("Presence", postBody);

        assertEquals(element(postBody).getText(), "testBuzz post");

    }

}
