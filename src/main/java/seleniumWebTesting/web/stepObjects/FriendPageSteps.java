package seleniumWebTesting.web.stepObjects;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import seleniumWebTesting.web.pageObjects.FriendPage;
import static com.codeborne.selenide.Selenide.$;
import static seleniumWebTesting.web.dataObjects.UserData.*;

public class FriendPageSteps extends FriendPage {

    @Step
    public void enterFriendsSection() {

        $(friendButton).click();
    }

    @Step
    public void searchPerson(String nameOfPerson) {

        $(friendNameInput).click();
        $(friendNameInputEnter).setValue(nameOfPerson);
        $(friendNameInput).pressEnter();
    }
    @Step
    public void checkIfItsExists(String checker) {

        $(foundPersonByName).shouldHave(Condition.text(checker));
    }
}
