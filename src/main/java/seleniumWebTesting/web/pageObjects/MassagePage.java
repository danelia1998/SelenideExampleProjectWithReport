package seleniumWebTesting.web.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static seleniumWebTesting.web.dataObjects.UserData.*;

public class MassagePage {
    protected SelenideElement
        enterMessagePage = $(byText("Messages")),
        searchNameField = $(".im-page--dialogs-search.ui_search_custom .ui_search_field"),
        firstPersonInList = $("._im_dialog_link",0),
        inputMessageToPerson = $(".im_editable"),
        foundWrittenText = $(byText(massage));



}
