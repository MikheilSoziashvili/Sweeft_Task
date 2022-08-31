package SetUp;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.open;

public class SetupClass {
    @BeforeSuite
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 7000;
    }
}
