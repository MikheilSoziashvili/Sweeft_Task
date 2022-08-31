package Steps;

import Data.Constants;
import Pages.AccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AccountPageSteps {

    @Given("user navigates to my orders tab")
    public void navigateToMyOrders() {
        AccountPage.myOrders.click();
    }

    @Then("order should be correctly dropped")
    public void checkOrder() {
        final int orderTotal = 5 + Integer.parseInt(Constants.itemPrice.substring(1, Constants.itemPrice.length() - 3));

        Assert.assertEquals(Constants.orderNumber, AccountPage.orderNumber);
        Assert.assertEquals(Integer.parseInt(AccountPage.total.substring(1, AccountPage.total.length() - 3)), orderTotal);
    }
}
