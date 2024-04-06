package StepDefinitions;

import Pages.DialogContent;
import Pages.GenNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_01_RegisterSteps {
    GenNav gn=new GenNav();
    DialogContent dc=new DialogContent();


    @Given("User navigate to the parabank Website")
    public void userNavigateToTheParabankWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }


    @When("User clicks the Register link")
    public void userClicksTheRegisterLink() {
       gn.myClick(gn.register);

    }

    @And("the user fills the fields on the screen")
    public void theUserFillsTheFieldsOnTheScreen(DataTable registerFields) {
        List<List<String>> listTxtYazi = registerFields.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElement = dc.getWebElement(listTxtYazi.get(i).get(0));
            dc.mySendKeys(txtBoxWebElement, listTxtYazi.get(i).get(1));
        }
    }

    @And("the user clicks the Register button")
    public void theUserClicksTheRegisterButton() {
            gn.myClick(gn.register);
        }


    @Then("user confirms that a successful registration process has taken place")
    public void userConfirmsThatASuccessfulRegistrationProcessHasTakenPlace() {
        gn.verifyContainsText(gn.titleWelcome,"welcome");

        }
    }

