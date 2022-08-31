package Steps;

import Pages.HikingPage;
import Pages.ItemPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ItemPageSteps {

    @Given("User navigates to item page")
    public void navigateToItemPage() {
        HikingPage.name.click();
    }

    @Then("details should be same as previous page")
    public void checkingDetails() {
        Assert.assertEquals(HikingPage.itemName, ItemPage.name);
        Assert.assertEquals(HikingPage.firstItemPriceValue, ItemPage.price);
        Assert.assertEquals(HikingPage.rating.substring(0, HikingPage.rating.length() - 1), ItemPage.rating);
    }

    @And("when clicking add to cart notification should be present and quantity should be 1")
    public void addToCartAndCheckNotification() {
        ItemPage.addToCartButton.click();
        ItemPage.confirmAlert.shouldBe(Condition.visible);
        ItemPage.cartQuantity.shouldBe(Condition.visible);
    }


}
