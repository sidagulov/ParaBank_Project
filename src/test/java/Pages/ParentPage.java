package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {

    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    private void scrollToElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void mySendKeys(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));

        // new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform(); //sayfaya ESC tuşu gönderildi
    }

    public void SelectMenu(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public int randomGenerator(int until) {
        return (int) (Math.random() * until);
    }

    public void ActionHover(WebElement element) {
        Actions driverAksiyon = new Actions(GWD.getDriver());
        Action aksiyon = driverAksiyon.moveToElement(element).build();
        wait.until(ExpectedConditions.visibilityOf(element));
        aksiyon.perform();
    }
}