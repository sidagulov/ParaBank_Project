package StepDefinitions;

import Pages.DialogContent;
import Pages.GenNav;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_06_MoneyTransfer {
    GenNav gn=new GenNav();
    DialogContent dc = new DialogContent();
    ParentPage pr=new ParentPage();


    @When("User clicks open Transfer Funds")
    public void UserclicksopenTransferFunds()  {gn.myClick(gn.transferfunds);}
    @And("User chooses sender and receiver account")
    public void userchosessenderandreceiveraccount() {pr.SelectMenu(gn.fromaccount, 0);
        pr.SelectMenu(gn.toaccount,1);}
    @And("User clicks Transfer button")
    public void userclickstransferbutton ()  {gn.myClick(gn.trnsferbutton);}

    @Then("User verifies Transfer funds")
    public void thenuserverifiestransferfunds() {gn.verifyContainsText(gn.accountid, "1137");}
    @And("User clicks  Accounts Overview")
    public void userclicksaccountoverview() {gn.myClick(gn.accountoverview);}

    @And("User clics Account Number")
    public void userclicksaccountnumber() {gn.myClick(gn.accountnumber);}
    @Then("User verifies transfer date and Amount in account")
    public void userverifiestransferdateandAmountinaccount() {
        gn.verifyContainsText(gn.date, "04-10-2024");

        gn.verifyContainsText(gn.credit,"100");
    }
}