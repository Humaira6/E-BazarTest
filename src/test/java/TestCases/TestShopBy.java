package TestCases;

import Pages.*;
import Utilities.DataSet;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestShopBy extends webdriverSetup {

    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    MyCart myCart = new MyCart();
    BasicPage basicPage = new BasicPage();
    ShopByPage shopByPage = new ShopByPage();

    @Test
    public void ShopByFreshVegetables() throws InterruptedException {
        getBrowser().get(homePage.URL);
        Thread.sleep(3000);
        homePage.clickOnElement(shopByPage.FreshVegetables);
        getBrowser().navigate().to("http://localhost/shopping/category.php?cid=1");
        Thread.sleep(3000);

    }

    @Test
    public void ShopByFunction() throws InterruptedException {
        getBrowser().get(homePage.URL);
        Thread.sleep(3000);


        homePage.clickOnElement(shopByPage.Fruits);
        Thread.sleep(3000);


        getBrowser().navigate().to("http://localhost/shopping/category.php?cid=1");
        Thread.sleep(3000);


    }


}
