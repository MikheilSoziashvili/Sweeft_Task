package Pages;

import Data.Constants;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {

    public static final SelenideElement orderList = $x("//div[@class='title']");
    public static final SelenideElement productName = $x("//strong[text() = 'Strive Shoulder Pack']");
    public static final SelenideElement emailField = $x("//fieldset[@id='customer-email-fieldset']//input[@id='customer-email']");
    public static final SelenideElement transportation = $x("//input[@type='radio' and @value='flatrate_flatrate']");


    public static final SelenideElement firstName = $x("//input[@name='firstname']");
    public static final SelenideElement lastName = $x("//input[@name='lastname']");
    public static final SelenideElement street = $x("//input[@name='street[0]']");
    public static final SelenideElement city = $x("//input[@name='city']");
    public static final SelenideElement state = $x("//select[@name='region_id']");
    public static final SelenideElement zip = $x("//input[@name='postcode']");
    public static final SelenideElement phone = $x("//input[@name='telephone']");

    public static final SelenideElement next = $x("//div[@id='shipping-method-buttons-container']//button");
}
