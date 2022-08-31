package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ItemPage {

    public static final SelenideElement addToCartButton = $x("//button[@id = 'product-addtocart-button']");
    public static final SelenideElement confirmAlert = $x("//div[contains(text(), 'You added Strive Shoulder Pack to your')]");
    public static final SelenideElement cartQuantity = $x("//span[@class='counter-number' and contains(text(), '1')]");
    public static final SelenideElement cart = $x("//a[@class='action showcart']");
    public static final SelenideElement proceedToCheckout = $x("//button[@id='top-cart-btn-checkout']");

    public static final String name = $x("//h1[@class='page-title']/span").getText();
    public static final String rating = $x("//div[@title = '90%']//span[@itemprop = 'ratingValue']").getText();
    public static final String price = $x("//span[@id = 'product-price-2']/span").getText();
}
