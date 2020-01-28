package seleniumWebTesting.web.stepObjects;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import seleniumWebTesting.web.pageObjects.MassagePage;

import static com.codeborne.selenide.Selenide.$;
import static seleniumWebTesting.web.dataObjects.UserData.massage;

public class MassagePageSteps extends MassagePage {

    @Step
    public void enterMassageSection() {
        $(enterMessagePage).click();
    }

    @Step
    public void searchPerson(String nameOfPerson) {
        $(searchNameField).setValue(nameOfPerson);
        $(firstPersonInList).shouldHave(Condition.text("David Danelia"));
        $(firstPersonInList).click();
    }

    @Step
    public void sendMassageToPerson(String massage) {
        $(inputMessageToPerson).click();
        $(inputMessageToPerson).setValue(massage).pressEnter();
    }
    @Step
    public void checkingIfMassageWasSendSuccessfully() {
        $(foundWrittenText);
    }
}