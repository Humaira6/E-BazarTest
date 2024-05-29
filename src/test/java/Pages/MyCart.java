package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static Utilities.webdriverSetup.getBrowser;

public class MyCart extends BasicPage {
    public String URL = "http://localhost/shopping/my-cart.php";
    public By AddToCartBtn = By.xpath("//div[@id='all']//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//div[1]//div[3]//a[1]");
    public By UpdateCartBtn = By.xpath("//input[@name='submit']");
    public By ShippingAddressBox = By.xpath("//textarea[@name='shippingaddress']");

    public By ShippingCityBox = By.xpath("//input[@id='shippingcity']");
    public By ItemPresent = By.cssSelector("input[name=\\\"remove_code[]\\\"]");

    public By ProceedToCheckOut = By.xpath("//button[@name='ordersubmit']");

    public By CartItemPresent = By.xpath("//th[@class='cart-romove item']");
    public String ShippingAddress = "Dhaka";
    public String ShippingCity = "Dhaka";
}
