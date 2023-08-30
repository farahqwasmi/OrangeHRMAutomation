package pageObjects;

import org.openqa.selenium.By;
import helpers.PageHelpers;

public class loginPage extends PageHelpers {
    private final static By emailTxtField = By.xpath("//*[@name='username']");
    private final static By passwordTxtField = By.xpath("//*[@name='password']");
    private final static By loginButton = By.xpath("//*[@type='submit']");
    private final static By userList = By.cssSelector("div.oxd-topbar-header-userarea  ul  li");
    private final static By logoutButton = By.cssSelector("div.oxd-topbar-header-userarea li:nth-child(4) a");


    public static void assignCreds() {

        sendKeys(emailTxtField, "Admin");
        sendKeys(passwordTxtField, "admin123");


    }


    public static void login() {
        click(loginButton);
        explicitlyWaitForWebElement("Presence", userList);
        element(userList).isDisplayed();

    }

    public static void logout() {
        click(userList);
        explicitlyWaitForWebElement("Presence", logoutButton);
        click(logoutButton);
        explicitlyWaitForWebElement("Presence", emailTxtField);

        element(emailTxtField).isDisplayed();

    }

}
