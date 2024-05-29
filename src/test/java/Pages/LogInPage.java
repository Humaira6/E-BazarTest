package Pages;

import org.openqa.selenium.By;

public class LogInPage extends BasicPage {
    public String Email="hellouser@gmail.com";
    public String Password="hello";

    public By EmailInputBox=By.id("exampleInputEmail1");
    public By PasswordInputBox=By.id("exampleInputPassword1");

    public By LoginOrSignUpButton=By.xpath("//button[@name='login']");

    public By ErrorMsg=By.xpath("//span[normalize-space()='Invalid email id or Password']");



}
