package StepDefinitions;

import Pages.LoanFeature;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_08_LoanApplication {
    LoanFeature lf = new LoanFeature();

    @And("user click on {string} link")
    public void userClickOnLink(String linkText) {
        WebElement requestLoanLink = lf.getWebElement(linkText);
        lf.myClick(requestLoanLink);
    }

    @And("user enters $ {string} in the loan amount field")
    public void userEntersInTheField(String amount) {
        lf.mySendKeys(lf.loanAmount, amount);
    }

    @And("user enters {string} dollars in Down Payment field")
    public void userEntersDollarsInField(String amount) {
        lf.mySendKeys(lf.downPayment, amount);
    }

    @And("user selects an account number in the from account # field")
    public void userSelectsAnAccountNumberInThe() {
        lf.SelectMenu(lf.fromAccount,0);
    }

    @And("user click on the Apply Now button")
    public void userClickOnTheButton() {
        lf.myClick(lf.applyButton);
    }

    @And("user confirms the following information:")
    public void userConfirmsTheFollowingInformation(DataTable datas) {
        List<List<String>> listTxtYazi = datas.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElement = dc.getWebElement(listTxtYazi.get(i).get(0));
            lf.verifyContainsText(txtBoxWebElement, listTxtYazi.get(i).get(1));
        }
    }

    @When("user Click on the link of the newly created credit account number")
    public void userClickOnTheLinkOfTheNewlyCreatedCreditAccountNumber() {
    }

    @And("user {string} confirms the message")
    public void userConfirmsTheMessage(String arg0) {
    }
}
