package pageObjects;

import helpers.PageHelpers;
import org.openqa.selenium.By;

import static org.testng.Assert.assertEquals;

public class adminPage extends PageHelpers {
    private final static By adminMenuItem =By.cssSelector(" div.oxd-sidepanel-body   li:nth-child(1) a");
    private final static By addUserButton =By.cssSelector("  div.orangehrm-header-container  button");
    private final static By selectRoleList =By.cssSelector(" form  div:nth-child(1)  div  div:nth-child(1) >div div:nth-child(2) >div >div");
    private final static By employeeNameFiled =By.cssSelector(" form  div:nth-child(1)  div:nth-child(2)   div:nth-child(2)  div  div input");
    private final static By userNameField =By.cssSelector(" form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2)  input");
    private final static By selectStatusList =By.cssSelector(" form > div:nth-child(1) > div > div:nth-child(3) > div > div:nth-child(2) > div > div");
    private final static By passwordFiled =By.cssSelector(" div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell  div  div:nth-child(2)  input");
    private final static By confirmPasswordFiled =By.cssSelector("form > div.oxd-form-row.user-password-row > div > div:nth-child(2) > div > div:nth-child(2) > input");
    private final static By saveUserButton =By.xpath("//*[@type='submit']");

    private final static By userNameFilter =By.cssSelector(" form > div.oxd-form-row > div > div:nth-child(1) > div > div:nth-child(2) > input");
    private final static By searchButton =By.xpath("//*[@type='submit']");
    private final static By createdUserName =By.cssSelector("div.oxd-table-body div:nth-child(2) div");


    static String employeeName="Dominic  Chase";
    static String userName="test qa"+RandomNumber();
    static String password="Test1234@";


    public static void userCreation() {

        explicitlyWaitForWebElement("Presence",addUserButton);
        click(addUserButton);
        explicitlyWaitForWebElement("Presence",selectRoleList);
        click(selectRoleList);
        FindElementByText("Admin").click();

        sendKeys(userNameField,userName);
        sendKeys(passwordFiled , password);
        sendKeys(confirmPasswordFiled , password);
        click(selectStatusList);
        FindElementByText("Enabled").click();
        sendKeys(employeeNameFiled,employeeName);
        implicitlyWaitBySeconds(2);
        FindElementByText(employeeName).click();
        click(saveUserButton);


    }
    public static void createdUserAssertion() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sendKeys(userNameFilter , userName);
        explicitlyWaitForWebElement("Presence",searchButton);

        click(searchButton);
        explicitlyWaitForWebElement("Presence",createdUserName);
        assertEquals(userName , element(createdUserName).getText());

    }
    public static void adminPageNavigation() {
        click(adminMenuItem);
    }
}
