package Steps;

import Data.Constants;
import Pages.CheckoutPage;
import Pages.ItemPage;
import Pages.TopCartLogo;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.Validate;
import org.testng.Assert;

import java.util.Random;

import static Pages.CheckoutPage.*;
import static org.apache.commons.lang3.Validate.*;

public class CheckoutPageSteps {

    @Given("User checks product and filling email")
    public void checkAndFillEmail() {
        orderList.click();
        Assert.assertEquals(productName.getText(), TopCartLogo.itemNameValue);

        emailField.sendKeys(Constants.email);
    }

    @Then("User chooses $5 transportation method")
    public void fillOutInfoAndChooseTransportation() {
        firstName.sendKeys(Constants.firstName);
        lastName.sendKeys(Constants.lastName);
        street.sendKeys(Constants.streetName);
        city.sendKeys(Constants.city);
        state.selectOptionByValue("1");
        zip.sendKeys(Constants.zip);
        phone.sendKeys(Constants.phone);

        transportation.click();
    }

    @When("clicking next")
    public void clickNext() {
        next.click();
    }
}
