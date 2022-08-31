package Steps;

import Data.Constants;
import Pages.PlaceOrderPage;
import Pages.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegistrationPageSteps {

    @Given("user clicks on create an account button")
    public void createAccount() {
        PlaceOrderPage.createAccount.click();
    }

    @Then("filled out information must be correct")
    public void checkDetails() {
        Assert.assertEquals(RegistrationPage.firstName, Constants.firstName);
        Assert.assertEquals(RegistrationPage.lastName, Constants.lastName);
        Assert.assertEquals(RegistrationPage.email, Constants.email);
    }

    @When("User enters password and confirmation")
    public void enterStrongPassword() {
        String password = Constants.password;
        RegistrationPage.password.sendKeys(password);
        RegistrationPage.repeatPassword.sendKeys(password);
    }

    @Then("password strength must show strong")
    public void checkStrongPassword() {
        RegistrationPage.strongPasswordSpan.shouldHave(Condition.exactText("Very Strong"));
        RegistrationPage.createAccount.click();
    }
}
