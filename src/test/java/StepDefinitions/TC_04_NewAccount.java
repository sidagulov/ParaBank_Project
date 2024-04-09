package StepDefinitions;

import Pages.DialogContent;
import Pages.GenNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_04_NewAccount {
    GenNav gn=new GenNav();
    DialogContent dc = new DialogContent();
    @When("User clicks open new Account")
    public void userClicksOpenNewAccount() {
        gn.myClick(gn.oNewAccount);
    }

//      @And("User selects the type of account")
//      public void userSelectsTheTypeOfAccount() {
//          dc.SelectMenu(dc.typeAccount, 0);
//      }
//
//      @And("user selects the min Ballance Account")
//      public void userSelectsTheMinBallanceAccount() {
//          dc.SelectValue(dc.minimumDeposit, "20559");
//      }

    @Then("the User click on the Open new Account button")
    public void theUserClickOnTheOpenNewAccountButton() {
        dc.ActionHover(dc.sendpaymentButton);
        dc.myClick(dc.sendpaymentButton);
    }
}