package Pages;

import static com.codeborne.selenide.Selenide.$x;

public class TopCartLogo {
    public static final String totalPrice = $x("//div[@id='minicart-content-wrapper']//div[@class='amount price-container']//span[@class='price']").getText();
    public static final String itemPrice = $x("//div[@class='product-item-details']//div[@class='price-container']//span[@class='price']").getText();
    public static final String itemName = $x("//div[@class='product-item-details']//a[contains(text(), 'Strive Shoulder Pack')]").getText();
    public static final String itemNameValue = itemName;

}
