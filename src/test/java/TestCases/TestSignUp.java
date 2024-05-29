package TestCases;

import Pages.*;
import Utilities.DataSet;
import Utilities.webdriverSetup;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUp extends webdriverSetup {

    HomePage homePage=new HomePage();

    SignUpPage signUpPage=new SignUpPage();
    MyCart myCart=new MyCart();
    BasicPage basicPage=new BasicPage();
    @Test
    public void TestSignUpWithValid_Credentials() throws InterruptedException{
        getBrowser().get(homePage.URL);
        Thread.sleep(3000);
        homePage.clickOnElement(homePage.LoginBtn);
        signUpPage.writeOnElement(signUpPage.FullNameInputBox, signUpPage.FullName);
        signUpPage.writeOnElement(signUpPage.EmailInputBoxSignUp, signUpPage.EmailforSignUp);
        signUpPage.writeOnElement(signUpPage.ContactInputBox, signUpPage.ContactNo);
        signUpPage.writeOnElement(signUpPage.PasswordInputBoxSignUp, signUpPage.PasswordforSignUp);
        signUpPage.writeOnElement(signUpPage.ConfirmInputBox, signUpPage.ConfirmPassword);
        Thread.sleep(3000);
        signUpPage.clickOnElement(signUpPage.SignUpBtn);
        Thread.sleep(3000);
        //signUpPage.ShowAlert();
        Thread.sleep(3000);
    }

    @Test(dataProvider = "Signupwithinvalidcredentials",dataProviderClass = DataSet.class,description="User Sign Up With Invalid Credentials")
    @Description("Test Add Using allure: User Sign Up With Invalid Credentials")

    public void TestSignUpWithInValid_Credentials(String FullName, String email,String ContactNo, String password,String confirmPassword,String errormessage) throws InterruptedException{
        getBrowser().get(homePage.URL);
        Thread.sleep(3000);
        homePage.clickOnElement(homePage.LoginBtn);
        signUpPage.addScreenshot("Before Sign Up");
        signUpPage.writeOnElement(signUpPage.FullNameInputBox,FullName);
        signUpPage.writeOnElement(signUpPage.EmailInputBoxSignUp, email);
        signUpPage.writeOnElement(signUpPage.ContactInputBox, ContactNo);
        signUpPage.writeOnElement(signUpPage.PasswordInputBoxSignUp, password);
        signUpPage.writeOnElement(signUpPage.ConfirmInputBox, confirmPassword);
        Thread.sleep(3000);
        signUpPage.clickOnElement(signUpPage.SignUpBtn);
        signUpPage.addScreenshot("After Sign Up");
        //String Message=signUpPage.getElement(signUpPage.FullNameInputBox).getAttribute("validationMessage");
        //System.out.println(Message);
        Thread.sleep(3000);
        //signUpPage.ShowAlert();
        Thread.sleep(3000);
    }

}
