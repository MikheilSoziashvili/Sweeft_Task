package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {
    public static final String firstName = $x("//input[@id='firstname']").getValue();
    public static final String lastName = $x("//input[@id='lastname']").getValue();
    public static final String email = $x("//input[@id='email_address']").getValue();
    public static final SelenideElement password = $x("//input[@id='password']");
    public static final SelenideElement repeatPassword = $x("//input[@id='password-confirmation']");
    public static final SelenideElement strongPasswordSpan = $x("//span[@id='password-strength-meter-label']");
    public static final SelenideElement createAccount = $x("//button[@title='Create an Account']");
}
