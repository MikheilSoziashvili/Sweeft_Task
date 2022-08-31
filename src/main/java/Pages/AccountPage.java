package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AccountPage {

    public static final SelenideElement myOrders = $x("//a[text() = 'My Orders']");
    public static final String orderNumber = $x("//tr[1]//td[@class = 'col id']").getText();
    public static final String total = $x("//tr[1]/td[@class = 'col total']/span").getText();
}
