package TestCases;

import Pages.BasicPage;
import Pages.HomePage;
import Pages.LogInPage;
import Pages.MyCart;
import Utilities.webdriverSetup;
import org.testng.annotations.Test;

public class TestCheckOut extends webdriverSetup {

    HomePage homePage=new HomePage();
    LogInPage logInPage=new LogInPage();
    MyCart myCart=new MyCart();
    BasicPage basicPage=new BasicPage();

    TestLogin testLogin=new TestLogin();

    TestCart testCart=new TestCart();



    @Test
    public void CheckOutWithoutAddress() throws InterruptedException {
        testLogin.Testlogin();
        testCart.addItemToCart();
        myCart.clickOnElement(myCart.ProceedToCheckOut);
        Thread.sleep(3000);
        String Message = myCart.getElement(myCart.ShippingAddressBox).getAttribute("validationMessage");
        System.out.println(Message);
        Thread.sleep(3000);



    }


}
