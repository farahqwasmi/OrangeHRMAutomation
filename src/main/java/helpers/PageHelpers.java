package helpers;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PageHelpers {

    protected PageHelpers() {
    }


    protected static WebElement element(By by) {
        return WebDriverHelper.getWebDriver().findElement(by);
    }


    protected static void sendKeys(By by, String txt) {
        element(by).sendKeys(txt);
    }

    protected static void click(By by) {
        element(by).click();
    }

    public static void explicitlyWaitForWebElement(String waitStrategy, By webElement) {
        WebElement element = null;
        waitStrategy = waitStrategy.toLowerCase();
        waitStrategy = waitStrategy.toUpperCase();
        switch (waitStrategy) {
            case "CLICKABLE":
                element = new WebDriverWait(WebDriverHelper.getWebDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.elementToBeClickable(webElement));
                break;
            case "PRESENCE":
                element = new WebDriverWait(WebDriverHelper.getWebDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.presenceOfElementLocated((By) webElement));
                break;
            case "VISIBLE":
                element = new WebDriverWait(WebDriverHelper.getWebDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(element(webElement)));
                break;
        }
    }


    public static void implicitlyWaitBySeconds(int time) {
        WebDriverHelper.getWebDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }


    public static void scrollTo(By element) {
        ((JavascriptExecutor) WebDriverHelper.getWebDriver()).executeScript("arguments[0].scrollIntoView(false);", element(element));

    }


    public static void uploadFile(By uploaderLocator) {


        scrollTo(uploaderLocator);
        sendKeys(uploaderLocator, System.getProperty("user.dir") + "/src/test/resources/files/img.png");
    }


    public static WebElement FindElementByText(String text) {
        WebElement m = WebDriverHelper.getWebDriver().findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
        return m;
    }

    public static int RandomNumber() {


        Random random = new Random();

        int randomNumber = random.nextInt(100);
        return randomNumber;
    }


    public static String Date() {
        LocalDate currentDate = LocalDate.now();

        return currentDate.toString();
    }

}


