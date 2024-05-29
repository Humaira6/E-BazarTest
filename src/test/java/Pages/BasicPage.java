package Pages;

import Utilities.webdriverSetup;
import io.qameta.allure.Allure;
import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static Utilities.webdriverSetup.getBrowser;

public class BasicPage extends webdriverSetup {


    public WebElement getElement(By locator) {
        return getBrowser().findElement(locator);

    }

    public void writeOnElement(By locator, String text) {
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();

    }

    public void ShowAlert() {
        Alert alert =getBrowser().switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }


    public Boolean displayStatus(By locator) {
        try {
            return getElement(locator).isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public Boolean isdisplay(By locator){
        try {
            return getElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void addScreenshot(String name){
        Allure.addAttachment(name,new ByteArrayInputStream(((TakesScreenshot)getBrowser()).getScreenshotAs(OutputType.BYTES)));
    }


}