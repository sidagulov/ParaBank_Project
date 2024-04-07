package StepDefinitions;

import Pages.DialogContent;
import Pages.GenNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TC_03_InvoicePayment {
    GenNav gn = new GenNav();
    DialogContent dc = new DialogContent();

    @And("Select Payment option")
    public void selectPaymentOption() {
        dc.SelectMenu(dc.selectAccount,0);
    }


    @When("the user clicks the Bill Pay option from the menu on the website")
    public void theUserClicksTheBillPayOptionFromTheMenuOnTheWebsite() {
        gn.myClick(gn.billpay);
    }

    @And("the user clicks the Send Payment button for payment process")
    public void theUserClicksTheSendPaymentButtonForPaymentProcess() {
        dc.myClick(dc.sendpaymentButton);
    }
}