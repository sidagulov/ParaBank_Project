package StepDefinitions;

import Pages.DialogContent;
import Pages.GenNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_02_Login1 {
    GenNav gn=new GenNav();
    DialogContent dc=new DialogContent();

    @And("the user sees the Customer Login section on the home page.")
    public void theUserSeesTheCustomerLoginSectionOnTheHomePage() {
        gn.verifyContainsText(gn.customerLogin,"Customer Login");
    }

    @And("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        dc.myClick(dc.loginButton);
    }

    @Then("The user confirms the error message that appears on the screen.")
    public void theUserConfirmsTheErrorMessageThatAppearsOnTheScreen() {
        gn.verifyContainsText(gn.errorMessage,"Error");
    }
}
