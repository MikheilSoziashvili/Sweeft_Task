package Pages;

import Data.Constants;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HikingPage {
    public static final String firstItemXpath = "//ol[@class = 'products list items product-items']/li[1]";

    public static final SelenideElement firstItemPrice = $x(firstItemXpath + "//span[@id = 'product-price-2']/span");
    public static final String firstItemPriceValue = $x(firstItemXpath + "//span[@id = 'product-price-2']/span").getText();
    public static final SelenideElement lastItemPrice = $x("//ol[@class = 'products list items product-items']/li[last()]//span[@id = 'product-price-6']/span");
    public static final SelenideElement addToCart = $x(firstItemXpath + "//button[@title = 'Add to Cart']");
    public static final SelenideElement addToWishlist = $x(firstItemXpath + "//a[@title = 'Add to Wish List']");
    public static final SelenideElement addToCompare = $x(firstItemXpath + "//a[@title = 'Add to Compare']");

    public static final SelenideElement name = $x(firstItemXpath + "//a[contains(text(), 'Strive Shoulder Pack')]");
    public static final String rating = $x(firstItemXpath + "//div[@title = '90%']//span[text() = '90%']").getText();

    public static final String itemName = name.getText();
}
