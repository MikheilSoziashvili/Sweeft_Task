package Steps;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static Pages.GearPage.*;
import static com.codeborne.selenide.Selenide.actions;

public class GearPageSteps {

    String bagsTextValue;

    @Given("User navigates to bags page")
    public void userNavigatesToPage() {
        actions().moveToElement(HomePage.gear).perform();
        bagsTextValue = HomePage.bags.getText();
        HomePage.bags.click();
    }

    @Then("breadcrumbs should be correctly written")
    public void breadcrumbsCheck() {
        List<String> orderOfClicks = new ArrayList<>();

        orderOfClicks.add("Home");
        orderOfClicks.add(HomePage.gear.getText());
        orderOfClicks.add(bagsTextValue);

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(breadCrumbs.get(i).getText(), orderOfClicks.get(i));
        }
    }

    @When("User chooses filter hiking in activity, amount should be same as shown in hiking")
    public void filterHiking() {
        activity.click();
        String nextToHikingCount = count.getText();
        hiking.click();
        Assert.assertEquals(Integer.parseInt(nextToHikingCount.substring(0, nextToHikingCount.length()-5)), itemCount.size());
    }
}
