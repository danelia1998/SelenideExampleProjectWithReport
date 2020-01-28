package seleniumWebTesting.web.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static seleniumWebTesting.web.dataObjects.CommunityGroupsData.*;

public class CommunityGroups {

    protected SelenideElement
            enterMessagePage = $(byText("Communities")),
            searchGroupField = $(".ui_search_field"),
            searchGroupButton = $(".ui_search_button_search"),
            chooseGroupByName = $(byText(communityName)),
            closePic = $(".pv_close_btn");



}
