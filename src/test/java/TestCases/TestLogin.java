package TestCases;

import Pages.BasicPage;
import Pages.HomePage;
import Pages.LogInPage;
import Pages.MyCart;
import Utilities.DataSet;
import Utilities.webdriverSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends webdriverSetup {

    HomePage homePage=new HomePage();
    LogInPage logInPage=new LogInPage();
    MyCart myCart=new MyCart();
    BasicPage basicPage=new BasicPage();



    @Test
    public void Testlogin() throws InterruptedException {
       getBrowser().get(homePage.URL);
       Thread.sleep(3000);
       homePage.clickOnElement(homePage.LoginBtn);
       logInPage.writeOnElement(logInPage.EmailInputBox, logInPage.Email);
       logInPage.writeOnElement(logInPage.PasswordInputBox, logInPage.Password);
       Thread.sleep(3000);
       logInPage.clickOnElement(logInPage.LoginButton);
       getBrowser().navigate().to("http://localhost/shopping/my-cart.php");
       Thread.sleep(3000);


    }
    @Test
    public void TestSignUpWithValid_Credentials() throws InterruptedException{
        getBrowser().get(homePage.URL);
        Thread.sleep(3000);
        homePage.clickOnElement(homePage.LoginBtn);
        logInPage.writeOnElement(logInPage.FullNameInputBox, logInPage.FullName);
        logInPage.writeOnElement(logInPage.EmailInputBoxSignUp, logInPage.EmailforSignUp);
        logInPage.writeOnElement(logInPage.ContactInputBox, logInPage.ContactNo);
        logInPage.writeOnElement(logInPage.PasswordInputBoxSignUp, logInPage.PasswordforSignUp);
        logInPage.writeOnElement(logInPage.ConfirmInputBox, logInPage.ConfirmPassword);
        Thread.sleep(3000);
        logInPage.clickOnElement(logInPage.SignUpButton);
        Thread.sleep(3000);
        logInPage.ShowAlert();
        Thread.sleep(3000);
    }

    @Test
    public void TestSignUpWithInValid_Credentials() throws InterruptedException{
        getBrowser().get(homePage.URL);
        Thread.sleep(3000);
        homePage.clickOnElement(homePage.LoginBtn);
        logInPage.writeOnElement(logInPage.FullNameInputBox, logInPage.FullName);
        logInPage.writeOnElement(logInPage.EmailInputBoxSignUp, logInPage.EmailforSignUp);
        logInPage.writeOnElement(logInPage.ContactInputBox, logInPage.ContactNo);
        logInPage.writeOnElement(logInPage.PasswordInputBoxSignUp, logInPage.PasswordforSignUp);
        logInPage.writeOnElement(logInPage.ConfirmInputBox, logInPage.ConfirmPassword);
        Thread.sleep(3000);
        Assert.assertEquals(logInPage.getElement(logInPage.ErrorMessage).getText(),"Email already exists .");
        Assert.assertFalse(logInPage.displayStatus(logInPage.SignUpButton));
        Thread.sleep(3000);

    }

    @Test(dataProvider = "InvalidCredentials",dataProviderClass = DataSet.class)
    public void TestloginwithInValidCredentials(String username, String password, String errorMessage) throws InterruptedException {
        getBrowser().get(homePage.URL);
        Thread.sleep(3000);
        homePage.clickOnElement(homePage.LoginBtn);
        logInPage.writeOnElement(logInPage.EmailInputBox, username);
        logInPage.writeOnElement(logInPage.PasswordInputBox, password);
        Thread.sleep(3000);
        logInPage.clickOnElement(logInPage.LoginButton);
        Thread.sleep(3000);
        // Assert.assertEquals(logInPage.getElement(logInPage.errorMessage).getText(), "Your email or password is incorrect!");
        //Assert.assertFalse(homePage.displayStatus(homePage.LogoutBtn));

    }



}
