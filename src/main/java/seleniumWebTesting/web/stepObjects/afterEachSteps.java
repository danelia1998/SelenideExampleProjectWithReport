package seleniumWebTesting.web.stepObjects;

import com.codeborne.selenide.Selenide;

public class afterEachSteps {

    public void closeBrowserAndClearCookies() {

        Selenide.clearBrowserCookies();
        Selenide.close();
    }
}
