package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenNav extends ParentPage{

    public GenNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[@class='title']")
    public WebElement titleWelcome;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "register": return this.register;
            case "titleWelcome": return this.titleWelcome;
        }
        return null;
    }


}
