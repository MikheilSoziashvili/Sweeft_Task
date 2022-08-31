package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class GearPage {
    public static final SelenideElement count = $x("//a[contains(text(), 'Hiking')]/span");
    public static final SelenideElement activity = $x("//div[text() = 'Activity']");
    public static final SelenideElement hiking = $x("//a[contains(text(), 'Hiking')]");
    public static final List<SelenideElement> breadCrumbs = $$x("//ul[@class='items']/li/*[last()]");
    public static final List<SelenideElement> itemCount = $$x("//li[@class = 'item product product-item']");
    public static final Select sortBy = new Select($(By.id("sorter")));
}
