package Data;

import java.util.Random;

import static Pages.CheckoutPage.transportation;
import static Pages.HikingPage.firstItemPrice;

public class Constants {
    public static final String email = "mikheilsoziashvili" + (new Random().nextInt(1000 - 10) + 10) + "@gmail.com";
    public static final String firstName = "mikheil";
    public static final String lastName = "soziashvili";
    public static final String streetName = "streetName 42a";
    public static final String city = "Tbilisi";
    public static final String state = "Alabama";
    public static final String zip = "12345";
    public static final String country = "United States";
    public static final String phone = "123456";
    public static final String password = "Mikheil"+ "-" + (new Random().nextInt(9999 - 1000) + 1000);
    public static String orderNumber = null;
    public static String itemPrice = null;
}
