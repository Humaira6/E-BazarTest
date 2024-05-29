package Utilities;

import Pages.BasicPage;
import Pages.SignUpPage;
import org.openqa.selenium.remote.http.Message;
import org.testng.annotations.DataProvider;

import static Utilities.webdriverSetup.getBrowser;


public class DataSet extends BasicPage {
    SignUpPage signUpPage=new SignUpPage();
//    String Message=signUpPage.getElement(signUpPage.FullNameInputBox).getAttribute("validationMessage");

    @DataProvider(name="InvalidCredentials")
    public static Object invalidData(){
        Object[][] data={{"","",""},
                         {"xagopot780@deligy.com","",""},
                         {"","123456aa",""},
                         {"xagopot780@deligy.com","123456",""},
                         {"abvfghe","123456aa",""},
                         {"abvfghe@gh","123456","Your email or password is incorrect!"}
        };
        return data;

    }

//
    @DataProvider(name="Signupwithinvalidcredentials")

    public static Object invalidDataforSignUp(){

        Object[][] data2={{"","","","","", ""},
                {"","xagopot780@deligy.com","01772978972","123456","123456",""},
                {"","xagopot780","01772978972","123456aa","123456aa",""},
                {"","xagopot780@deligy.com","01732934752","123456","1234564",""},
                {"abvfghe","123456aa@gmail","lk","","",""},
                {"abvfghe","123456zjh","01732934158","123456","123456",""}
        };
        return data2;



    }




}
