package Pages;

import org.openqa.selenium.By;

public class LogInPage extends BasicPage {
    public String Email="hellouser@gmail.com";
    public String Password="hello";

    public By EmailInputBox=By.id("exampleInputEmail1");
    public By PasswordInputBox=By.id("exampleInputPassword1");

    public By LoginButton=By.xpath("//button[@name='login']");

    public By ErrorMsg=By.xpath("//span[normalize-space()='Invalid email id or Password']");

    public String FullName="Customer1";
    public String EmailforSignUp="customer1@gmail.com";

    public String ContactNo="01732934752";

    public String PasswordforSignUp="customer1";

    public String ConfirmPassword="customer1";

    public By FullNameInputBox=By.id("fullname");

    public By EmailInputBoxSignUp=By.id("email");
    public By ContactInputBox=By.id("contactno");

    public By PasswordInputBoxSignUp=By.id("password");

    public By ConfirmInputBox=By.id("confirmpassword");

    public By SignUpButton=By.xpath("//button[@id='submit']");

    public By ErrorMessage=By.xpath("//span[normalize-space()='Email already exists .']");




//    public boolean isEmailAlreadyExists(String email) {
//        // Logic to check if email exists in the system
//        // For now, let's assume we have a method to check in the database
//        // Replace this with your actual implementation
//        if (checkIfEmailExistsInDatabase(email)) {
//            ErrorMessage = "Email already exists.";
//            return true;
//        } else {
////            ErrorMessage = "";
//
//            LogInPage logInPage=new LogInPage();
//
//
//            logInPage.ShowAlert();
//            return false;
//        }
//    }private boolean checkIfEmailExistsInDatabase(String email) {
//        // Your logic to check if the email exists in the database
//        // Replace this with your actual implementation
//        // For demonstration, let's assume the email exists if it's equal to "existing@example.com"
//        return email.equals("existing@example.com");
//    }
//



}
