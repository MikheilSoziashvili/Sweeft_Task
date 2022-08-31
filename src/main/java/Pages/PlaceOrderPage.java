package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PlaceOrderPage {
    public static final SelenideElement placeOrder = $x("//button[@title='Place Order']");
    public static final String orderTotal = $x("//td[@class='amount' and @data-th='Order Total']//span").getText();

    public static final SelenideElement orderNumber = $x("//div[@class='checkout-success']/p/span");
    public static final SelenideElement emailReceipt = $x("//div[@class='checkout-success']/p[contains(text(), 'order confirmation with details and tracking info')]");
    public static final SelenideElement createAccount = $x("//div[@id='registration']//a[@class='action primary']");
    public static final String receipt = $x("//div[@class='billing-address-details']").getText();
}
