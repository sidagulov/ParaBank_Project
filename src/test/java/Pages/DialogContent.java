package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement loginButton;

    @FindBy(css = "[name='username']")
    public WebElement loginUsername;

    @FindBy(css = "[name='password']")
    public WebElement loginPassword;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "firstName":
                return this.firstName;
            case "lastName":
                return this.lastName;
            case "address":
                return this.address;
            case "city":
                return this.city;
            case "state":
                return this.state;
            case "zipCode":
                return this.zipCode;
            case "phoneNumber":
                return this.phoneNumber;
            case "ssn":
                return this.ssn;
            case "userName":
                return this.userName;
            case "password":
                return this.password;
            case "confirmPassword":
                return this.confirmPassword;
            case "registerButton":
                return this.registerButton;
            case "loginButton":
                return this.loginButton;
            case "loginUsername":
                return this.loginUsername;
            case "loginPassword":
                return this.loginPassword;


        }
        return null;

    }
}
