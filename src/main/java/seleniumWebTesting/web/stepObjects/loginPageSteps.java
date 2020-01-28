package seleniumWebTesting.web.stepObjects;


import io.qameta.allure.Step;
import seleniumWebTesting.web.pageObjects.loginPage;

import static com.codeborne.selenide.Selenide.$;
import static seleniumWebTesting.web.dataObjects.UserData.password;
import static seleniumWebTesting.web.dataObjects.UserData.username;

public class loginPageSteps extends loginPage {

    @Step
    public void changeLanguage() {

        $(changeLanguageButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }

    @Step("login by using username :{0} and password : {1}")
    public void successfulLogin(String username,String password) {

        $(usernameInput).setValue(username);
        $(passwordInput).setValue(password);
        $(logInButton).click();

    }

    @Step
    public void logginIntoSystem(String username, String password) {

        open();
        changeLanguage();
        successfulLogin(username, password);
    }
}
