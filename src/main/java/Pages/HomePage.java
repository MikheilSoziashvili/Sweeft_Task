package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    public static final SelenideElement signIn = $x("//a[contains(text(), 'Sign In')]");
    public static final SelenideElement createAccount = $x("//a[text() = 'Create an Account']");
    public static final SelenideElement whatsNew = $x("//a[@id = 'ui-id-3']/span[starts-with(text(), 'What')]");
    public static final SelenideElement women = $x("//a[@id = 'ui-id-4']/span[text() = 'Women']");
    public static final SelenideElement men = $x("//a[@id = 'ui-id-5']/span[text() = 'Men']");
    public static final SelenideElement gear = $x("//a[@id = 'ui-id-6']/span[text() = 'Gear']");
    public static final SelenideElement training = $x("//a[@id = 'ui-id-7']/span[text() = 'Training']");
    public static final SelenideElement sale = $x("//a[@id = 'ui-id-8']/span[text() = 'Sale']");
    public static final SelenideElement bags = $x("//a[@id = 'ui-id-25']/span[text() = 'Bags']");

}
