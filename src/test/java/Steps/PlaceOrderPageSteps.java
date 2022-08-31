package Steps;

import Data.Constants;
import Pages.PlaceOrderPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static Pages.PlaceOrderPage.*;
import static org.apache.commons.lang3.Validate.matchesPattern;

public class PlaceOrderPageSteps {
    @Then("details should be correct")
    public void checkDetails() {
        final int orderTotal = 5 + Integer.parseInt(Constants.itemPrice.substring(1, Constants.itemPrice.length() - 3));
        Assert.assertEquals(Integer.parseInt(PlaceOrderPage.orderTotal.substring(1, PlaceOrderPage.orderTotal.length() - 3)), orderTotal);

        String allInfoTogether = Constants.firstName + Constants.lastName + Constants.streetName + Constants.city + "," + Constants.state + Constants.zip + Constants.country + Constants.phone;
        Assert.assertEquals(receipt.replaceAll("\\s+",""), allInfoTogether.replaceAll("\\s+",""));
    }

    @Given("User clicks place order button")
    public void clickPlaceOrder() {
        placeOrder.click();
        Selenide.sleep(5000);
    }

    @Then("order number and email receipt must be correct")
    public void checkFinalDetails() {
        Constants.orderNumber = PlaceOrderPage.orderNumber.getText();
        matchesPattern(Constants.orderNumber, "^\\d{9}$");
        Assert.assertEquals(emailReceipt.getText(), "We'll email you an order confirmation with details and tracking info.");
    }
}
