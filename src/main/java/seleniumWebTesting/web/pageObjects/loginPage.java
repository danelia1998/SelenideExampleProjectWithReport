package seleniumWebTesting.web.pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static seleniumWebTesting.web.dataObjects.UrlData.loginPageUrl;

public class loginPage {
    public loginPage open() {
        Selenide.open(loginPageUrl);
        return this;
    }

    protected SelenideElement
            changeLanguageButton = $(byText("English")),
            logInButton = $(By.id("index_login_button")),
            usernameInput = $(By.id("index_email")),
            passwordInput = $(By.id("index_pass"));

}
