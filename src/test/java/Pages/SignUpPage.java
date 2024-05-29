package Pages;

import org.openqa.selenium.By;

public class SignUpPage extends BasicPage {
    public String FullName = "Customer1";
    public String EmailforSignUp = "customer1@gmail.com";

    public String ContactNo = "01732934752";

    public String PasswordforSignUp = "customer1";

    public String ConfirmPassword = "customer1";

    public By FullNameInputBox = By.id("fullname");

    public By EmailInputBoxSignUp = By.id("email");
    public By ContactInputBox = By.id("contactno");

    public By PasswordInputBoxSignUp = By.id("password");

    public By ConfirmInputBox = By.id("confirmpassword");


    public By SignUpBtn = By.xpath("//div[@class='col-md-6 col-sm-6 create-new-account']");

    public By ErrorMessage = By.xpath("//span[normalize-space()='Email already exists .']");


}
