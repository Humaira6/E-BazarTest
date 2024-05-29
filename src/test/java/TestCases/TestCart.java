package TestCases;

import Pages.BasicPage;
import Pages.HomePage;
import Pages.MyCart;
import Utilities.webdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCart extends webdriverSetup {
    BasicPage basicPage = new BasicPage();
    HomePage homePage = new HomePage();
    MyCart myCart = new MyCart();
    TestLogin testLogin = new TestLogin();


    @Test
    public void addItemToCart() throws InterruptedException {
        getBrowser().get(homePage.URL);
        Thread.sleep(3000);
        Actions action = new Actions(getBrowser());
        action.scrollToElement(homePage.getElement(By.xpath("//div[@id='all']//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//div[1]//div[3]//a[1]"))).build().perform();
        Thread.sleep(3000);

        action.click(homePage.getElement(homePage.AddToCartBtn));
        action.scrollByAmount(0, 150).build().perform();
        Thread.sleep(4000);
        homePage.ShowAlert();
        Thread.sleep(4000);


    }

    @Test
    public void updateCartAfterLoginwithoutAddress() throws InterruptedException {
        testLogin.Testlogin();
        addItemToCart();
        myCart.isdisplay(myCart.CartItemPresent);
        Thread.sleep(3000);
        myCart.clickOnElement(myCart.UpdateCartBtn);
        Thread.sleep(3000);
        String Message = myCart.getElement(myCart.ShippingAddressBox).getAttribute("validationMessage");
        System.out.println(Message);
        Thread.sleep(3000);



}

@Test
public void updateCartwithoutlogin() throws InterruptedException {
    addItemToCart();
    myCart.isdisplay(myCart.CartItemPresent);
    Thread.sleep(3000);
    myCart.clickOnElement(myCart.UpdateCartBtn);
    Thread.sleep(3000);
    myCart.ShowAlert();
    Thread.sleep(3000);
    myCart.clickOnElement(myCart.ProceedToCheckOut);
    getBrowser().navigate().to("http://localhost/shopping/login.php");
    Thread.sleep(3000);


}

@Test
public void updateCartwithAddressAfterLogin() throws InterruptedException {

    testLogin.Testlogin();
    addItemToCart();
    myCart.isdisplay(myCart.CartItemPresent);
    Thread.sleep(3000);
    myCart.writeOnElement(myCart.ShippingAddressBox, myCart.ShippingAddress);
    myCart.writeOnElement(myCart.ShippingCityBox, myCart.ShippingCity);
    Thread.sleep(3000);
    myCart.clickOnElement(myCart.UpdateCartBtn);
    Thread.sleep(3000);

}
}
