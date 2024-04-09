package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanFeature extends ParentPage{
    public LoanFeature() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanLink;
    @FindBy(id = "amount")
    public WebElement loanAmount;
    @FindBy(id = "downPayment")
    public WebElement downPayment;
    @FindBy(id = "fromAccountId")
    public WebElement fromAccount;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement applyButton;
    @FindBy(id = "loanProviderName")
    public WebElement loanProvider;
    @FindBy(id = "loanStatus")
    public WebElement loanStatus;
    @FindBy(xpath = "//div[@ng-if='loanResponse.approved']/p")
    public WebElement congratMessage;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "Request Loan": return this.requestLoanLink;
            case "Loan Provider": return this.loanProvider;
            case "Status": return this.loanStatus;
            case "Congratulations Message": return this.congratMessage;
        }
        return null;
    }
}
