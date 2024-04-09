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

    @FindBy(xpath = "//div[@id='leftPanel']/p/b")
    public WebElement titleWelcome;

    @FindBy(xpath = "//div[@id='leftPanel']/h2")
    public WebElement customerLogin;

    @FindBy(xpath = "//div[@id='rightPanel']/h1")
    public WebElement errorMessage;

    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billpay;

    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement oNewAccount;




    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "register": return this.register;
            case "titleWelcome": return this.titleWelcome;

        }
        return null;
    }




}
