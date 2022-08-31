package Steps;

import Pages.HomePage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class HomePageSteps {

    @When("User navigates to homepage of website")
    public void userNavigatesToHomepageOfWebsite() {
        open("https://magento.softwaretestingboard.com/");
    }

    @Then("Sign In and Create an account buttons are shown")
    public void signInAndCreateAnAccountButtonsAreShown() {
        HomePage.signIn.shouldBe(Condition.visible);
        HomePage.signIn.shouldBe(Condition.visible);
        HomePage.createAccount.shouldBe(Condition.visible);
    }

    @And("Navigation menu buttons are shown")
    public void navigation_menu_buttons_are_shown() {
        HomePage.whatsNew.shouldBe(Condition.visible);
        HomePage.women.shouldBe(Condition.visible);
        HomePage.men.shouldBe(Condition.visible);
        HomePage.gear.shouldBe(Condition.visible);
        HomePage.training.shouldBe(Condition.visible);
        HomePage.sale.shouldBe(Condition.visible);
    }
}
