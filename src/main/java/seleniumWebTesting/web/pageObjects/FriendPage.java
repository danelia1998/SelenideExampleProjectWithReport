package seleniumWebTesting.web.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static seleniumWebTesting.web.dataObjects.UserData.*;

public class FriendPage {

    protected SelenideElement
            friendButton = $(byText("Friends")),
            friendNameInput = $(By.id("s_search")),
            friendNameInputEnter = $(By.id("s_search")),
            foundPersonByName = $(byText(foundPersonName));

}
