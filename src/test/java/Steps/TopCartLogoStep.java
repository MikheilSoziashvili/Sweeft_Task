package Steps;

import Pages.HikingPage;
import Pages.ItemPage;
import Pages.TopCartLogo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static org.testng.Assert.*;

public class TopCartLogoStep {

    @Given("User clicks on top cart logo")
    public void clickingCartLogo() {
        ItemPage.cart.click();
    }

    @Then("product details must be correct")
    public void checkingDetailsInCart() {
        System.out.println("s");
        assertEquals(TopCartLogo.itemPrice, TopCartLogo.totalPrice);
        assertEquals(TopCartLogo.itemName, HikingPage.itemName);
        assertEquals(TopCartLogo.itemPrice, HikingPage.firstItemPriceValue);
    }

    @And("user clicks on proceed to checkout button")
    public void proceedToCheckout() {
        ItemPage.proceedToCheckout.click();
    }
}
