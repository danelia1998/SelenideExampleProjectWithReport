package seleniumWebTesting.web.stepObjects;

import io.qameta.allure.Step;
import seleniumWebTesting.web.pageObjects.CommunityGroups;

import static com.codeborne.selenide.Selenide.$;
import static seleniumWebTesting.web.dataObjects.CommunityGroupsData.indexOfOpenedMeme;

public class CommunityGroupsSteps extends CommunityGroups {

    @Step
    public void enterCommunitySection() {

        $(enterMessagePage).click();
    }

    @Step
    public void searchingCommunity(String groupName) {

        $(searchGroupField).setValue(groupName);
        $(searchGroupButton).click();
    }

    @Step
    public void choosingCommunity() {
        $(chooseGroupByName).click();
    }

    public void openingPicByIndexWithTiming(Integer howMuch,Integer howTime) throws InterruptedException {
        for (int i = 0; i < howMuch; i++) {
            $(".wall_post_cont",indexOfOpenedMeme + i).click();
            Thread.sleep(howTime * 1000);
            $(closePic).click();
        }
    }

}
