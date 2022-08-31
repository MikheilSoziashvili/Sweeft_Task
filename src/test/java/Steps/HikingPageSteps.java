package Steps;

import Data.Constants;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Pages.GearPage.sortBy;
import static Pages.HikingPage.*;
import static com.codeborne.selenide.Selenide.actions;

public class HikingPageSteps {

    @Given("User sorts items by price")
    public void sortByPriceAndCheck() {
        sortBy.selectByValue("price");
    }

    @Then("first item should cost less then last")
    public void priceComparison() {
        Constants.itemPrice = firstItemPrice.getText();
        Assert.assertTrue(Integer.parseInt(firstItemPrice.getText().substring(1, firstItemPrice.getText().length() - 3)) < Integer.parseInt(lastItemPrice.getText().substring(1, lastItemPrice.getText().length() - 3)));
    }

    @When("User hovers on first item")
    public void hoverButtons() {
        actions().moveToElement(firstItemPrice).perform();
    }

    @Then("Add to Cart, Add to Wish List, Add to Compare buttons should be visible")
    public void buttons() {
        addToCart.shouldBe(Condition.visible);
        addToWishlist.shouldBe(Condition.visible);
        addToCompare.shouldBe(Condition.visible);
    }
}
