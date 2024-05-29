package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static Utilities.webdriverSetup.getBrowser;

public class HomePage extends BasicPage{

    public String URL="http://localhost/shopping/";

    //public By LoginBtn=By.cssSelector("a[href=\"login.php\"]");
    public By LoginBtn= By.linkText("Login");
    public By AddToCartBtn=By.xpath("//div[@id='all']//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//div[1]//div[3]//a[1]");











}
