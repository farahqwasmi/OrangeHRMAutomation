package pageObjects;

import helpers.PageHelpers;
import org.openqa.selenium.By;

import static org.testng.Assert.assertEquals;

public class leavePage extends PageHelpers {
    private final static By assignLeave = By.cssSelector("div.oxd-topbar-body li:nth-child(7)");
    private final static By leaveMenuItem = By.cssSelector(" div.oxd-sidepanel-body   li:nth-child(3) a");
    private final static By employeeNameField = By.cssSelector(" form > div:nth-child(1)  div:nth-child(2)  input");
    private final static By leaveTypeList = By.cssSelector("form > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > div > div");
    private final static By FromDatePicker = By.cssSelector(" form  div:nth-child(3) > div > div:nth-child(1)  div:nth-child(2) input");
    private final static By assignButton = By.xpath("//*[@type='submit']");
    private final static By confirmLeave = By.cssSelector("div.orangehrm-modal-footer  button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-button-margin");

    private final static By leaveList = By.cssSelector("div.oxd-topbar-body li:nth-child(6)");

    private final static By fromDateFilter = By.cssSelector(" form > div:nth-child(1) > div > div:nth-child(1)  div:nth-child(2)  div  div  input");
    private final static By toDateFilter = By.cssSelector("form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > input");
    private final static By leaveStatusFilter = By.cssSelector(" form > div:nth-child(1) > div > div:nth-child(3) > div > div:nth-child(2) > div > div.oxd-select-text.oxd-select-text--active");
    private final static By employeeNameFilter = By.cssSelector("form > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > input");
    private final static By includePastEmployee = By.cssSelector(" div.oxd-grid-item.oxd-grid-item--gutters.orangehrm-leave-filter.--span-column-2   span");
    private final static By searchButton = By.xpath("//*[@type='submit']");

    private final static By resultUserName = By.cssSelector(" div.oxd-table-body  div:nth-child(3) > div");
    private final static By leaveDate = By.cssSelector("div.oxd-table-body  div:nth-child(2)");


    static String employeeName = "Dominic  Chase";
    static String currentDate = null;

    public static void leaveCreation() {

        explicitlyWaitForWebElement("presence", assignLeave);
        click(assignLeave);
        explicitlyWaitForWebElement("presence", employeeNameField);
        sendKeys(employeeNameField, employeeName);

        implicitlyWaitBySeconds(2);
        FindElementByText(employeeName).click();

        click(leaveTypeList);
        FindElementByText("CAN - Bereavement").click();

        click(FromDatePicker);
        FindElementByText("Today").click();
        click(assignButton);
        explicitlyWaitForWebElement("presence", confirmLeave);

        click(confirmLeave);
    }

    public static void leaveNavigation() {
        click(leaveMenuItem);
    }

    public static void leaveAssertion() {

        implicitlyWaitBySeconds(5);

        click(leaveList);
        explicitlyWaitForWebElement("presence", fromDateFilter);
        click(fromDateFilter);
        FindElementByText("Today").click();
        explicitlyWaitForWebElement("presence", toDateFilter);
        currentDate = element(fromDateFilter).getText();
        click(toDateFilter);
        FindElementByText("Today").click();
        explicitlyWaitForWebElement("presence", leaveStatusFilter);

        click(leaveStatusFilter);
        FindElementByText("Taken").click();
        explicitlyWaitForWebElement("presence", includePastEmployee);

        click(includePastEmployee);
        explicitlyWaitForWebElement("presence", employeeNameFilter);
        sendKeys(employeeNameFilter, employeeName);

        implicitlyWaitBySeconds(2);
        FindElementByText(employeeName).click();
        click(searchButton);

        explicitlyWaitForWebElement("presence", resultUserName);
        assertEquals(element(resultUserName).getText(), "Dominic Chase");
        assertEquals(Date(), element(leaveDate).getText());

    }
}
